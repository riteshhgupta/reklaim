package com.riteshgupta.reklaim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivityViewModel {

    val users: Array<ItemModel>
        get() {
            return arrayOf(
                    UserCellModel("Apple"),
                    UserCellModel("Orange"),
                    UserCellModel("Guava"),
                    UserCellModel("Banana"),
                    UserCellModel("Pear")
            )
        }
}

class MainActivity : AppCompatActivity() {

    private val viewModel = MainActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = R.id.rv_main.view<RecyclerView>(this)
        rv.adapter = ItemsAdapter(viewModel.users, {
            UserCellView(this)
        })
        rv.layoutManager = LinearLayoutManager(this)
    }
}
