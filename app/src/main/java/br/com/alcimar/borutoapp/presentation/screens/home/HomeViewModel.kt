package br.com.alcimar.borutoapp.presentation.screens.home

import androidx.lifecycle.ViewModel
import br.com.alcimar.borutoapp.domain.uses_cases.UsesCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    usesCases: UsesCases
): ViewModel(){
    val getAllHeroes = usesCases.getAllHeroesUseCase()
}