package com.example.myapplication100.navigation

import AddProductsScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.morningmvvm.ui.theme.screens.home.HomeScreen
import com.example.morningmvvm.ui.theme.screens.login.LoginScreen
import com.example.morningmvvm.ui.theme.screens.register.RegisterScreen
import com.example.myapplication100.ui.theme.screens.products.UpdateProductsScreen
import com.example.myapplication100.ui.theme.screens.products.ViewProductsScreen

@Composable
fun TopBar(navController: NavHostController) {

}

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String = ROUTE_REGISTER
){
    NavHost(navController =navController ,
        modifier = modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            TopBar(navController)
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN){
            TopBar(navController)
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            TopBar(navController)
            RegisterScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT){
            TopBar(navController)
            AddProductsScreen(navController)

        }
        composable(ROUTE_UPDATE_PRODUCT+"/{id}"){passedData ->
            UpdateProductsScreen(
                navController,passedData.arguments?.getString("id")!! )
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
    }}