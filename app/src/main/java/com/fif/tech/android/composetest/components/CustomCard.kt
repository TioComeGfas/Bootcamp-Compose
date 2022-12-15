package com.fif.tech.android.composetest.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CustomCard(
    @DrawableRes drawable: Int,
    title: String,
    subtitle: String,
    onClick: (image: Int, title: String, subtitle: String) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable { onClick(drawable, title, subtitle) },
        backgroundColor = Color.LightGray,
    ) {
        Row(
            modifier = Modifier.padding(10.dp)
        ) {
            Image(
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp),
                painter = painterResource(id = drawable),
                contentDescription = null
            )
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = title)
                Text(text = subtitle)
            }
        }
    }
}