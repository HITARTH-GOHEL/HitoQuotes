package com.example.hitoquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hitoquotes.DataSource.DataSourceGIL
import com.example.hitoquotes.HomeScreen.HomeScreen
import com.example.hitoquotes.ListScreen.ChangeQuotesScreen
import com.example.hitoquotes.Navigation.NavGraph
import com.example.hitoquotes.QuotesCategoryGrid.QuotesCategoryGrid
import com.example.hitoquotes.ui.theme.HitoQuotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HitoQuotesTheme {


                NavGraph()
            }
        }
    }

}