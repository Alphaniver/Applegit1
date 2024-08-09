package com.example.applegit.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.applegit.R
import com.example.applegit.navigation.ROUTE_LOGIN
import com.example.applegit.navigation.ROUTE_REGISTER

@Composable
fun Login( navController: NavController) {

    var userName by remember {
        mutableStateOf(value = "")
    }
    var secondName by remember {
        mutableStateOf(value = "")
    }
//    var email by remember {
//        mutableStateOf(value = "")
//    }
    var password by remember {
        mutableStateOf(value = "")
    }
//    val context = LocalContext.current
    Column(
        modifier= Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "please login first",
            fontSize = 20.sp,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Gray)
                .padding(20.dp)
                .fillMaxWidth()

        )

        Image(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.White)
                .wrapContentHeight(),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.j), contentDescription = "j logo"

        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .wrapContentHeight(),
            label = { Text(text = "Enter username ") },
            placeholder = { Text(text = "Please enter username") },
            value = userName,
            onValueChange = { newName ->
                userName = newName
            })
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        OutlinedTextField(modifier = Modifier
//            .align(Alignment.CenterHorizontally)
//            .wrapContentHeight(),
//            label = { Text(text = "Enter last name ") },
//            placeholder = { Text(text = "Please enter last name") },
//            value = secondName,
//            onValueChange = { newLastName ->
//                secondName = newLastName
//            })
        Spacer(modifier = Modifier.height(10.dp))

//        OutlinedTextField(modifier = Modifier
//            .align(Alignment.CenterHorizontally)
//            .wrapContentHeight(),
//            label = { Text(text = "Enter your email ") },
//            placeholder = { Text(text = "Please enter your email") },
//            value = email,
//            onValueChange = { newEmail ->
//                email = newEmail
//
//            })
//        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .wrapContentHeight(),
            label = { Text(text = "Enter your password ") },
            placeholder = { Text(text = "Please enter your password") },
            value = password,
            onValueChange = { newPassword ->
                password = newPassword
            })
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                navController.navigate(ROUTE_LOGIN)
            }
//            { val intent= Intent(context,Dashboard::class.java)
//                context.startActivity(intent) }
            , colors = ButtonDefaults.buttonColors(Color.Yellow),
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)
        )
        {
            Text(modifier = Modifier.padding(3.dp), color = Color.Black, text = "LOGIN HERE")

        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Yellow)
            )
            {
                Text(text = "REGISTER")

            }
            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Yellow)
            )
            {
                Text(text = "FORGOT PASSWORD?")

            }
        }

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPreview(){
    Login(rememberNavController())
}
