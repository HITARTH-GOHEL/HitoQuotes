package com.example.hitoquotes.DataClass

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.hitoquotes.Navigation.Screen

data class GridItems(
    @DrawableRes val did: Int,
    @StringRes val name: Int,
    val screen: Screen
)
