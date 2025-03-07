package com.example.recipeapp.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.recipeapp.R
import com.example.recipeapp.ui.theme.RecipeappTheme

@Composable
fun AuthHeader(
    modifier: Modifier = Modifier,
//               imageSrc: String, imageTitle: String
) {
//    AsyncImage(modifier = modifier, model = imageSrc, contentDescription = imageTitle)


       AsyncImage(
           model = R.drawable.brandimage,
           contentDescription = "Brand Image",
           contentScale = ContentScale.Crop,
           modifier = Modifier.blur(6.dp)

       )
        Text("Recipe Lab", style = MaterialTheme.typography.displayLarge, modifier = Modifier.offset(x = 50.dp, y = 100.dp), color = Color.Black)
}

@Preview(showBackground = true)
@Composable
private fun AuthHeaderPreview() {
    RecipeappTheme {
        AuthHeader()
    }

}