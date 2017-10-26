package com.riteshgupta.reklaim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

class MainActivityViewModel {

    val users: Array<ItemModel>
        get() {
            return arrayOf(
                    UserItemModel("Apple"),
                    UserItemModel("Orange"),
                    UserItemModel("Guava"),
                    UserItemModel("Banana"),
                    UserItemModel("Pear")
            )
        }
}

class MainActivity : AppCompatActivity() {

    private val viewModel = MainActivityViewModel()

    private fun viewHolderHandler(layoutId: Int, contentView: View): RecyclerView.ViewHolder {
        return UserItemViewHolder(contentView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = R.id.rv_main.view<RecyclerView>(this)
        rv.adapter = ItemsAdapter(
                viewModel.users,
                this::viewHolderHandler
        )
        rv.layoutManager = LinearLayoutManager(this)
    }
}
