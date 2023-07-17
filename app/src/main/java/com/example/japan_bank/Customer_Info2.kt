package com.example.japan_bank

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.japan_bank.databinding.CustomerInfo2Binding

class Customer_Info2 : AppCompatActivity() {

    lateinit var binding: CustomerInfo2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CustomerInfo2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceButton(IDCard())

        binding.rbID.setOnClickListener {
            replaceButton(IDCard())
        }

        binding.rbPassport.setOnClickListener {
            replaceButton(Passport())
        }
    }

    private fun replaceButton(fragment: Fragment) {
        val buttonManager= supportFragmentManager
        val buttonTransaction= buttonManager.beginTransaction()
        buttonTransaction.replace(R.id.fragments,fragment)
        buttonTransaction.commit()

    }


}