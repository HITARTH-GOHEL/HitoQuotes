package com.example.hitoquotes.ShareOption

import android.content.Context
import android.content.Intent
import androidx.compose.runtime.Composable
fun shareText(context: Context, text: String) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_TEXT, text)
    }
    val chooser = Intent.createChooser(intent, "Share via")
    context.startActivity(chooser)

}