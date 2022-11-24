package az.widget.daggerlab.di

import az.widget.daggerlab.anotherRepo.AnotherRepo
import az.widget.daggerlab.anotherRepo.IAnotherRepo
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class AnotherModule {

    @Binds
    abstract fun provideAnotherModule(repo: AnotherRepo): IAnotherRepo
}