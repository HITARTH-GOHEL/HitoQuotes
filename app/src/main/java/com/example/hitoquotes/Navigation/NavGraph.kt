package com.example.hitoquotes.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.hitoquotes.DataClass.ChangeQuotes
import com.example.hitoquotes.DataSource.DataSourceGIL
import com.example.hitoquotes.ListScreen.ChangeQuotesScreen
import com.example.hitoquotes.ListScreen.CourageQuotesScreen
import com.example.hitoquotes.ListScreen.FriendShipQuotesScreen
import com.example.hitoquotes.ListScreen.HappinessQuotesScreen
import com.example.hitoquotes.ListScreen.InspiringQuotesScreen
import com.example.hitoquotes.ListScreen.LifeQuotesScreen
import com.example.hitoquotes.ListScreen.LoveQuotesScreen
import com.example.hitoquotes.ListScreen.PerseveranceQuotesScreen
import com.example.hitoquotes.ListScreen.SuccessQuotesScreen
import com.example.hitoquotes.ListScreen.WisdomQuotesScreen
import com.example.hitoquotes.QuotesCategoryGrid.QuotesCategoryGrid

@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {

    NavHost(navController = navController, startDestination = Screen.QuotesCategoryGrid.route) {
        composable(Screen.QuotesCategoryGrid.route) {
            QuotesCategoryGrid(quotescategorygrid = DataSourceGIL().loadGridItems(), navController = navController)
        }
        composable(
            Screen.ChangeQuotesScreen.route
        ) {
            ChangeQuotesScreen(navController)
        }
        composable(
            Screen.CourageQuotesScreen.route
        ) {
            CourageQuotesScreen(navController)
        }
        composable(Screen.FriendShipQuotesScreen.route) {
            FriendShipQuotesScreen(navController)
        }
        composable(Screen.HappinessQuotesScreen.route) {
            HappinessQuotesScreen(navController = navController)
        }
        composable(Screen.InspiringQutoesScreen.route) {
           InspiringQuotesScreen(navController = navController)
        }
        composable(Screen.LifeQuotesScreen.route) {
            LifeQuotesScreen(navController = navController)
        }
        composable(Screen.LoveQuotesScreen.route) {
            LoveQuotesScreen(navController = navController)
        }
        composable(Screen.WisdomQuotesScreen.route) {
            WisdomQuotesScreen(navController = navController)
        }
        composable(Screen.SuccessQuotesScreen.route) {
            SuccessQuotesScreen(navController = navController)
        }
        composable(Screen.PerseveranceQuotesScreen.route) {
            PerseveranceQuotesScreen(navController = navController)
        }
     }
}