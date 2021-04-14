package com.viomi.parting

import android.R.attr.button
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.viomi.parting.databinding.ActivityParting1Binding


/**
 * purper #FFBB86FC
 * white #FFFFFFFF
 */
class PartingActivity1 : AppCompatActivity() ,View.OnClickListener{
    private val tag="PartingActivity1_tag"
    private var flag=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val blind=ActivityParting1Binding.inflate(layoutInflater)
        setContentView(blind.root)
//        Log.d(tag,"oncreate, purper color is ${getBackgroundColor(blind.button1)}")
//        blind.button1.setBackgroundColor(Color.parseColor("#FFBB86FC"));
//        val btnBcakground=blind.button1.background;
//        Log.d(tag,"btnBcakground:$btnBcakground")
//        val color = (blind.button1.getBackground() as ColorDrawable).color
//        Log.d(tag,"btn1:purper:$color")
//        Log.d(tag,"btn2:white:${(blind.button2.getBackground() as ColorDrawable).color}")
        blind.button10.setOnClickListener {
            var btnList= listOf(blind.button1,blind.button2,blind.button3,blind.button4,blind.button5,blind.button6,blind.button7,blind.button8,blind.button9)
            var chooseNum=0
            for (btn in btnList){
                if(getBackgroundColor(btn)!=-16777216) chooseNum++
            }
            Toast.makeText(this,"have chosen $chooseNum parking",Toast.LENGTH_LONG)
            Log.i(tag,"have chosen $chooseNum parking")
        }
        blind.button1.setOnClickListener(this)
        blind.button2.setOnClickListener(this)
        blind.button3.setOnClickListener(this)
        blind.button4.setOnClickListener(this)
        blind.button5.setOnClickListener(this)
        blind.button6.setOnClickListener(this)
        blind.button7.setOnClickListener(this)
        blind.button8.setOnClickListener(this)
        blind.button9.setOnClickListener(this)
    }//end oncreate

    fun getBackgroundColor(view: View): Int {
        var bgColor = Color.parseColor("#000000")
        if (view.background is ColorDrawable) {
            val colorDrawable = view.background as ColorDrawable
            bgColor = colorDrawable.color
        }
        return bgColor
    }

    override fun onClick(v: View?) {
        if (v != null&&getBackgroundColor(v)==-16777216) {
            v.setBackgroundColor(getResources().getColor(R.color.white))
            Log.d(tag,"choose ${v.id.toString()}")
//            when(flag){
//                true -> {
//                    v.setBackgroundColor(getResources().getColor(R.color.white))
//                    flag=false
//                }
//                false -> {
//                    v.setBackgroundColor(getResources().getColor(R.color.purple_200))
//                    flag=true
//                }
//            }
        }//end 选择位置
        if (v != null&&getBackgroundColor(v)!=-16777216)
        {
            v.setBackgroundColor(16777216)
        }
    }//end onclick

}