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
        /**
         * Callback method to be invoked when an item in this AdapterView has
         * been clicked.
         * <p>
         * Implementers can call getItemAtPosition(position) if they need
         * to access the data associated with the selected item.
         *
         * @param parent The AdapterView where the click happened.
         * @param view The view within the AdapterView that was clicked (this
         *            will be a view provided by the adapter)
         * @param position The position of the view in the adapter.
         * @param id The row id of the item that was clicked.
         */
        blind.gridView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            Toast.makeText(applicationContext, "You CLicked " + playerNames[+position],
//                    Toast.LENGTH_SHORT).show()
//            view.setBackgroundColor(Color.RED)
            view.setBackgroundResource(R.drawable.ic_launcher_foreground)
            Log.d(tag,"parent:$parent,view:$view,position:$position,id:$id")
            Log.d(tag,"You CLicked ${playerNames[position]}")
        }
    }//end oncreate

}