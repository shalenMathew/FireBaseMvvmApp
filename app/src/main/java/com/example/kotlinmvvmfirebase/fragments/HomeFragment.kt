package com.example.kotlinmvvmfirebase.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotlinmvvmfirebase.R
import com.example.kotlinmvvmfirebase.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var viewbinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        viewbinding = FragmentHomeBinding.inflate( inflater,container,false)
        return viewbinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewbinding.textId.text = "This is HOME"
        viewbinding.button.setOnClickListener {
//            val action = HomeFragmentDirections.actionHomeFragmentToFavFragment()
//            view.findNavController().navigate(action)

            findNavController().navigate(R.id.action_homeFragment_to_favFragment)

        }
    }


}