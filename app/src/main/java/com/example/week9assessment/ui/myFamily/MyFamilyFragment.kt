package com.example.week9assessment.ui.myFamily

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.week9assessment.databinding.FragmentFamilyBinding
import com.example.week9assessment.ui.myFamily.MyFamilyViewModel

class   MyFamilyFragment : Fragment() {

    private var _binding: FragmentFamilyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myFamilyViewModel =
            ViewModelProvider(this).get(MyFamilyViewModel::class.java)

        _binding = FragmentFamilyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMyFamily
        myFamilyViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}