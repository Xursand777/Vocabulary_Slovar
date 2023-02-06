package com.x7.vocabulary_slovar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x7.vocabulary_slovar.Room.User
import com.x7.vocabulary_slovar.Room.UserDao
import com.x7.vocabulary_slovar.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    lateinit var userDao: UserDao
    lateinit var arrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        userDao= Roommmmm.getroom(this@MainActivity3).userDao()

        val intent=intent

        val hammasi:User= intent.getSerializableExtra("hammasi") as User

        binding.textviewdescriptions.text="${hammasi.english} ${hammasi.uzbek} \n\n${hammasi.descriptions} "


//        var eng=intent.getStringExtra("eng")
//        var uzb=intent.getStringExtra("uzb")
//        var des=intent.getStringExtra("deskription")
//        binding.textviewdescriptions.text="$eng $uzb\n\n$des"




    }
}