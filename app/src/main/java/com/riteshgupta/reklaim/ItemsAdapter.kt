package com.riteshgupta.reklaim

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Created by riteshgupta on 23/10/17.
 */

interface ItemModel {

    val layoutId: Int
}

interface ItemView<in Model: ItemModel> {

    fun configure(model: Model)
}

typealias ViewHolderHandler = (Int, View) -> RecyclerView.ViewHolder

open class ItemsAdapter(
        private val items: Array<ItemModel>,
        private val viewHolderForLayoutId: ViewHolderHandler): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return viewHolderForLayoutId(
                viewType,
                parent.loadLayout(viewType)
        )
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val cell = holder as? ItemView<ItemModel> ?: return
        val model = items[position]
        cell.configure(model)
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].layoutId
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}
