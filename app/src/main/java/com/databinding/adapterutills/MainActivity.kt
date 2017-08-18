package com.databinding.adapterutills

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.databinding.adapterutills.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)


        val imgUrl = "https://api.androidhive.info/images/glide/medium/deadpool.jpg"

        binding.url = imgUrl
        binding.btnNext.setOnClickListener {

            val intent: Intent = Intent(this@MainActivity, RecyclerActivity::class.java)
            startActivity(intent)
        }

    }
}
