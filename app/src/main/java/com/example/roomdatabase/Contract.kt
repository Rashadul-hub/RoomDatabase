package com.example.roomdata

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contact")
data class Contract (

    @PrimaryKey(autoGenerate = true)
    val id : Long,

    val name : String,
    val phone : String

        )