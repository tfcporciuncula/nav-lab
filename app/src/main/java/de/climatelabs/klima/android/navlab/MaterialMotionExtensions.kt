package de.climatelabs.klima.android.navlab

import androidx.fragment.app.Fragment
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialFadeThrough
import com.google.android.material.transition.MaterialSharedAxis

fun Fragment.slideLeft() = MaterialSharedAxis(MaterialSharedAxis.X, true).apply {
  duration = resources.getInteger(R.integer.config_navAnimTime).toLong()
}

fun Fragment.slideRight() = MaterialSharedAxis(MaterialSharedAxis.X, false).apply {
  duration = resources.getInteger(R.integer.config_navAnimTime).toLong()
}

fun Fragment.slideUp() = MaterialSharedAxis(MaterialSharedAxis.Y, true).apply {
  duration = resources.getInteger(R.integer.config_navAnimTime).toLong()
}

fun Fragment.slideDown() = MaterialSharedAxis(MaterialSharedAxis.Y, false).apply {
  duration = resources.getInteger(R.integer.config_navAnimTime).toLong()
}

fun Fragment.slideZUp() = MaterialSharedAxis(MaterialSharedAxis.Z, true).apply {
  duration = resources.getInteger(R.integer.config_navAnimTime).toLong()
}

fun Fragment.slideZDown() = MaterialSharedAxis(MaterialSharedAxis.Z, false).apply {
  duration = resources.getInteger(R.integer.config_navAnimTime).toLong()
}

fun Fragment.fadeThrough() = MaterialFadeThrough().apply {
  duration = resources.getInteger(R.integer.config_navAnimTime).toLong()
}

fun Fragment.containerTransform() = MaterialContainerTransform().apply {
  duration = resources.getInteger(R.integer.config_navAnimTime).toLong()
}
