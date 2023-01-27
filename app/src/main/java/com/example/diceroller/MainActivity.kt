package com.example.diceroller
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Creating a binding object for the main_activity.xml layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rollButton: Button = binding.rollButton
        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice rolled", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        return binding.diceImage.setImageResource(
            when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
    }
}