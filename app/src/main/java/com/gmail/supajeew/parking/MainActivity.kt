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

        findViewById<Button>(R.id.p1_button).setOnClickListener {
            parkingSlot1(it)
            visibleTextP1(it)
            invisibleTextP2(it)
           invisibleTextP3(it)
            findViewById<Button>(R.id.update_button).setOnClickListener {
                addNameP1(it)
            }
            findViewById<Button>(R.id.delete_button).setOnClickListener {
                delNameP1(it)
            }
        }

        findViewById<Button>(R.id.p2_button).setOnClickListener {
            parkingSlot2(it)
            visibleTextP2(it)
            invisibleTextP1(it)
            invisibleTextP3(it)
            findViewById<Button>(R.id.update_button).setOnClickListener {
                addNameP2(it)
            }
            findViewById<Button>(R.id.delete_button).setOnClickListener {
                delNameP2(it)
            }
        }

        findViewById<Button>(R.id.p3_button).setOnClickListener {
            parkingSlot3(it)
            visibleTextP3(it)
            invisibleTextP1(it)
            invisibleTextP2(it)
            findViewById<Button>(R.id.update_button).setOnClickListener {
                addNameP3(it)
            }
            findViewById<Button>(R.id.delete_button).setOnClickListener {
                delNameP3(it)
            }
        }
    }


    private fun addNameP1(view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_p1_edit)
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

    private fun delNameP1(view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_p1_edit)
        val licenseEditText = findViewById<EditText>(R.id.license_p1_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_p1_edit)
        val nameTextView = findViewById<TextView>(R.id.no_available1_view)

        nameTextView.text = "no available"
        nameEditText.setText("");
        licenseEditText.setText("");
        brandEditText.setText("");
    }


    private fun addNameP2(view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_p2_edit)
        val nameTextView = findViewById<TextView>(R.id.no_available2_view)

        nameTextView.text = nameEditText.text
//        nameEditText.visibility = View.GONE
//        view.visibility = View.GONE
//
//        nameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun delNameP2(view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_p2_edit)
        val licenseEditText = findViewById<EditText>(R.id.license_p2_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_p2_edit)
        val nameTextView = findViewById<TextView>(R.id.no_available2_view)

        nameTextView.text = "no available"
        nameEditText.setText("");
        licenseEditText.setText("");
        brandEditText.setText("");
    }


    private fun addNameP3(view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_p3_edit)
        val nameTextView = findViewById<TextView>(R.id.no_available3_view)

        nameTextView.text = nameEditText.text
//        nameEditText.visibility = View.GONE
//        view.visibility = View.GONE
//
//        nameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun delNameP3(view: View) {
        val nameEditText = findViewById<EditText>(R.id.name_p3_edit)
        val licenseEditText = findViewById<EditText>(R.id.license_p3_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_p3_edit)
        val nameTextView = findViewById<TextView>(R.id.no_available3_view)

        nameTextView.text = "no available"
        nameEditText.setText("");
        licenseEditText.setText("");
        brandEditText.setText("");
    }


    private fun parkingSlot1(view: View) {
        val parkingView = findViewById<TextView>(R.id.Parking_view)
        val p1Button = findViewById<Button>(R.id.p1_button)
        parkingView.text = p1Button.text
    }

    private fun parkingSlot2(view: View) {
        val parkingView = findViewById<TextView>(R.id.Parking_view)
        val p2Button = findViewById<Button>(R.id.p2_button)
        parkingView.text = p2Button.text
    }

    private fun parkingSlot3(view: View) {
        val parkingView = findViewById<TextView>(R.id.Parking_view)
        val p3Button = findViewById<Button>(R.id.p3_button)
        parkingView.text = p3Button.text
    }

    private fun invisibleTextP1(view: View) {
        val nameP1 = findViewById<EditText>(R.id.name_p1_edit)
        val licenseP1 = findViewById<EditText>(R.id.license_p1_edit)
        val brandP1 = findViewById<EditText>(R.id.brand_p1_edit)

        nameP1.visibility = View.INVISIBLE
        licenseP1.visibility = View.INVISIBLE
        brandP1.visibility = View.INVISIBLE
    }

    private fun invisibleTextP2(view: View) {
        val nameP2 = findViewById<EditText>(R.id.name_p2_edit)
        val licenseP2 = findViewById<EditText>(R.id.license_p2_edit)
        val brandP2 = findViewById<EditText>(R.id.brand_p2_edit)

        nameP2.visibility = View.INVISIBLE
        licenseP2.visibility = View.INVISIBLE
        brandP2.visibility = View.INVISIBLE
    }

    private fun invisibleTextP3(view: View) {
        val nameP3 = findViewById<EditText>(R.id.name_p3_edit)
        val licenseP3 = findViewById<EditText>(R.id.license_p3_edit)
        val brandP3 = findViewById<EditText>(R.id.brand_p3_edit)

        nameP3.visibility = View.INVISIBLE
        licenseP3.visibility = View.INVISIBLE
        brandP3.visibility = View.INVISIBLE
    }

    private fun visibleTextP1(view: View) {
        val nameP1 = findViewById<EditText>(R.id.name_p1_edit)
        val licenseP1 = findViewById<EditText>(R.id.license_p1_edit)
        val brandP1 = findViewById<EditText>(R.id.brand_p1_edit)

        nameP1.visibility = View.VISIBLE
        licenseP1.visibility = View.VISIBLE
        brandP1.visibility = View.VISIBLE
    }

    private fun visibleTextP2(view: View) {
        val nameP2 = findViewById<EditText>(R.id.name_p2_edit)
        val licenseP2 = findViewById<EditText>(R.id.license_p2_edit)
        val brandP2 = findViewById<EditText>(R.id.brand_p2_edit)

        nameP2.visibility = View.VISIBLE
        licenseP2.visibility = View.VISIBLE
        brandP2.visibility = View.VISIBLE
    }

    private fun visibleTextP3(view: View) {
        val nameP3 = findViewById<EditText>(R.id.name_p3_edit)
        val licenseP3 = findViewById<EditText>(R.id.license_p3_edit)
        val brandP3 = findViewById<EditText>(R.id.brand_p3_edit)

        nameP3.visibility = View.VISIBLE
        licenseP3.visibility = View.VISIBLE
        brandP3.visibility = View.VISIBLE
    }
}


