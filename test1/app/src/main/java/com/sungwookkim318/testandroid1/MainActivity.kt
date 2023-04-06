package com.sungwookkim318.testandroid1

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sungwookkim318.testandroid1.ui.theme.TestAndroid1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestAndroid1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    QuadBoxView()
                }
            }
        }
    }
}

@Composable
fun ColorTextBoxView(title: String, body: String, color: Color, modifier: Modifier) {
    Column(
        modifier
            .background(color = color)
            .fillMaxSize()
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify
        )
        Text(body,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun QuadBoxView() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            ColorTextBoxView("Text composable","Displays text and follows Material Design guidelines.", Color.Green, Modifier.weight(1f))
            ColorTextBoxView("Image composable","Creates a composable that lays out and draws a given Painter class object.", Color.Yellow, Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            ColorTextBoxView("Row composable","A layout composable that places its children in a horizontal sequence.", Color.Cyan, Modifier.weight(1f))
            ColorTextBoxView("Column composable","A layout composable that places its children in a vertical sequence.", Color.LightGray, Modifier.weight(1f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestAndroid1Theme {
        QuadBoxView()
    }
}