package com.example.composepraactice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepraactice.ui.theme.ComposePraacticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePraacticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun ComposeArticle() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
//            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth(),
        )
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
        )

        Text(
            text = stringResource(id = R.string.short_description),
            modifier = Modifier.padding(16.dp),
        )

        Text(
            text = stringResource(id = R.string.short_description),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            fontSize = 12.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposePraacticeTheme {
        ComposeArticle()
    }
}
