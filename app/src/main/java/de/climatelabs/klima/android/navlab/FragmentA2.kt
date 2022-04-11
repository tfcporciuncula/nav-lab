package de.climatelabs.klima.android.navlab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.climatelabs.klima.android.navlab.databinding.A2Binding

class FragmentA2 : Fragment() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    val binding = A2Binding.inflate(inflater, container, false)
    binding.screen.setOnClickListener {
    }
    return binding.root
  }
}
