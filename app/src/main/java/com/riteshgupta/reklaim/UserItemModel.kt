package com.riteshgupta.reklaim

/**
 * Created by riteshgupta on 23/10/17.
 */


class UserItemModel(override val title: String): UserItemViewInterface {

    override val layoutId: Int get() = R.layout.item_user
}
