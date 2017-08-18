package com.databinding.adapterutills

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.databinding.adapterutills.databinding.ActivityTextSwitcherBinding

class TextSwitcherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityTextSwitcherBinding = DataBindingUtil.setContentView(this@TextSwitcherActivity, R.layout.activity_text_switcher)
        var value = 1
        binding.button2.setOnClickListener { binding.textSwitcher.setText((++value).toString()) }
        binding.button3.setOnClickListener { binding.textSwitcher.setText((--value).toString()) }

        binding.textLayoutSwitch = R.layout.root_layout

    }
}
