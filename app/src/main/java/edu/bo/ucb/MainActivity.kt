package edu.bo.ucb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private val btnRed:Button
        get()=findViewById(R.id.btn_red)
    private val btnYellow:Button
        get()=findViewById(R.id.btn_yellow)
    private val layoutPrincipal:ConstraintLayout
        get()=findViewById(R.id.layoutPrincipal)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRed.setOnClickListener{
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        btnYellow.setOnClickListener{
            layoutPrincipal.setBackgroundColor(Color.YELLOW)
        }
    }
}