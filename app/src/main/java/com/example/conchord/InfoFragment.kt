package com.example.conchord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class InfoFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_info, container, false)
        val okButton : Button = view.findViewById<Button>(R.id.okButton)

        okButton.setOnClickListener {
            dismiss()
        }

        return view
    }
}