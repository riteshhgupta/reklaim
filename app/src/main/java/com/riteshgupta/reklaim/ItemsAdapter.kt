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

open class ItemsAdapter(
        private val items: Array<ItemModel>,
        private val itemViewForLayoutId: ((Int) -> View)): RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = itemViewForLayoutId(viewType)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cell = holder.itemView as ItemView<ItemModel>
        val model = items[position]
        cell.configure(model)
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].layoutId
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
