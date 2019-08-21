package com.gmail.supajeew.parking

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.update_button).setOnClickListener {
            addName(it)
        }
        findViewById<Button>(R.id.delete_button).setOnClickListener {
            delName(it)
        }
    }

    private fun addName(view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val nameTextView = findViewById<TextView>(R.id.no_available1_view)

        nameTextView.text = nameEditText.text
//        nameEditText.visibility = View.GONE
//        view.visibility = View.GONE
//
//        nameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private  fun delName(view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_edit)
        val licenseEditText = findViewById<EditText>(R.id.license_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameTextView = findViewById<TextView>(R.id.no_available1_view)
        nameTextView.text = "no available"



    }
}
