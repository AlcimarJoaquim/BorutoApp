package br.com.alcimar.borutoapp.domain.uses_cases.read_onboarding

import br.com.alcimar.borutoapp.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<Boolean>{
        return repository.readOnBoardingState()
    }
}