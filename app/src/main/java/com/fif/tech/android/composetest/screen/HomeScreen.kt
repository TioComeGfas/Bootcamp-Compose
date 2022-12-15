package com.fif.tech.android.composetest.screen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.fif.tech.android.composetest.components.*
import com.fif.tech.android.composetest.R

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    // Vertical alignment
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
    ) {
        var contentText by remember { mutableStateOf("") }
        val elementList = remember { mutableStateListOf<String>() }

        TitleText("PRUEBA COMPOSE")
        Divider2()
        elementList.iterator().forEach {
            CustomCard(R.drawable.user, it, "Developer") { image, title, subtitle ->
                Log.e("FREDY", "OnClick")
                navController.navigate(route = ScreensExperience.DetailsScreen.addArguments(image.toString(), title, subtitle))
            }
        }
        CustomTextField(content = contentText, onChange = { contentText = it })
        CustomButton(modifier = Modifier, content = "Add new member") {
            elementList.add(contentText)
            contentText = ""
        }
    }
}