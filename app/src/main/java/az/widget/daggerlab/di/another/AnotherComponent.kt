package az.widget.daggerlab.di.another

import android.content.Context
import az.widget.daggerlab.di.main.AppComponent
import dagger.Component

@Component(
    modules = [AnotherModule::class],
    dependencies = [AnotherDeps::class]
)
interface AnotherComponent {

    @Component.Builder
    interface Builder{
        fun appComponent(app: AnotherDeps): Builder

        fun build(): AnotherComponent
    }
}