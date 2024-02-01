package com.example.day22adapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var arrayOfUsers: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val listView = findViewById<ListView>(R.id.listView)
       val name = arrayOf("Harsh","shivam","raman","sakshi","prakash")
        val msg = arrayOf("I'm doing good","How are you??","that's niceee","let me know","will meet soon")
        val lastMsgTime = arrayOf("4:30pm","6:05am","5:40am","7:34pm","2:11am")
        val phoneNumber = arrayOf("1234567892","9876543211","234567865","9898765431","1276895436")
        val imageId = intArrayOf(R.drawable.profile3,R.drawable.profile ,R.drawable.profile4,
            R.drawable.profile2,R.drawable.profile5)


        arrayOfUsers = ArrayList()

        for (eachItem in name.indices){
            val user = User(name[eachItem],msg[eachItem],lastMsgTime[eachItem],phoneNumber[eachItem],imageId[eachItem])
            arrayOfUsers.add(user)
        }
    listView.isClickable = true
        listView.adapter= MyAdapter(this,arrayOfUsers)


        listView.setOnItemClickListener { parent, view, position, id ->

            val userName = name[position]
            val userPhone = phoneNumber[position]
            val imageId = imageId[position]

            val i =Intent(this,UserActivity::class.java)

            i.putExtra("name",userName)
            i.putExtra("userPhone",userPhone)
            i.putExtra("imageId",imageId)
          startActivity(i)


        }




    }
}