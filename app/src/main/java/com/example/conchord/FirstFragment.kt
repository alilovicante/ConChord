package com.example.conchord

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val nextButton : Button = view.findViewById(R.id.buttonSearch)
        val infoButton : Button = view.findViewById(R.id.infoButton)

        nextButton.setOnClickListener {
            val fragment = SecondFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.flFragment, fragment)?.addToBackStack(null)?.commit()
        }

        infoButton.setOnClickListener {
            var dialog = InfoFragment()
            dialog.show(childFragmentManager,"popup")
        }

        val tuneButton : Button = view.findViewById(R.id.buttonTune)
        tuneButton.setOnClickListener {
            val intent = Intent(context, TuneActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}