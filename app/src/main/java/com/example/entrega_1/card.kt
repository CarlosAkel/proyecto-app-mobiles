package com.example.entrega_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)


        val btncard = findViewById<Button>(R.id.to_cards)
        val btnroom = findViewById<Button>(R.id.to_rooms)
        val btndeck = findViewById<Button>(R.id.to_deck)
        btncard.setOnClickListener { replaceFragment(cards_show()) }
        btnroom.setOnClickListener { replaceFragment(rooms()) }
        btndeck.setOnClickListener { replaceFragment(deck_type()) }

    }
    private fun loadFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

}