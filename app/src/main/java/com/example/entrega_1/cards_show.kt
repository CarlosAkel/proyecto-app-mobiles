package com.example.entrega_1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class cards_show : Fragment() {
    private var listener: OnFragmentActionsListener? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cards_show, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
}