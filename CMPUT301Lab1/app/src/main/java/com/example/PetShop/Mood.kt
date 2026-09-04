package com.example.PetShop

abstract class Mood(val name: String, val date: String){
    abstract fun currentMood(): String
}