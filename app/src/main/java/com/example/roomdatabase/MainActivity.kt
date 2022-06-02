package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.roomdata.Contract
import com.example.roomdata.ContractDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var database : ContractDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(
            applicationContext, ContractDatabase::class.java, "contactDB"
        ).build()

        GlobalScope.launch {
            database.contractDao().insertContact(Contract(0,"HIMU","001"))
        }
    }
}