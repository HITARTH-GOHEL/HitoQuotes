package com.example.hitoquotes.Category.Happiness

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.HappinessQuotes
import com.example.hitoquotes.DataSource.DatasSourceOfHappinessQuotes


@Composable
fun HappinessQuotesList(
    happinessQuoteslist: List<HappinessQuotes>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.padding(top = 70.dp)) {
        items(happinessQuoteslist) { happinessQuotes ->
            HappinessQuotesCard(
                happinessQuotes = happinessQuotes,
                text = LocalContext.current.getString(happinessQuotes.stringResourceId)
            )
        }
        }
    }


@Preview
@Composable
fun HappinessQuotesListPreview() {
    HappinessQuotesList(happinessQuoteslist = DatasSourceOfHappinessQuotes().loadHappinessQuotes())
}
