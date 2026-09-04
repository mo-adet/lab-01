package com.example.PetShop

class Happy(name: String, date: String): Mood(name, date) {
    override fun currentMood(): String {
        return "$name is happy on $date! :)"
    }
}