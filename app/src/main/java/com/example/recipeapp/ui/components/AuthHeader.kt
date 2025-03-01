package com.example.recipeapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LunchDining
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AuthHeader(
    modifier: Modifier = Modifier,
//               imageSrc: String, imageTitle: String
) {
//    AsyncImage(modifier = modifier, model = imageSrc, contentDescription = imageTitle)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            Icons.Filled.LunchDining,
            contentDescription = "App Logo Icon",
            Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(15))
                .background(color = MaterialTheme.colorScheme.primary),
            tint = Color.White

        )
        Text("Recipes App")
    }
}