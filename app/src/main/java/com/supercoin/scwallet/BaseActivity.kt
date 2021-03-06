package com.supercoin.scwallet

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    protected open fun displayBackButton(): Boolean {
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (displayBackButton()) supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            onBackPressed()
            return true
        }
        return false
    }
}