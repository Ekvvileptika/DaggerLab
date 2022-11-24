package az.widget.daggerlab.di.external

import az.widget.daggerlab.ExternalViewModel
import dagger.Component

@Component(
    modules = [ExternalModule::class],
    dependencies = [ExternalDeps::class]
)
interface ExternalComponent {
    fun inject(item: ExternalViewModel)
}