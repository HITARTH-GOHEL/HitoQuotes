package com.example.hitoquotes.Category.change

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.ChangeQuotes
import com.example.hitoquotes.DataSource.DataSourceChangeQuotes
import com.example.hitoquotes.R

@Composable
fun ChangeQuotesList(
    changeQuoteslist: List<ChangeQuotes>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.padding(top = 70.dp)) {
        items(changeQuoteslist) { changeQuotes ->
            ChangeQuotesCard(
                changeQuotes = changeQuotes,
                text = LocalContext.current.getString(changeQuotes.stringResourceId)
            )

        }

    }
}

@Preview
@Composable
private fun ChangeQuotesCardPreview() {
    ChangeQuotesList(changeQuoteslist = DataSourceChangeQuotes().loadChangeQuotes())
}