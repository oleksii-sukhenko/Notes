package com.example.notes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Preview
@Composable
private fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(10.dp)

    ) {
        Text(
            text = "Folder",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 10.dp)
        )
        LazyColumn(
            modifier = Modifier
                .background(Color.White)


        ) {
            item {
                Text(
                    text = "Month/Year",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                ListItem()
            }
            item {
                Text(
                    text = "Month/Year",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                ListItem()
            }
            item {
                Text(
                    text = "Month/Year",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                ListItem()
            }
            item {
                Text(
                    text = "Month/Year",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                ListItem()
            }
            item {
                Text(
                    text = "Month/Year",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                ListItem()
            }
            item {
                Text(
                    text = "Month/Year",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                ListItem()
            }
            item {
                Text(
                    text = "Month/Year",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                ListItem()
            }
            item {
                Text(
                    text = "Month/Year",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
                ListItem()
            }
        }
    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.Bottom,
    ) {
        AddButton()
    }
}


@Composable
private fun ListItem() {
    Card(
        modifier = Modifier
            .padding(top = 10.dp, bottom = 10.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(15.dp),
        elevation = 15.dp
    ) {
        Column(
            modifier = Modifier.padding(start = 30.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row() {
                Text(
                    text = "Title",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp)

            ) {
                Text(
                    text = "Date",
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray,
                    modifier = Modifier.padding(end = 10.dp)
                )
                Text(
                    text = "Subtitle",
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray,
                    modifier = Modifier.padding(end = 10.dp)
                )
            }
        }

    }
}

@Composable
private fun AddButton() {
    Box(
        modifier = Modifier
            .padding(24.dp)
            .size(64.dp)
            .clip(CircleShape)
            .background(Color.Yellow)
            .clickable { },
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = "+",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,

            )
    }
}

