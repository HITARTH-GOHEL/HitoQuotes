package com.example.hitoquotes.Category.Success

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.SuccessQuotes


@Composable
fun SuccessQuotesList(
    successQuoteslist: List<SuccessQuotes>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.padding(top = 70.dp)
    ) {
        items(successQuoteslist) {  successQuotes ->
            SuccessQuotesCard(
                successQuotes = successQuotes,
                text = LocalContext.current.getString(successQuotes.stringResourceId)
            )

        }
    }
}