package com.databinding.bindingadapterutills

import android.databinding.BindingAdapter
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextSwitcher
import android.widget.TextView
import com.bumptech.glide.Glide

object AdapterBinding {
    // for image view using glide

    @BindingAdapter("url")
    @JvmStatic
    fun adapterMainBinding(imageView: ImageView, glideAdapter: String) {

        Glide.with(imageView.context).load(glideAdapter)
                .into(imageView)
    }

    // for recycler divider
    @BindingAdapter("divider")
    @JvmStatic
    fun recyclerAdapterBinding(recyclerView: RecyclerView, recyclerViewDivider: Boolean) {

        val divider = DividerItemDecoration(recyclerView.context, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(divider)
    }

    //for textswitcher
    @BindingAdapter("textview_layout", "inAnimation", "outAnimation", requireAll = false)
    @JvmStatic
    fun switcherBinding(textSwitcher: TextSwitcher, textSwitch: Int, inAnimation: Int, outAnimation: Int) {

        if (textSwitch != 0) {

            textSwitcher.setFactory {

                val layoutInflater = LayoutInflater.from(textSwitcher.context)
                val inflate = layoutInflater.inflate(textSwitch, null)
                inflate as TextView
            }
        }
        if (inAnimation != 0) {
            textSwitcher.setInAnimation(textSwitcher.context, inAnimation)
        }

        if (outAnimation != 0) {
            textSwitcher.setOutAnimation(textSwitcher.context, outAnimation)
        }
    }

}