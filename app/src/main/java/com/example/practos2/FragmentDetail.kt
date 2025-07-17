package com.example.practos2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

class FragmentDetail:Fragment(R.layout.fragment_detail) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val model = arguments?.getParcelable<OneModel>("key")
        if (model != null) {
           Glide.with(this).load(model.getCurrentPic()).into(view.findViewById<ImageView>(R.id.image))
            view.findViewById<TextView>(R.id.title).text = model.name
            view.findViewById<TextView>(R.id.desc).text = model.description
        }
    }
}