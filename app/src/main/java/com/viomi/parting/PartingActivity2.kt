package com.viomi.parting

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.viomi.parting.databinding.GridviewMainBinding
import kotlin.random.Random

class PartingActivity2 : AppCompatActivity() {
    var tag="PartingActivity2_tag"
    var gridView: GridView? = null
    private var playerNames = arrayOf("Cristiano Ronaldo", "Joao Felix", "Bernado Silva", "Andre Silve", "Bruno Fernandez", "William Carvalho", "Nelson Semedo", "Pepe", "Rui Patricio")
    private var playerImages = intArrayOf(R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val blind = GridviewMainBinding.inflate(layoutInflater)
        setContentView(blind.root)

        gridView = blind.gridView
        val mainAdapter = MyAdapter(this, playerNames, playerImages)
        blind.gridView.adapter = mainAdapter
        blind.gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(applicationContext, "You CLicked " + playerNames[+position],
                    Toast.LENGTH_SHORT).show()
            Log.d(tag,"You CLicked ${playerNames[position]}")
        }
    }//end oncreate

}