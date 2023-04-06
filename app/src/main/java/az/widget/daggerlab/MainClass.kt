package az.widget.daggerlab

import android.app.Application
import android.content.Context
import az.widget.daggerlab.di.another.AnotherDeps
import az.widget.daggerlab.di.another.DaggerAnotherComponent
import az.widget.daggerlab.di.main.AppComponent
import az.widget.daggerlab.di.main.DaggerAppComponent

class MainClass: Application(), AnotherDeps {
    val appComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    val appComponentv2 by lazy {
        DaggerAnotherComponent.builder()
            .appComponent(this)
            .build()
    }

    override fun application(): Application {
        return this
    }
}
val Context.getAppComponent: AppComponent
    get() = when(this){
        is MainClass -> appComponent
        else -> this.getAppComponent
    }
