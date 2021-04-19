package com.example.entrega_1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button



class rooms : Fragment() {
    private var listener: OnFragmentActionsListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rooms, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn=view.findViewById<Button>(R.id.button_CreateRoom)
        btn.setOnClickListener {loadFragment()}
        //val btnPlus = view.findViewById<Button>(R.id.btnPlus)
        //btnPlus.setOnClickListener { listener?.onClickFragmentButton() }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentActionsListener) {
            listener = context
        }
    }
    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    private fun loadFragment(){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragmentContainer, Create_room())
        transaction?.disallowAddToBackStack()
        transaction?.commit()
    }


}