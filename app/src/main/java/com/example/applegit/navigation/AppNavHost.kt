package com.example.applegit.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.applegit.ui.theme.screens.about.About
import com.example.applegit.ui.theme.screens.clients.AddClient
import com.example.applegit.ui.theme.screens.clients.UpdateClient

import com.example.applegit.ui.theme.screens.home.HomeScreen
import com.example.applegit.ui.theme.screens.login.Login
import com.example.applegit.ui.theme.screens.register.Greeting

@Composable
fun AppNavHost(navController:NavHostController= rememberNavController(),
               startDestination:String = ROUTE_UPDATE_CLIENT)
{
    NavHost(navController=navController,
        startDestination=startDestination){
        composable(ROUTE_REGISTER){ Greeting("Jake",navController)}
        composable(ROUTE_HOME){ HomeScreen(navController)}
        composable(ROUTE_LOGIN){ Login(navController)}
        composable(ROUTE_ABOUT){About(navController)}
        composable(ROUTE_ADD_CLIENT){ AddClient(navController) }
        composable(ROUTE_UPDATE_CLIENT){ UpdateClient(navController )}
    }   

}
