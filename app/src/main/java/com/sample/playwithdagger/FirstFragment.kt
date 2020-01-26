package com.sample.playwithdagger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.sample.core.ScreenSetuper
import com.sample.scoped.DaggerSeparateComponent
import com.sample.scoped.SeparateComponent
import com.sample.scoped.SeparateTaskManager
import com.sample.text.TextProvider
import kotlinx.android.synthetic.main.fragment_first.view.*
import javax.inject.Inject

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    lateinit var separateComponent: SeparateComponent
    lateinit var taskManager: SeparateTaskManager

    @Inject lateinit var screenSetuper: ScreenSetuper
    @Inject lateinit var textProvider: TextProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainApp.instance.component.getScreenSetuper()
        MainApp.instance.component.inject(this)

        separateComponent = DaggerSeparateComponent.builder().coreComponent(MainApp.instance.coreComponent).build()
        taskManager = separateComponent.getTaskManager()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        screenSetuper.setup(view.frameLayout, textProvider.calcText())

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("From FirstFragment")
            findNavController().navigate(action)
        }
    }
}
