package com.example.mimec24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mimec24.databinding.ActivityMainBinding

class inicioM : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(InicioNM())

        binding.bottomNavigationView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home-> replaceFragment(inicioM())
                R.id.maps-> replaceFragment(MapaM())
                R.id.agregar-> replaceFragment(agregar())
                R.id.chat -> replaceFragment(chat())
                R.id.profile -> replaceFragment(PerfilM())

                else->{

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}