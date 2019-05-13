package net.polzak.jetpack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import net.polzak.jetpack.databinding.FragmentStartBinding

class StartFragment: Fragment() {

    private lateinit var viewModel: StartViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentStartBinding>(inflater, R.layout.fragment_start, container, false)

        viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)


        viewModel.score.observe(this, Observer { newScore ->
            binding.scoreboard.text = newScore.toString()
        })

        binding.minusButton.setOnClickListener {
            viewModel.subtractPoint()
        }

        binding.plusButton.setOnClickListener {
            viewModel.addPoint()
        }

        return binding.root
    }
}