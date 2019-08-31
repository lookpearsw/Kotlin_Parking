package com.gmail.supajeew.parking

import android.content.Context
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.gmail.supajeew.parking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private val myName: Carpark = Carpark("", "", "")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        invisibleObj()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.apply {

        }
        binding.p1Button.setOnClickListener {
            val nameEditText = binding.nameP1Edit
            val nameTextView = binding.noAvailable1View

            parkingSlot1(it)
            visibleObj()
            visibleTextP1(it)
            invisibleTextP2(it)
            invisibleTextP3(it)

            binding.updateButton.setOnClickListener {
                addNameP1(it)
            }
            binding.deleteButton.setOnClickListener {
                delNameP1(it)
            }
        }

        binding.p2Button.setOnClickListener {
            parkingSlot2(it)
            visibleObj()
            visibleTextP2(it)
            invisibleTextP1(it)
            invisibleTextP3(it)
            binding.updateButton.setOnClickListener {
                addNameP2(it)
            }
            binding.deleteButton.setOnClickListener {
                delNameP2(it)
            }
        }

        binding.p3Button.setOnClickListener {
            parkingSlot3(it)
            visibleObj()
            visibleTextP3(it)
            invisibleTextP1(it)
            invisibleTextP2(it)
            binding.updateButton.setOnClickListener {
                addNameP3(it)
            }
            binding.deleteButton.setOnClickListener {
                delNameP3(it)
            }
        }
    }


    private fun addNameP1(view: View) {
        val nameEditText = binding.nameP1Edit
        val nameTextView = binding.noAvailable1View

        if (nameEditText.text.toString() == "") {
            nameTextView.text = "no available"
        } else {
            nameTextView.text = nameEditText.text
        }


        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun delNameP1(view: View) {
        val nameEditText = binding.nameP1Edit
        val licenseEditText = binding.licenseP1Edit
        val brandEditText = binding.brandP1Edit
        val nameTextView = binding.noAvailable1View

        nameTextView.text = "no available"
        nameEditText.setText("");
        licenseEditText.setText("");
        brandEditText.setText("");
    }


    private fun addNameP2(view: View) {
        val nameEditText = binding.nameP2Edit
        val nameTextView = binding.noAvailable2View

        if (nameEditText.text.toString() == "") {
            nameTextView.text = "no available"
        } else {
            nameTextView.text = nameEditText.text
        }

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun delNameP2(view: View) {
        val nameEditText = binding.nameP2Edit
        val licenseEditText = binding.licenseP2Edit
        val brandEditText = binding.brandP2Edit
        val nameTextView = binding.noAvailable1View

        nameTextView.text = "no available"
        nameEditText.setText("");
        licenseEditText.setText("");
        brandEditText.setText("");

    }


    private fun addNameP3(view: View) {
        val nameEditText = binding.nameP3Edit
        val nameTextView = binding.noAvailable3View

        if (nameEditText.text.toString() == "") {
            nameTextView.text = "no available"
        } else {
            nameTextView.text = nameEditText.text
        }

        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun delNameP3(view: View) {
        val nameEditText = binding.nameP3Edit
        val licenseEditText = binding.licenseP3Edit
        val brandEditText = binding.brandP3Edit
        val nameTextView = binding.noAvailable1View

        nameTextView.text = "no available"
        nameEditText.setText("");
        licenseEditText.setText("");
        brandEditText.setText("");
    }

    private fun parkingSlot1(view: View) {
        val parkingView = binding.ParkingView
        val p1Button = binding.p1Button
        parkingView.text = p1Button.text
    }

    private fun parkingSlot2(view: View) {
        val parkingView = binding.ParkingView
        val p2Button = binding.p2Button
        parkingView.text = p2Button.text
    }

    private fun parkingSlot3(view: View) {
        val parkingView = binding.ParkingView
        val p3Button = binding.p3Button
        parkingView.text = p3Button.text
    }

    private fun invisibleTextP1(view: View) {
        val nameP1 = binding.nameP1Edit
        val licenseP1 = binding.licenseP1Edit
        val brandP1 = binding.brandP1Edit

        nameP1.visibility = View.INVISIBLE
        licenseP1.visibility = View.INVISIBLE
        brandP1.visibility = View.INVISIBLE
    }

    private fun invisibleTextP2(view: View) {
        val nameP2 = binding.nameP2Edit
        val licenseP2 = binding.licenseP2Edit
        val brandP2 = binding.brandP2Edit

        nameP2.visibility = View.INVISIBLE
        licenseP2.visibility = View.INVISIBLE
        brandP2.visibility = View.INVISIBLE
    }

    private fun invisibleTextP3(view: View) {
        val nameP3 = binding.nameP3Edit
        val licenseP3 = binding.licenseP3Edit
        val brandP3 = binding.brandP3Edit

        nameP3.visibility = View.INVISIBLE
        licenseP3.visibility = View.INVISIBLE
        brandP3.visibility = View.INVISIBLE
    }

    private fun visibleTextP1(view: View) {
        val nameP1 = binding.nameP1Edit
        val licenseP1 = binding.licenseP1Edit
        val brandP1 = binding.brandP1Edit

        nameP1.visibility = View.VISIBLE
        licenseP1.visibility = View.VISIBLE
        brandP1.visibility = View.VISIBLE
    }

    private fun visibleTextP2(view: View) {
        val nameP2 = binding.nameP2Edit
        val licenseP2 = binding.licenseP2Edit
        val brandP2 = binding.brandP2Edit

        nameP2.visibility = View.VISIBLE
        licenseP2.visibility = View.VISIBLE
        brandP2.visibility = View.VISIBLE
    }

    private fun visibleTextP3(view: View) {
        val nameP3 = binding.nameP3Edit
        val licenseP3 = binding.licenseP3Edit
        val brandP3 = binding.brandP3Edit

        nameP3.visibility = View.VISIBLE
        licenseP3.visibility = View.VISIBLE
        brandP3.visibility = View.VISIBLE
    }

    private fun invisibleObj() {
        val nameTextview = findViewById<TextView>(R.id.name_txtview)
        val licenseTextview = findViewById<TextView>(R.id.license_txtview)
        val brandTextview = findViewById<TextView>(R.id.brand_txtview)
        val deleteButton = findViewById<Button>(R.id.delete_button)
        val updateButton = findViewById<Button>(R.id.update_button)

        nameTextview.visibility = View.INVISIBLE
        licenseTextview.visibility = View.INVISIBLE
        brandTextview.visibility = View.INVISIBLE
        deleteButton.visibility = View.INVISIBLE
        updateButton.visibility = View.INVISIBLE
    }

    private fun visibleObj() {
        val nameTextview = binding.nameTxtview
        val licenseTextview = binding.licenseTxtview
        val brandTextview = binding.brandTxtview
        val deleteButton = binding.deleteButton
        val updateButton = binding.updateButton

        nameTextview.visibility = View.VISIBLE
        licenseTextview.visibility = View.VISIBLE
        brandTextview.visibility = View.VISIBLE
        deleteButton.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
    }

}


