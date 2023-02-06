package com.x7.vocabulary_slovar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x7.vocabulary_slovar.Room.User
import com.x7.vocabulary_slovar.Room.UserDao
import com.x7.vocabulary_slovar.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    lateinit var userDao: UserDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        userDao= Roommmmm.getroom(this@MainActivity2).userDao()

        binding.imageviewSave.setOnClickListener {
            var user= User(0,binding.edittexteng.text.toString(),binding.edittextuzb.text.toString(),binding.edittextdescription.text.toString())
            userDao.insertUser(user)
        }



    }
}