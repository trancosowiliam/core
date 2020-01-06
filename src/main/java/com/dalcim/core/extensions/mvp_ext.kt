package com.dalcim.core.extensions

import android.content.ComponentCallbacks
import com.dalcim.core.mvp.BasePresenter
import com.dalcim.core.mvp.BaseView
import org.koin.android.ext.android.get
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.Qualifier

inline fun <reified T : BasePresenter<*>> ComponentCallbacks.injectPresenter(
    view: BaseView<T>,
    qualifier: Qualifier? = null
) = lazy { get<T>(qualifier) { parametersOf(view) } }