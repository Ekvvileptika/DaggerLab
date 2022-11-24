package az.widget.daggerlab.di

import android.app.Application
import az.widget.daggerlab.MainActivity
import az.widget.daggerlab.di.external.ExternalDeps
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [MainAppModule::class]
)
interface MainAppComponent: ExternalDeps {
    fun inject(injecting: MainActivity)
    override fun application(): Application

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): MainAppComponent
    }

    //sub
    fun injectSubComponent(): SubComponent.Builder
}