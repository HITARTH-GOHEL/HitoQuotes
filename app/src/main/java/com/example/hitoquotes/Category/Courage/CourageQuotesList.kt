package com.example.hitoquotes.Category.Courage

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.CourageQuotes

@Composable
fun CourageQuotesList(
    courageQuoteslist: List<CourageQuotes>,
    modifier: Modifier = Modifier
) {

    LazyColumn(modifier = modifier.padding(top = 70.dp)) {
        items(courageQuoteslist) { courageQuotes ->
            CourageQuotesCard(
                courageQuotes = courageQuotes,

                text = LocalContext.current.getString(courageQuotes.stringResourceId)
                )

        }

    }
}