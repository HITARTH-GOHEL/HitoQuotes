package com.example.hitoquotes.Category.Perseverance

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.PerseveranceQuotes

@Composable
fun PerseveranceQuotesList(
    perseveranceQuoteslist: List<PerseveranceQuotes>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.padding(top = 70.dp)) {
        items(perseveranceQuoteslist) { perseveranceQuotes ->
            PerseveranceQuotesCard(
                perseveranceQuote = perseveranceQuotes,
                text = LocalContext.current.getString(perseveranceQuotes.stringResourceId)
            )
        }

    }
}