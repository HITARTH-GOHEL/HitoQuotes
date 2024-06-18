package com.example.hitoquotes.Category.FriendShip

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.hitoquotes.DataClass.FriendShipQuotes

@Composable
fun FriendShipQuotesList(
    friendshipQuoteslist: List<FriendShipQuotes>,
    modifier: Modifier = Modifier
) {

    LazyColumn(modifier = modifier.padding(top = 70.dp)) {
        items(friendshipQuoteslist) { friendshipQuotes ->
            FriendShipQuotesCard(
                friendShipQuotes = friendshipQuotes,
                text = LocalContext.current.getString(friendshipQuotes.stringResourceId)
            )
        }
    }
}