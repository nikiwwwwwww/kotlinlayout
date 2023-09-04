package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLayout()
        }
    }
}
@Preview
@Composable
fun MyLayout(){
    Box(modifier = Modifier
        .fillMaxSize()
        .border(5.dp, Color.Black))
    {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier
                .fillMaxHeight(0.05F)
                .background(Color.White)
                .fillMaxWidth())
            {
                Text(text = "")
            }
            Box(modifier = Modifier
                .fillMaxHeight(0.15F)
                .background(colorResource(id = R.color.orange))
                .border(5.dp, Color.Black)
                .fillMaxWidth())
            {
                Text(text = "")
            }
            Box(modifier = Modifier
                .fillMaxHeight(0.2F)
                .background(Color.White)
                .fillMaxWidth())
            {
                Text(text = "")
            }
            Box(modifier = Modifier
                .fillMaxHeight(0.25F)
                .background(colorResource(id = R.color.sky_blue))
                .border(5.dp, Color.Black)
                .fillMaxWidth())
            {
                Text(text = "")
            }
            Box(modifier = Modifier
                .fillMaxHeight(0.15F)
                .background(colorResource(id = R.color.Prelude))
                .border(5.dp, Color.Black)
                .fillMaxWidth())
            {
                Text(text = "")
            }
            Box(modifier = Modifier
                .fillMaxHeight(1F)
                .background(Color.White)
                .fillMaxWidth())
            {
                Row(modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically)
                {
                    Box(modifier = Modifier
                        .border(5.dp, Color.Black)
                        .height(200.dp)
                        .width(200.dp)
                        .background(colorResource(id = R.color.Purpureus)))
                    {
                        Text(text = "")
                    }
                }
            }
        }
    }

}

