package com.example.roomdata

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Contract::class], version = 1)
abstract class ContractDatabase : RoomDatabase (){

    abstract fun contractDao(): ContractDAO

}