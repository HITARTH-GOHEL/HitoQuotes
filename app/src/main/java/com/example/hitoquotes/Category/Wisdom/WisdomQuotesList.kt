package com.example.hitoquotes.Category.Wisdom

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.WisdomQuotes


@Composable
fun WisdomQuotesList(
    wisdomlist: List<WisdomQuotes>,
    modifier: Modifier = Modifier.padding(top = 70.dp)
) {
    LazyColumn(modifier = modifier) {
        items(wisdomlist) { wisdomQuotes ->
            WisdomQuotesCard(wisdomQuotes = wisdomQuotes,
                text = LocalContext.current.getString(wisdomQuotes.stringResourceId)
            )


        }
    }
}