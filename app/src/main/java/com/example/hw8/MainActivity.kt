package com.example.hw8

import UsersAdapter
import UsersModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UsersAdapter
    var arrayList: ArrayList<UsersModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillRecicler()
        binding.reciclerView.adapter = adapter
    }

    private fun fillRecicler() {
        arrayList.add(UsersModel("Java",34, R.drawable.java))
        arrayList.add(UsersModel("Kotlin",23,R.drawable.kotlin))
        arrayList.add(UsersModel("Python",54,R.drawable.python))
        arrayList.add(UsersModel("CSS",43,R.drawable.css))
        arrayList.add(UsersModel("HTML",25,R.drawable.html))
        arrayList.add(UsersModel("C#",26,R.drawable.img))
        arrayList.add(UsersModel("SQL",32,R.drawable.sql))
        arrayList.add(UsersModel("C++",28,R.drawable.cplus))
        arrayList.add(UsersModel("Swift",22,R.drawable.swift))
        adapter = UsersAdapter(arrayList)
        binding.reciclerView.adapter
    }
}
