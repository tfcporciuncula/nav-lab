package de.climatelabs.klima.android.navlab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import de.climatelabs.klima.android.navlab.databinding.CBinding

class FragmentC : Fragment() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    val binding = CBinding.inflate(inflater, container, false)
    binding.screen.setOnClickListener {
      findNavController().navigate(R.id.fragmentC2)
    }
    return binding.root
  }
}
