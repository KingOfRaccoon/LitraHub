package com.kingofraccoon.litrahub.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kingofraccoon.litrahub.R

class MenuFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_menu, container, false)
        var textView: TextView = view.findViewById(R.id.text)
        textView.text = "Здесь должно быть меню!!"

        return view
    }
}