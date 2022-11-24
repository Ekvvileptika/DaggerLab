package az.widget.daggerlab.di

import az.widget.daggerlab.repository.IRepository
import az.widget.daggerlab.repository.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class MainAppModule {

    @Binds
    abstract fun provideSomeData(repo: Repository): IRepository
}