package com.fif.tech.android.composetest

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fif.tech.android.composetest.components.*
import com.fif.tech.android.composetest.screen.*
import com.fif.tech.android.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ScreenTest()
                }
            }
        }
    }
}

@Composable
fun ScreenTest() {
    val navController = rememberNavController()
    var statusBackButton by remember { mutableStateOf<Boolean>(false) }
    Scaffold(
        topBar = {
            Toolbar(isBackEnabled = statusBackButton) {
                navController.popBackStack()
            }
        }
    ) {
        Navigator(navController) {
            statusBackButton = it
        }
    }
}

@Preview(showBackground = true, device = Devices.NEXUS_5X)
@Composable
fun DefaultPreview() {
    //val navController = rememberNavController()
    ComposeTestTheme {
        //ScreenTest(navController)
    }
}