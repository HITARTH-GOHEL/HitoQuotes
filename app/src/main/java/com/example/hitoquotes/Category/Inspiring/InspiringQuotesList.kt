package com.example.hitoquotes.Category.Inspiring

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.InspiringQutoes
import com.example.hitoquotes.DataSource.DataSourceofinspiringQutoes
import com.example.hitoquotes.R
import javax.sql.DataSource


@Composable
fun InspiringQuotesList(
    inspiringqutoeslist: List<InspiringQutoes>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.padding(top = 70.dp)) {
        items(inspiringqutoeslist) {  iq ->
            InspriringQuotesCard(
                iq = iq,
                text = LocalContext.current.getString(iq.stringResourceId),
            )
        }

    }
}

@Preview
@Composable
fun PreviewInspiringQuotesList() {
    InspiringQuotesList(inspiringqutoeslist = DataSourceofinspiringQutoes().loadInspiringQutoes())
}