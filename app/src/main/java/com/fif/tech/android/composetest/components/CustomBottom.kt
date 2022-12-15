package com.fif.tech.android.composetest.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(modifier: Modifier, content: String, onClick: () -> Unit) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        onClick = { onClick() }
    ) {
        Text(text = content, color = Color.White)
    }
}

@Composable
@Preview(device = Devices.NEXUS_5X)
fun PreviewCustomButton() {
    CustomButton(Modifier, "Add new member") {

    }
}