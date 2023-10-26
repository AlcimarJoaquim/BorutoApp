package br.com.alcimar.borutoapp.di

import android.content.Context
import br.com.alcimar.borutoapp.data.repository.DataStoreOperartionsImpl
import br.com.alcimar.borutoapp.data.repository.Repository
import br.com.alcimar.borutoapp.domain.repository.DataStoreOperations
import br.com.alcimar.borutoapp.domain.uses_cases.UsesCases
import br.com.alcimar.borutoapp.domain.uses_cases.get_all_heroes.GetAllHeroesUseCase
import br.com.alcimar.borutoapp.domain.uses_cases.read_onboarding.ReadOnBoardingUseCase
import br.com.alcimar.borutoapp.domain.uses_cases.save_onboarding.SaveOnBoardingUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun providesDataStoreOperation(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperartionsImpl(context = context)
    }

    @Provides
    @Singleton
    fun providesUseCases(repository: Repository): UsesCases{
        return UsesCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository)
        )
    }
}