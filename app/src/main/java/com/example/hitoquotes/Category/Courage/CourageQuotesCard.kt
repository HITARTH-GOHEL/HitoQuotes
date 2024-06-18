package com.example.hitoquotes.Category.Courage

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.CourageQuotes
import com.example.hitoquotes.ShareOption.shareText

@Composable
fun CourageQuotesCard(
    courageQuotes: CourageQuotes,
    modifier: Modifier = Modifier,
    text: String
) {
    val context = LocalContext.current
    Card(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = text,
            modifier = modifier.padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
        Icon(
            imageVector = Icons.Filled.Share,
            contentDescription = null ,
            modifier = Modifier
                .clickable {
                    shareText(context = context,text = text)
                }
                .padding(start = 10.dp,end = 15.dp, bottom = 10.dp)
                .align(Alignment.End)

        )
    }

}