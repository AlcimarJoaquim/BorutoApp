package br.com.alcimar.borutoapp.data.repository

import androidx.paging.PagingData
import br.com.alcimar.borutoapp.domain.model.Hero
import br.com.alcimar.borutoapp.domain.repository.DataStoreOperations
import br.com.alcimar.borutoapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val remote: RemoteDataSource,
    private val dataStore: DataStoreOperations
) {

    fun getAllHeroes(): Flow<PagingData<Hero>>{
        return remote.getAllHeroes()
    }
    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.saveOnBoardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.readOnBoardingState()
    }
}