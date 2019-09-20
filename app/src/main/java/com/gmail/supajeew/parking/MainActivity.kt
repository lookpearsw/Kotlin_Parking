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
    var noAvailable = "no available"

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        super.onCreate(savedInstanceState)
        invisibleObj()


        binding.apply {
            p1Button.setOnClickListener {
                parkingSlot1()
                visibleObj()
                visibleTextP1()
                invisibleTextP2()
                invisibleTextP3()

                updateButton.setOnClickListener {
                    addNameP1(it)
                    invisibleObj()
                    changeParkingTitle()
                }
                deleteButton.setOnClickListener {
                    delNameP1()
                    invisibleObj()
                    changeParkingTitle()
                }
            }

            p2Button.setOnClickListener {
                parkingSlot2()
                visibleObj()
                visibleTextP2()
                invisibleTextP1()
                invisibleTextP3()
                updateButton.setOnClickListener {
                    addNameP2(it)
                    invisibleObj()
                    ParkingView.text = "ChooseParking"
                }
                deleteButton.setOnClickListener {
                    delNameP2()
                    invisibleObj()
                    changeParkingTitle()
                }
            }

            p3Button.setOnClickListener {
                parkingSlot3()
                visibleObj()
                visibleTextP3()
                invisibleTextP1()
                invisibleTextP2()
                updateButton.setOnClickListener {
                    addNameP3(it)
                    invisibleObj()
                    changeParkingTitle()
                }
                deleteButton.setOnClickListener {
                    delNameP3()
                    invisibleObj()
                    changeParkingTitle()
                }
            }
        }
    }

    fun changeParkingTitle(){
        binding.apply {
            ParkingView.text = "ChooseParking"
        }
    }

    private fun addNameP1(view: View) {
        binding.apply {
            if (nameP1Edit.text.toString() == "") {
                noAvailable1View.text = noAvailable
            } else {
                noAvailable1View.text = nameP1Edit.text
            }
            // Hide the keyboard.
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    private fun delNameP1() {
        binding.apply {
            noAvailable1View.text = noAvailable
            nameP1Edit.setText("")
            licenseP1Edit.setText("")
            brandP1Edit.setText("")
        }
    }


    private fun addNameP2(view: View) {
        binding.apply {
            if (nameP2Edit.text.toString() == "") {
                noAvailable2View.text = noAvailable
            } else {
                noAvailable2View.text = nameP2Edit.text
            }
            // Hide the keyboard.
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    private fun delNameP2() {
        binding.apply {
            noAvailable2View.text = noAvailable
            nameP2Edit.setText("")
            licenseP2Edit.setText("")
            brandP2Edit.setText("")
        }
    }


    private fun addNameP3(view: View) {
        binding.apply {
            if (nameP3Edit.text.toString() == "") {
                noAvailable3View.text = noAvailable
            } else {
                noAvailable3View.text = nameP3Edit.text
            }
            // Hide the keyboard.
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    private fun delNameP3() {
        binding.apply {
            noAvailable3View.text = noAvailable
            nameP3Edit.setText("")
            licenseP3Edit.setText("")
            brandP3Edit.setText("")
        }
    }

    private fun parkingSlot1() {
        binding.apply {
            ParkingView.text = p1Button.text
        }
    }

    private fun parkingSlot2() {
        binding.apply {
            ParkingView.text = p2Button.text
        }
    }

    private fun parkingSlot3() {
        binding.apply {
            ParkingView.text = p3Button.text
        }
    }

    private fun invisibleTextP1() {
        binding.apply {
            nameP1Edit.visibility = View.INVISIBLE
            licenseP1Edit.visibility = View.INVISIBLE
            brandP1Edit.visibility = View.INVISIBLE
        }
    }

    private fun invisibleTextP2() {
        binding.apply {
            nameP2Edit.visibility = View.INVISIBLE
            licenseP2Edit.visibility = View.INVISIBLE
            brandP2Edit.visibility = View.INVISIBLE
        }
    }

    private fun invisibleTextP3() {
        binding.apply {
            nameP3Edit.visibility = View.INVISIBLE
            licenseP3Edit.visibility = View.INVISIBLE
            brandP3Edit.visibility = View.INVISIBLE
        }
    }

    private fun visibleTextP1() {
        binding.apply {
            nameP1Edit.visibility = View.VISIBLE
            licenseP1Edit.visibility = View.VISIBLE
            brandP1Edit.visibility = View.VISIBLE
        }
    }

    private fun visibleTextP2() {
        binding.apply {
            nameP2Edit.visibility = View.VISIBLE
            licenseP2Edit.visibility = View.VISIBLE
            brandP2Edit.visibility = View.VISIBLE
        }
    }

    private fun visibleTextP3() {
        binding.apply {
            nameP3Edit.visibility = View.VISIBLE
            licenseP3Edit.visibility = View.VISIBLE
            brandP3Edit.visibility = View.VISIBLE
        }
    }

    private fun invisibleObj() {
        binding.apply {
            nameP3Edit.visibility = View.INVISIBLE
            licenseP3Edit.visibility = View.INVISIBLE
            brandP3Edit.visibility = View.INVISIBLE
            nameP1Edit.visibility = View.INVISIBLE
            licenseP1Edit.visibility = View.INVISIBLE
            brandP1Edit.visibility = View.INVISIBLE
            nameP2Edit.visibility = View.INVISIBLE
            licenseP2Edit.visibility = View.INVISIBLE
            brandP2Edit.visibility = View.INVISIBLE
            nameTxtview.visibility = View.INVISIBLE
            licenseTxtview.visibility = View.INVISIBLE
            brandTxtview.visibility = View.INVISIBLE
            deleteButton.visibility = View.INVISIBLE
            updateButton.visibility = View.INVISIBLE
        }
    }

    private fun visibleObj() {
        binding.apply {
            nameTxtview.visibility = View.VISIBLE
            licenseTxtview.visibility = View.VISIBLE
            brandTxtview.visibility = View.VISIBLE
            deleteButton.visibility = View.VISIBLE
            updateButton.visibility = View.VISIBLE
        }
    }

}


