package az.widget.daggerlab

import android.app.Application
import android.content.Context
import az.widget.daggerlab.anotherRepo.IAnotherRepo
import az.widget.daggerlab.di.DaggerAnotherComponent
import az.widget.daggerlab.di.DaggerMainAppComponent
import az.widget.daggerlab.di.MainAppComponent
import javax.inject.Inject

class MainApp: Application() {

    @Inject
    lateinit var repo: IAnotherRepo

    //component base
    val appComponent by lazy {
        DaggerMainAppComponent.builder()
            .application(this)
            .build()
    }

    //another one internal component
    val appAnotherComponent by lazy {
        DaggerAnotherComponent.builder()
            .mainapp(appComponent)
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        appAnotherComponent.inject(this)
        repo.getFloat()
    }
}

val Context.appComponent: MainAppComponent
    get() = when(this){
        is MainApp -> appComponent
        else -> this.applicationContext.appComponent
    }