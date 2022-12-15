package com.fif.tech.android.composetest.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Divider2() {
    androidx.compose.material.Divider(
        modifier = Modifier.fillMaxWidth(),
        color = Color.Black,
        thickness = 1.dp
    )
}