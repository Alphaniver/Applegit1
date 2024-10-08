package com.example.applegit.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.applegit.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.pexel),
            contentDescription = "Image",
            contentScale = ContentScale.FillBounds
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = { Text(text = "Justice with Judy") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "home",
                        tint = Color.DarkGray
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Gray,
                titleContentColor = Color.DarkGray,
                navigationIconContentColor = Color.LightGray
            ),
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Person, contentDescription = "person")

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "search")

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu")

                }
            }

        )
        Row(modifier = Modifier.wrapContentWidth()) {
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.tree),
                        contentDescription = "Image",

                        )

                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
//                        CREATE BUTTON
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "About Company")

                    }

                }







            }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.tree),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "Update client" +
                                    "")

                    }

                }








            }

        }

        Row(modifier = Modifier.wrapContentWidth()) {
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.tree),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "Add a client" + "")

                    }

                }








            }
            Card(modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.tree),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "View all clients" +
                                    "")

                    }

                }








            }

        }

    }



}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

