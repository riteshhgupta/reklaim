package com.riteshgupta.reklaim

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by riteshgupta on 23/10/17.
 */


interface UserItemViewInterface: ItemModel {

    val title: String
}

class UserItemViewHolder(view: View): RecyclerView.ViewHolder(view), ItemView<UserItemViewInterface> {

    private val titleLabel: TextView = R.id.tv_item_user.view(view)

    override fun configure(model: UserItemViewInterface) {
        titleLabel.text = model.title
    }
}
