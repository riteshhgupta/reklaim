package com.riteshgupta.reklaim

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView

/**
 * Created by riteshgupta on 23/10/17.
 */


interface UserCellViewInterface: ItemModel {

    val title: String
}

class UserCellView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0):

        LinearLayout(context, attrs, defStyle, defStyleRes),
        ItemView<UserCellViewInterface>
{
    private var titleLabel: TextView

    init {
        loadLayout(R.layout.item_user)
        titleLabel = R.id.tv_item_user.view(this)
    }

    override fun configure(model: UserCellViewInterface) {
        titleLabel.text = model.title
    }
}
