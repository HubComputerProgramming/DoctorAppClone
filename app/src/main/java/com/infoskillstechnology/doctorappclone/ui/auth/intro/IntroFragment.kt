package com.infoskillstechnology.doctorappclone.ui.auth.intro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.infoskillstechnology.doctorappclone.R
import kotlinx.android.synthetic.main.fragment_intro.*


class IntroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_intro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var navController = Navigation.findNavController(view)
        val adapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.currencyarray,
            R.layout.row_item
        )
        spinner1.setAdapter(adapter)

        val adapter2 = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.langarray,
            R.layout.row_item
        )
        spinner2.setAdapter(adapter2)


        button.setOnClickListener {
            navController.navigate(R.id.action_introFragment_to_loginFragment)
        }
        button2.setOnClickListener {
            navController.navigate(R.id.action_introFragment_to_registerFragment)
        }


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}