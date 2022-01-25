package com.example.conchord

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val backButton : Button = view.findViewById(R.id.buttonNazad)
        backButton.setOnClickListener {
            val fragment = FirstFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.flFragment, fragment)?.commit()
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val unosAkorda = view.findViewById<EditText>(R.id.editText)
        val pretragaButton = view.findViewById<Button>(R.id.buttonSearch)



        pretragaButton.setOnClickListener {
            val request = ServiceBuilder.buildService(apiEndPoints::class.java)
            val call = request.getChords(unosAkorda.text.toString())
            call.enqueue(object : Callback<List<ResponseData>> {
                override fun onResponse(
                    call: Call<List<ResponseData>>,
                    response: Response<List<ResponseData>>
                ) {
                    if (response.isSuccessful) {

                        view.findViewById<RecyclerView>(R.id.recyclerView).apply {
                            layoutManager = LinearLayoutManager(context)
                            adapter = AkordiAdapter(response.body()!!)
                        }
                    }
                }

                override fun onFailure(call: Call<List<ResponseData>>, t: Throwable) {
                    Log.d("FAIL", t.message.toString())
                }
            })
        }
    }
    
}