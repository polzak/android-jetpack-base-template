package net.polzak.jetpack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import net.polzak.jetpack.databinding.FragmentStartBinding

class StartFragment: Fragment() {

    private var clicked = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentStartBinding>(inflater, R.layout.fragment_start, container, false)

        binding.button1.setOnClickListener {
            if (clicked) {
                binding.textView1.text = ""
            } else {
                binding.textView1.text = "I am binded!"
            }

            clicked = !clicked
        }

        return binding.root
    }
}