package com.example.hitoquotes.Category.Life

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.LifeQuotes
import com.example.hitoquotes.DataSource.DataSourceLifeQuotes


@Composable
fun LifeQuotesList(
    lifeQuoteslist: List<LifeQuotes>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.padding(top = 70.dp)) {
        items(lifeQuoteslist) { lifeQuotes ->
            LifeQuotesCard(
                lifeQuotes = lifeQuotes,
                text = LocalContext.current.getString(lifeQuotes.stringResourceId)
            )
        }
    }
}

@Preview
@Composable
fun LifeQuotesListPreview() {
    LifeQuotesList(
        lifeQuoteslist = DataSourceLifeQuotes().loadLifeQuotes()
    )

}