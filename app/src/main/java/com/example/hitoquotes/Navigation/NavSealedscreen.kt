package com.example.hitoquotes.Navigation

import com.example.hitoquotes.DataClass.ChangeQuotes
import com.example.hitoquotes.DataClass.CourageQuotes
import com.example.hitoquotes.DataClass.FriendShipQuotes
import com.example.hitoquotes.DataClass.HappinessQuotes
import com.example.hitoquotes.DataClass.InspiringQutoes
import com.example.hitoquotes.DataClass.LifeQuotes
import com.example.hitoquotes.DataClass.LoveQuotes
import com.example.hitoquotes.DataClass.PerseveranceQuotes
import com.example.hitoquotes.DataClass.SuccessQuotes
import com.example.hitoquotes.DataClass.WisdomQuotes

sealed class Screen(val route: String) {
    object QuotesCategoryGrid : Screen("QuotesCategoryGrid")
    object ChangeQuotesScreen : Screen("ChangeQuotesScreen")
    object FriendShipQuotesScreen : Screen("FriendShipQuotesScreen")
    object SuccessQuotesScreen : Screen("SuccessQuotesScreen")
    object HappinessQuotesScreen : Screen("HappinessQuotesScreen")
    object LoveQuotesScreen : Screen("LoveQuotesScreen")
    object CourageQuotesScreen : Screen("CourageQuotesScreen")
    object LifeQuotesScreen : Screen("LifeQuotesScreen")
    object WisdomQuotesScreen : Screen("WisdomQuotesScreen")
    object PerseveranceQuotesScreen : Screen("PerseveranceQuotesScreen")
    object InspiringQutoesScreen : Screen("InspiringQutoesScreen")

}