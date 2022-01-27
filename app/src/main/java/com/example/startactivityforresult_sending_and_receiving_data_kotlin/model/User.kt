package com.example.startactivityforresult_sending_and_receiving_data_kotlin.model

import java.io.Serializable

class User(val name:String,val age:Int, val gender:Char):Serializable {
    override fun toString(): String {
        return "User(name='$name', age=$age, gender=$gender)"
    }
}