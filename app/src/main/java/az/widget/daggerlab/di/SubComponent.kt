package az.widget.daggerlab.di

import az.widget.daggerlab.MainSubViewModel
import dagger.Subcomponent

@Subcomponent(
    modules = [SubModule::class]
)
interface SubComponent {
    fun inject(viewmodel: MainSubViewModel)

    @Subcomponent.Builder
    interface Builder{
        fun build(): SubComponent
    }
}