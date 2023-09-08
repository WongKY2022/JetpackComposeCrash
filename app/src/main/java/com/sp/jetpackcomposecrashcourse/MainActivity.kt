package com.sp.jetpackcomposecrashcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sp.jetpackcomposecrashcourse.ui.theme.JetpackComposeCrashCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCrashCourseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingButton("Android")
                }
            }
        }
    }
}
@Composable
fun GreetingButton(name1:String){
    Button(onClick = { /*TODO*/ }) {
        Greeting(name=name1)
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        modifier = Modifier
            .clickable ( onClick={ } )
            .width(200.dp)
            .height(200.dp)
            .padding(15.dp),
        style = MaterialTheme.typography.h5,
        fontWeight = FontWeight.SemiBold)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeCrashCourseTheme {
        GreetingButton("Android")
    }
}