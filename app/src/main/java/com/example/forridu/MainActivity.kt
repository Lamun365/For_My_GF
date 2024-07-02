package com.example.forridu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.forridu.ui.theme.ForRiduTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ForRiduTheme {
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background
                ) {
                    SorryViewer()
                }
            }
        }
    }
}

val fontOwn: FontFamily = FontFamily(
    Font(R.font.regular, FontWeight.Normal),
    Font(R.font.extralight, FontWeight.ExtraLight)
)

@Composable
fun SorryViewer() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(
            id = R.drawable.ridu_love),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize(),
            alpha = 0.5f
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.sorry),
                fontFamily = fontOwn,
                fontWeight = FontWeight.Normal,
                fontSize = 56.sp,
                lineHeight = 56.sp,
                color = colorResource(id = R.color.txt_color),
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.padding(top = 32.dp))
            Text(
                text = stringResource(R.string.couldn1),
                fontFamily = fontOwn,
                fontWeight = FontWeight.Normal,
                fontSize = 30.sp,
                lineHeight = 40.sp,
                color = colorResource(id = R.color.txt_color),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = stringResource(R.string.couldn2),
                fontFamily = fontOwn,
                fontWeight = FontWeight.Normal,
                fontSize = 30.sp,
                lineHeight = 40.sp,
                color = colorResource(id = R.color.txt_color),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))

            Text(
                text = stringResource(R.string.couldn3),
                fontFamily = fontOwn,
                fontWeight = FontWeight.Normal,
                fontSize = 30.sp,
                lineHeight = 40.sp,
                color = colorResource(id = R.color.txt_color),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(top = 16.dp))
            Text(
                text = stringResource(R.string.promise),
                fontFamily = fontOwn,
                fontWeight = FontWeight.Normal,
                fontSize = 30.sp,
                lineHeight = 40.sp,
                color = colorResource(id = R.color.txt_color),
                textAlign = TextAlign.Center
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ForRiduTheme {
        SorryViewer()
    }
}