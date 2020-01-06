package com.dalcim.core.mvp

interface BaseView<out T : BasePresenter<*>> {
    val presenter: T
}