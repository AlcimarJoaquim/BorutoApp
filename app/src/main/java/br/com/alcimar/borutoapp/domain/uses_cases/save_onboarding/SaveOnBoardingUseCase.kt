package br.com.alcimar.borutoapp.domain.uses_cases.save_onboarding

import br.com.alcimar.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean){
        repository.saveOnBoardingState(completed = completed)
    }
}