package com.example.kotlinmvvmfirebase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val hashmap = mutableMapOf<String,String>()
        hashmap.put("User1","smj")
        hashmap.put("User2","jia")
        hashmap.put("User3","play")
        hashmap.put("User4","mangae")

      FirebaseFirestore.getInstance()
          .collection("users")
          .add(hashmap)
          .addOnSuccessListener { it->

          }
          .addOnFailureListener {

          }.addOnCompleteListener{it->

          }


    }
}