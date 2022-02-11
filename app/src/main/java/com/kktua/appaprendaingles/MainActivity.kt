package com.kktua.appaprendaingles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kktua.appaprendaingles.databinding.ActivityMainBinding
import com.kktua.appaprendaingles.ui.animals.AnimalsFragment
import com.kktua.appaprendaingles.ui.numbers.NumbersFragment
import com.kktua.appaprendaingles.ui.vowels.VowelsFragment
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureTabLayout()
    }

    private fun configureTabLayout() {
        supportActionBar?.elevation = 0f

        var adapter = FragmentPagerItemAdapter(
            supportFragmentManager,
            FragmentPagerItems.with(this)
                .add("Bichos", AnimalsFraggitment::class.java)
                .add("Números", NumbersFragment::class.java)
                .add("Vogais", VowelsFragment::class.java)
                .create()
        )
        binding.viewPager.adapter = adapter
        binding.smartTabLayout.setViewPager(binding.viewPager)
    }
}