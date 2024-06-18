package com.example.hitoquotes.Category.Love

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.LoveQuotes

@Composable
fun LoveQuotesList(
    loveQuoteslist: List<LoveQuotes>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = Modifier.padding(top = 70.dp)) {
        items(loveQuoteslist) { loveQuotes ->
            LoveQuotesCard(
                loveQuotes = loveQuotes,
                text = LocalContext.current.getString(loveQuotes.stringResourceId)
            )
        }
    }
}