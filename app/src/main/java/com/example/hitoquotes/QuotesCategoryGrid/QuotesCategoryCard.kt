package com.example.hitoquotes.QuotesCategoryGrid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.hitoquotes.DataClass.GridItems

@Composable
fun QuotesCategoryCard(
    gridItems: GridItems,
    modifier: Modifier,
    navController: NavController
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(150.dp),
        onClick =
        {
            navController.navigate(gridItems.screen.route)
        }
    ) {
        Image(
            painter =
            painterResource(id = gridItems.did),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(120.dp)




        )
        Text(
            text = LocalContext.current.getString(gridItems.name),
            fontSize = 20.sp,
            style = MaterialTheme.typography.labelSmall,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}