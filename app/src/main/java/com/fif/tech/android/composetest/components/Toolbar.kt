package com.fif.tech.android.composetest.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fif.tech.android.composetest.R

@Composable
fun Toolbar(isBackEnabled: Boolean, onClick: () -> Unit) {
    TopAppBar(
        backgroundColor = Color.Gray
    ) {
        if(isBackEnabled) {
            // draw back button
            Image(
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp)
                    .clickable { onClick() },
                painter = painterResource(id = R.drawable.ic_arrow_left),
                contentDescription = null
            )
        }
        TitleText("Compose Prueba")
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewToolbar() {
    Toolbar(isBackEnabled = true) {

    }
}