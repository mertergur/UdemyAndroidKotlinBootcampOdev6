package com.example.odev6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.odev6.databinding.ActivityMainBinding
import com.example.odev6.ui.fragment.BaseFragment
import com.example.odev6.ui.fragment.CampaignsFragment
import com.example.odev6.ui.fragment.MainFragment
import com.example.odev6.ui.fragment.ProfileFragment
import com.example.odev6.ui.fragment.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.background = null
        binding.bottomNavigationView.menu.getItem(2).isEnabled = false

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.mainFragment -> replaceFragment(MainFragment())
                R.id.searchFragment -> replaceFragment(SearchFragment())
                R.id.profileFragment -> replaceFragment(ProfileFragment())
                R.id.campaignsFragment -> replaceFragment(CampaignsFragment())

                else -> {
                }
            }
            true
        }

        binding.fab.setOnClickListener {
            replaceFragment(BaseFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navHostFragment1,fragment)
        fragmentTransaction.commit()
    }

}