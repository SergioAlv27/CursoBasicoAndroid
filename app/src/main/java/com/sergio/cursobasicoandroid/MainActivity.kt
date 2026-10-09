package com.sergio.cursobasicoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.sergio.cursobasicoandroid.composables.ButtonExample
import com.sergio.cursobasicoandroid.composables.ImageExample
import com.sergio.cursobasicoandroid.composables.TextExample
import com.sergio.cursobasicoandroid.ui.theme.CursoBasicoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoBasicoAndroidTheme {
                TextExample(name="Sergio")
                ImageExample()
                ButtonExample()
                }
            }
        }
    }

@Preview (showBackground = true)
@Composable
fun Example (){
    Text(text= "Hola esto es una prueba", fontSize = 40.sp)
}
@Composable
fun Greeting(name: String = "Android", modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoBasicoAndroidTheme {
        Greeting("Android")
    }
}