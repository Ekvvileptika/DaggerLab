package az.widget.daggerlab.di.sub

import dagger.Subcomponent

@Subcomponent(modules = [SubModule::class])
interface SubComponent {

    @Subcomponent.Builder
    interface Builder{
        fun build(): SubComponent
    }
}