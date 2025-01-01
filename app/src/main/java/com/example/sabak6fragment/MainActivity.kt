package com.example.sabak6fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.sabak6fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val Fragment1 = ExampleFirstFragment()
        val Fragment2 = ExampleSecondFragment()
         binding.btnFirstFragment.setOnClickListener{
             supportFragmentManager.beginTransaction().add(binding.ShowFragment.id, Fragment1).commit()
         }
        binding.btnSecondFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(binding.ShowFragment.id, Fragment2).commit()
        }

        binding.btnRemoveFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().remove(Fragment1).commit()
            supportFragmentManager.beginTransaction().remove(Fragment2).commit()
        }

    }
}