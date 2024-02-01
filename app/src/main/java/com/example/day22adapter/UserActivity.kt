package com.example.day22adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        val nameTv = findViewById<TextView>(R.id.tvName)
        val phoneTv = findViewById<TextView>(R.id.tvNumber)
        val imageId = findViewById<CircleImageView>(R.id.profile_image)



        val name = intent.getStringExtra("name")
        val phoneNumber = intent.getStringExtra("userPhone")
        val image = intent.getIntExtra("imageId",R.drawable.profile)

        nameTv.text = "Name: $name"
        phoneTv.text = "Contact Number: $phoneNumber"
        imageId.setImageResource(image)

    }
}