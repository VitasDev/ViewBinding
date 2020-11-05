package com.cubesolver.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cubesolver.viewbinding.databinding.FragmentExampleBinding

class ExampleFragment : Fragment() {
    private var _binding: FragmentExampleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExampleBinding.inflate(inflater, container, false)

        binding.fragmentTextView1.text = "View Binding"
        binding.fragmentTextView2?.text = "works in fragments"
        binding.includeLayout.includeTextView1.text = "and with"
        binding.includeLayout.includeTextView2.text = "include layouts"

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}