package br.com.alcimar.borutoapp.domain.uses_cases

import br.com.alcimar.borutoapp.domain.uses_cases.get_all_heroes.GetAllHeroesUseCase
import br.com.alcimar.borutoapp.domain.uses_cases.read_onboarding.ReadOnBoardingUseCase
import br.com.alcimar.borutoapp.domain.uses_cases.save_onboarding.SaveOnBoardingUseCase

data class UsesCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase
)
