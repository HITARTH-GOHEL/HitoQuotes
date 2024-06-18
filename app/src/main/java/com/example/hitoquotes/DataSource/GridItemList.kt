package com.example.hitoquotes.DataSource

import com.example.hitoquotes.DataClass.GridItems
import com.example.hitoquotes.Navigation.Screen
import com.example.hitoquotes.R

class DataSourceGIL() {
    fun loadGridItems(): List<GridItems> {
        return listOf<GridItems>(
            GridItems(R.drawable.change, R.string.change, Screen.ChangeQuotesScreen),
            GridItems(R.drawable.life, R.string.life , Screen.LifeQuotesScreen),
            GridItems(R.drawable.love, R.string.love, Screen.LoveQuotesScreen),
            GridItems(R.drawable.wisdom, R.string.wisdom,Screen.WisdomQuotesScreen),
            GridItems(R.drawable.courage, R.string.courage, Screen.CourageQuotesScreen),
            GridItems(R.drawable.friendship, R.string.friendship, Screen.FriendShipQuotesScreen),
            GridItems(R.drawable.happiness, R.string.happiness, Screen.HappinessQuotesScreen ),
            GridItems(R.drawable.inspiring,R.string.inspiring,Screen.InspiringQutoesScreen),
            GridItems(R.drawable.success, R.string.success, Screen.SuccessQuotesScreen),
            GridItems(R.drawable.perseverance,R.string.perseverance,Screen.PerseveranceQuotesScreen),
        )
    }
}