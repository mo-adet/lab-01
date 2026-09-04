package com.example.PetShop

class Sad(name: String, date: String): Mood(name, date) {

    override fun currentMood(): String {
        return "$name is sad on $date :("

    }
}