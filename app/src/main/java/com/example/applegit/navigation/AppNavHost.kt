package com.example.applegit.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.applegit.Greeting
import com.example.applegit.ui.theme.screens.home.HomeScreen

@Composable
fun AppNavHost(navController:NavHostController= rememberNavController(),
               startDestination:String = ROUTE_REGISTER)
{
    NavHost(navController=navController,
        startDestination=startDestination){
        composable(ROUTE_REGISTER){ Greeting("Jake",)}
        composable(ROUTE_HOME){ HomeScreen(navController)}
    }   

}
