package com.falanper.randomicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.falanper.randomicos.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // activity_main ==>> ActivityMainBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        binding.buttonRandom.setOnClickListener(this)
        binding.textNumber.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.buttonRandom || view?.id == R.id.textNumber) {
            binding.textNumber.text = random().toString()
        }
    }

    fun random(): Int {
        return Random.nextInt(1,61)
    }
}
