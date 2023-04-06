package az.widget.daggerlab.di.main

import android.app.Application
import android.content.Context
import az.widget.daggerlab.MainActivity
import az.widget.daggerlab.di.another.AnotherDeps
import az.widget.daggerlab.di.sub.SubComponent
import dagger.BindsInstance
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent: AnotherDeps {
    override fun application(): Application
    fun inject(to: MainActivity)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun provideAppSubcomponent(): SubComponent.Builder
}
