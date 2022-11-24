package az.widget.daggerlab.di

import az.widget.daggerlab.subRepo.ISubRepository
import az.widget.daggerlab.subRepo.SubRepository
import dagger.Module
import dagger.Provides

@Module
class SubModule {
    @Provides
    fun provideSomeInteger(): ISubRepository = SubRepository()
}