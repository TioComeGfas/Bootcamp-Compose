package com.fif.tech.android.composetest.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailScreen(
    navController: NavController,
    drawable: Int,
    title: String,
    subtitle: String
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            painter = painterResource(id = drawable),
            contentDescription = null
        )
        Text(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            text = title,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            text = subtitle,
            textAlign = TextAlign.Center
        )
    }
}