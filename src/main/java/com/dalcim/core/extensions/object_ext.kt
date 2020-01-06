package com.dalcim.core.extensions

fun Any?.whenNull(action: () -> Unit) {
    if (this == null) action()
}