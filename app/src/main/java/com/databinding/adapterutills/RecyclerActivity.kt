package com.databinding.adapterutills

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.databinding.adapterutills.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityRecyclerBinding
                = DataBindingUtil.setContentView(this@RecyclerActivity, R.layout.activity_recycler)

        binding.list.layoutManager = LinearLayoutManager(this@RecyclerActivity)
        binding.list.hasFixedSize()
        binding.list.adapter = ListAdapter(this, getLists())
        binding.btnNext.setOnClickListener { val intent = Intent(this@RecyclerActivity, TextSwitcherActivity::class.java)
        startActivity(intent)}
    }

    fun getLists(): ArrayList<String> {
        var lists = ArrayList<String>()
        lists.add("JAVA")
        lists.add("KOTLIN")
        lists.add("PHP")
        lists.add("SWIFT")
        lists.add("JAVA Script")
        lists.add("MYSQL")
        return lists;
    }

}
