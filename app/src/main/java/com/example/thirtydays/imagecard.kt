package com.example.thirtydays


import androidx.compose.foundation.Image

import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable

fun Imagecard(
    title: String,
    description: String,
    image: Int,
    modifier: Modifier = Modifier

) {
    val isDarkTheme = isSystemInDarkTheme()

    val textColor = if (isDarkTheme) {
        Color.White
    } else {
        Color.Black
    }
    var cardClicked by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .padding(10.dp, 5.dp)
            .clickable {
                cardClicked = !cardClicked
            },


        shape = MaterialTheme.shapes.large,
        backgroundColor = MaterialTheme.colors.primary


             ) {
        Column(modifier = Modifier.padding(16.dp)
             ) {

            Text(
                text = title,
                style = MaterialTheme.typography.body1,
                color=textColor
                )

            Spacer(modifier = modifier.height(15.dp))



            Image(
                painter = painterResource(image),
                contentDescription = title,
                modifier = Modifier
                    .clip(MaterialTheme.shapes.large)
                    .fillMaxWidth()
                    .aspectRatio(3f/2f)
                    .clip(RoundedCornerShape(10.dp))
            )



            if (cardClicked) {
                Spacer(modifier = modifier.height(15.dp))
                Text(
                    text = description,
                    style = MaterialTheme.typography.body2,
                    color=textColor
                )
            }
        }
    }


}


