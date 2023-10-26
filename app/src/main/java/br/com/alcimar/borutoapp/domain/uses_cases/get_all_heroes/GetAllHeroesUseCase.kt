package br.com.alcimar.borutoapp.domain.uses_cases.get_all_heroes

import androidx.paging.PagingData
import br.com.alcimar.borutoapp.data.repository.Repository
import br.com.alcimar.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }
}