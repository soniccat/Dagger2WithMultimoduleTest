package com.sample.oemapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.sample.core.ScreenSetuper
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ScreenSetuper().setup(view.frameLayout)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("From FirstFragment")
            findNavController().navigate(action)
        }
    }
}
