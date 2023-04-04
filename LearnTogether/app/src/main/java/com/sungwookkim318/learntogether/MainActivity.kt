package com.sungwookkim318.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sungwookkim318.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LearnTogether()
                }
            }
        }
    }
}

@Composable
fun LearnTogether() {
    Column() {
        TopBarImage()
        TitleText()
        FirstBodyText()
        SecondBodyText()
    }
}

@Composable
fun TitleText() {
    Text(stringResource(R.string.title_string),
        modifier = Modifier
            .padding(all = 16.dp)

        )
}

@Composable
fun FirstBodyText() {
    Text(stringResource(R.string.first_body_text),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun SecondBodyText() {
    Text(stringResource(id = R.string.second_body_text),
        modifier = Modifier.padding(all = 16.dp),
        textAlign = TextAlign.Justify
    )
}


@Composable
fun TopBarImage() {
    Image(painterResource(id = R.drawable.bg_compose_background), contentDescription = null)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        LearnTogether()
    }
}