package edu.utap.tiffstreatsrecreate.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import edu.utap.tiffstreatsrecreate.R

class fragment_track_order : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_track_order, container, false)
        val textView: TextView = root.findViewById(R.id.text_track_order)
        textView.text = "Track Order Fragment"
        return root
    }
}