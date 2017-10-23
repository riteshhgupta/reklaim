package com.riteshgupta.reklaim

/**
 * Created by riteshgupta on 23/10/17.
 */


class UserCellModel(override val title: String): UserCellViewInterface {

    override val layoutId: Int get() = R.layout.item_user
}
