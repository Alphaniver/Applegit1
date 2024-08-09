package com.example.applegit.ui.theme.screens.clients



import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.applegit.R


@Composable
fun UpdateClient(navController: NavController){
    val imageuri = rememberSaveable() {
        mutableStateOf(value = "")
    }
    val painter = rememberImagePainter(
        if (imageuri.value.isEmpty())
            R.drawable.tree
        else
            imageuri.value
    )
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ){
            uri: Uri? ->
        uri?.let { imageuri.value = it.toString() }
    }



    var firstname by remember {
        mutableStateOf(value = "")
    }
    var lastname by remember {
        mutableStateOf(value = "")
    }
    var gender by remember {
        mutableStateOf(value = "")
    }
    var age by remember {
        mutableStateOf(value = "")
    }
    var bio by remember {
        mutableStateOf(value = "")
    }
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(Icons.Filled.Home, contentDescription ="home icon" )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(Icons.Filled.Face, contentDescription ="face" )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(Icons.Filled.Notifications, contentDescription = "notify")
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = { /*TODO*/ }, containerColor = BottomAppBarDefaults.bottomAppBarFabColor) {
                        androidx.compose.material3.Icon(Icons.Filled.Share, contentDescription ="share icon" )
                    }
                }
            )
        }
    ) { innerPadding ->


        Column (
            modifier = Modifier

                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(10.dp)
                .fillMaxWidth()
                .background(color = Color.DarkGray)
        ){
            Text(text = "UPDATE CLIENT",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .background(Color.Cyan))
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "UPDATE")}


            }
            Column (
                modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
            ){
                Card (
                    shape = CircleShape,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(180.dp)
                ){
                    Image(painter = painter,
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { launcher.launch("image/*") },
                        contentScale = ContentScale.Crop)

                }
                Text(text = "Edit picture")

            }

            OutlinedTextField(
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally),
                label = {Text(text = "Enter First Name")},
                placeholder =  {Text(text = "Please Enter First Name")},
                value = firstname ,
                onValueChange ={
                        newName -> firstname = newName
                } )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally),
                label = {Text(text = "Enter Last Name")},
                placeholder =  {Text(text = "Please Enter Last Name")},
                value = lastname ,
                onValueChange ={
                        newName -> lastname = newName
                } )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally),
                label = {Text(text = "Enter Your Gender")},
                placeholder =  {Text(text = "Please Enter Your Gender")},
                value = gender ,
                onValueChange ={
                        newName -> gender = newName
                } )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally),
                label = {Text(text = "Enter Your Age")},
                placeholder =  {Text(text = "Please Enter Your Age")},
                value = age ,
                onValueChange ={
                        newName -> age = newName
                } )
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(
                modifier = Modifier
                    .height(160.dp)
                    .wrapContentWidth()
                    .align(Alignment.CenterHorizontally),
                label = {Text(text = "Enter Your Description")},
                placeholder =  {Text(text = "Please Enter Your Bio")},
                value = bio ,
                singleLine = false,
                onValueChange ={
                        newName -> bio = newName
                } )


        }

    }







}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UpdateClientPreview(){
    AddClient(rememberNavController())
}






















