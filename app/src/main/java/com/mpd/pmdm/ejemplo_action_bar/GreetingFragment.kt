package com.mpd.pmdm.ejemplo_action_bar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.mpd.pmdm.ejemplo_action_bar.databinding.FragmentGreetingBinding

/**
 * A simple [Fragment] subclass.
 * Use the [GreetingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GreetingFragment : Fragment() {
    val args: GreetingFragmentArgs by navArgs()

    private var _binding: FragmentGreetingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGreetingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.saludoTextView.text = getString(R.string.greeting_text, args.name)
    }
}