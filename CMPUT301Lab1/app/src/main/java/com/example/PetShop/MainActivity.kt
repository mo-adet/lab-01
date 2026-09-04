package com.example.PetShop

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cat = Cat("Coco", 6)
        val cat_mood = Sad("Coco", "May 1st")

        val dog = Dog("Mochi", 6)
        val dog_mood = Happy("Mochi", "April 2nd")

        val scorpion = Scorpion("Stinger", 32)
        val scorpion_mood = Sad("Stinger", "June 23rd")

        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)
    }
}

