package com.riteshgupta.reklaim

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by riteshgupta on 23/10/17.
 */

fun ViewGroup.loadLayout(layoutId: Int): View = LayoutInflater
        .from(context)
        .inflate(layoutId, this, false)

fun <T: View> Int.view(parent: View): T = parent.findViewById(this)

fun <T: View> Int.view(parent: Activity): T = parent.findViewById(this)
