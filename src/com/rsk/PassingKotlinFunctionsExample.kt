package com.rsk

import com.rsk.java.User

fun main(args: Array<String>) {

    var user = User ("Kevin")
    user.create{ println("User $it has been created") }
}