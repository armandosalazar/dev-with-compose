package com.example.devwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.devwithcompose.ui.theme.DevWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevWithComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

@Preview(showBackground = true, name = "Android Greeting", showSystemUi = true)
@Composable
fun DefaultPreview() {
    DevWithComposeTheme {
        // Los hijos se ajustan de forma relativa de acuerdo al padre
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Greeting("Android", modifier = Modifier.align(Alignment.BottomEnd))
            Greeting("Armando")
            Column(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .background(Color.Magenta)
                    .fillMaxWidth()
                    .height(150.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Hola mundo", modifier = Modifier.background(Color.Yellow))
                Text(text = "Hola mundo", modifier = Modifier.background(Color.LightGray))
                Text(text = "Hola mundo", modifier = Modifier.background(Color.Cyan))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Yellow)
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Hola mundo", modifier = Modifier.background(Color.LightGray))
                    Text(text = "Hola mundo", modifier = Modifier.background(Color.Cyan))
                }
            }
        }
    }
}