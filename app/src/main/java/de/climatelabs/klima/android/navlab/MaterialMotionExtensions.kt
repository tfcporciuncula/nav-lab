package de.climatelabs.klima.android.navlab

import androidx.fragment.app.Fragment
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialFadeThrough
import com.google.android.material.transition.MaterialSharedAxis

fun Fragment.slideLeft() = MaterialSharedAxis(MaterialSharedAxis.X, true)

fun Fragment.slideRight() = MaterialSharedAxis(MaterialSharedAxis.X, false)

fun Fragment.slideUp() = MaterialSharedAxis(MaterialSharedAxis.Y, true)

fun Fragment.slideDown() = MaterialSharedAxis(MaterialSharedAxis.Y, false)

fun Fragment.slideZUp() = MaterialSharedAxis(MaterialSharedAxis.Z, true)

fun Fragment.slideZDown() = MaterialSharedAxis(MaterialSharedAxis.Z, false)

fun Fragment.fadeThrough() = MaterialFadeThrough()

fun Fragment.containerTransform() = MaterialContainerTransform()
