package com.example.sdl.jetpacknavigation1
//Todo: 6 now create the needed fragments In the MainActivity folder like this one (3/3 for this example)

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_c.*


class FragmentC : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* a way to do it
        buttonC.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragmentC_to_fragmentA)
        }
         */
        // Second way to do it
        buttonC.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentC_to_fragmentA))
    }


}
