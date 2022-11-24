package az.widget.daggerlab.di

import az.widget.daggerlab.AnotherViewModel
import az.widget.daggerlab.MainApp
import dagger.Component


@Component(
    modules = [AnotherModule::class],
    dependencies = [MainAppComponent::class]
)
interface AnotherComponent {
    fun inject(item: AnotherViewModel)
    fun inject(item: MainApp)

    @Component.Builder
    interface Builder{
        fun mainapp(component: MainAppComponent): Builder

        fun build(): AnotherComponent
    }
}