package br.com.alcimar.borutoapp.domain.model

import androidx.annotation.DrawableRes
import br.com.alcimar.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
){
    object First: OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        description = "Are you a Boruto fan? Because if you are then we have a great news for you!"
    )

    object Second: OnBoardingPage(
        image = R.drawable.explore,
        title = "Greetings",
        description = "Find your favorite heroes and learn some of the things that you didn't know about."
    )

    object Third: OnBoardingPage(
        image = R.drawable.power,
        title = "Greetings",
        description = "Check out your hero's power and see how much they are strong comparing to others."
    )
}
