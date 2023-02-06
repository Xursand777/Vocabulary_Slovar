package com.x7.vocabulary_slovar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.x7.vocabulary_slovar.Room.AppDatabase
import com.x7.vocabulary_slovar.Room.Constants.TABLE_NAME
import com.x7.vocabulary_slovar.Room.User
import com.x7.vocabulary_slovar.Room.UserDao
import com.x7.vocabulary_slovar.Roommmmm.getroom
import com.x7.vocabulary_slovar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var userDao: UserDao
    var arrayList=ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        userDao=getroom(this@MainActivity).userDao()

        arrayList= userDao.getAllUsers() as ArrayList<User>


        binding.imageviewadd.setOnClickListener {
            val intent =Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)


        }



        binding.recyclerview1.layoutManager=LinearLayoutManager(this@MainActivity)
        val slovarAdapter=SlovarAdapter(this@MainActivity,arrayList,)
        binding.recyclerview1.adapter=slovarAdapter

    }
}