package com.example.kannadanudimuttugalu.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.kannadanudimuttugalu.R
import com.example.kannadanudimuttugalu.databinding.FragmentHomeBinding

class DariNurariveFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[DariNurariveViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        setUpToolbar()

        return binding.root
    }

    private fun setUpToolbar(){
        activity?.actionBar?.setTitle(R.string.app_name)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}