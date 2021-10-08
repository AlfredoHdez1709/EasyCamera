package dev.ahrsoft.camera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import dev.ahrsoft.easycamera.EasyCamera

class MainActivity : AppCompatActivity() {

    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        btn.setOnClickListener {
            EasyCamera.start(context = this)
        }
    }
}