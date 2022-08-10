package com.example.vianduplessisnav

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import com.example.vianduplessisnav.databinding.FragmentHome2Binding

class Home2Fragment : Fragment() {
    private var _binding: FragmentHome2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHome2Binding.inflate(inflater, container, false)

        binding.changeNavigation.setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            activity?.startActivity(intent)
        }
        return binding.root;
    }
}

