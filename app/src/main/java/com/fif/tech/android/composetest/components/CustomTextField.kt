package com.fif.tech.android.composetest.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CustomTextField(content: String, onChange: (String) -> Unit) {
    TextField(
        value = content,
        onValueChange = onChange,
        modifier = Modifier.fillMaxWidth()
    )
}