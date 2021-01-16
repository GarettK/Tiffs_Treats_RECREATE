package edu.utap.tiffstreatsrecreate.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import edu.utap.tiffstreatsrecreate.R

class fragment_other_gift_options : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_other_gift_options, container, false)
        val textView: TextView = root.findViewById(R.id.text_other_gift_options)
        textView.text = "Other Gift Options Fragment."
        return root
    }
}