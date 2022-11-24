package az.widget.daggerlab.di.external

import az.widget.daggerlab.externalRepo.ExternalRepo
import az.widget.daggerlab.externalRepo.ExternalRepoo
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ExternalModule {

    @Binds
    abstract fun provideItem(repo: ExternalRepoo): ExternalRepo
}