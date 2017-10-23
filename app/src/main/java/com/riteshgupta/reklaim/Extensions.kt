package com.riteshgupta.reklaim

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by riteshgupta on 23/10/17.
 */

fun ViewGroup.loadLayout(layoutId: Int): View {
    return LayoutInflater.from(context).inflate(layoutId, this, true)
}

fun <T: View> Int.view(parent: View): T {
    return  parent.findViewById(this)
}

fun <T: View> Int.view(parent: Activity): T {
    return  parent.findViewById(this)
}
