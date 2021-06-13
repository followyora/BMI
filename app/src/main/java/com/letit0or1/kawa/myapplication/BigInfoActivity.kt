package com.letit0or1.kawa.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BigInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_big_info)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}