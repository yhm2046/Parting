package com.viomi.parting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.viomi.parting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val tag="MainActivity_tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvParting1.setOnClickListener {
            startActivity(Intent(this,PartingActivity1::class.java))
        }
        binding.tvParting2.setOnClickListener { startActivity(Intent(this,PartingActivity2::class.java)) }
    }
}