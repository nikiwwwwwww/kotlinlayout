package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider.value
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import java.time.format.TextStyle

//import androidx.compose.runtime.Composable

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
                Text(text = "Здесь размещен текст")
            }
            Box(modifier = Modifier
                .fillMaxHeight(0.15F)
                .background(colorResource(id = R.color.orange))
                .border(5.dp, Color.Black)
                .fillMaxWidth())
            {
                Button(onClick = {
                        //обработка нажатия
                     }, modifier = Modifier
                            .fillMaxSize()) {
                    Text("Button")
                }
            }
            Box(modifier = Modifier
                .fillMaxHeight(0.2F)
                .background(Color.White)
                .fillMaxWidth())
            {
              Image(painter = painterResource(id = R.drawable.img), contentDescription = "Изображение")
            }
            Box(modifier = Modifier
                .fillMaxHeight(0.25F)
                .background(colorResource(id = R.color.sky_blue))
                .border(5.dp, Color.Black)
                .fillMaxWidth())
            {
                Spacer(modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Red)
                    .align(Alignment.Center))


            }
            Box(modifier = Modifier
                .fillMaxHeight(0.15F)
                .background(colorResource(id = R.color.Prelude))
                .border(5.dp, Color.Black)
                .fillMaxWidth())
            {
                val message = remember{mutableStateOf("")}

                TextField(
                    value = message.value,
                    onValueChange = {newText -> message.value = newText}
                )
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

                    }
                }
            }
        }
    }

}


