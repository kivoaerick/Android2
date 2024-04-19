package com.example.morningmvvm.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication100.R
import com.example.myapplication100.navigation.ROUTE_ADD_PRODUCT
import com.example.myapplication100.navigation.ROUTE_VIEW_PRODUCT

//import com.example.myapplication100.navigation.ROUTE_ABOUT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Card (modifier = Modifier.height(100.dp)){
            Icon(painter = painterResource(id = R.drawable.pin), contentDescription ="" )
            
        }
        var context= LocalContext.current
        //  var productdata=productviewmodel(navController,context)

        Text(text = "Welcome to Home page",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(70.dp))
//        Row {
      Box(modifier = Modifier.width(250.dp)){
          Spacer(modifier = Modifier.height(10.dp))
          Row {

              Icon(painter = painterResource(id = R.drawable.box) , contentDescription ="", modifier = Modifier.width(90.dp) )
              Icon(painter = painterResource(id = R.drawable.globe) , contentDescription ="", modifier = Modifier.width(90.dp) )

              Icon(painter = painterResource(id = R.drawable.home) , contentDescription ="", modifier = Modifier.width(90.dp))
          }

          }
        Spacer(modifier = Modifier.height(0.dp))
        Box(modifier = Modifier.shadow(25.dp)){
            Spacer(modifier = Modifier.height(10.dp))
            Card(onClick = { navController.navigate(ROUTE_ADD_PRODUCT) }) {
                Text(text = "Add Product", textDecoration = TextDecoration.Underline)

        }
            }
        Spacer(modifier = Modifier.height(0.dp))
        Card(onClick = { navController.navigate(ROUTE_VIEW_PRODUCT) }) {
            Text(text = "View Product", textDecoration = TextDecoration.Underline)

        }
//        Button(onClick = {
//            navController.navigate(ROUTE_ADD_PRODUCT)
//        },modifier = Modifier.fillMaxWidth()) {
//            Text(text = "Add Product")
//
//        }
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Button(onClick = {
//            navController.navigate(ROUTE_VIEW_PRODUCT)
//        },modifier = Modifier.fillMaxWidth()) {
//            Text(text = "View Product")
//        }
        Spacer(modifier = Modifier.height(0.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Magenta), contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.icon), contentDescription = "")

        }
        Spacer(modifier = Modifier.height(0.dp))
        Text(text = "GOOD LUCK", fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold,
            fontSize = 20.sp, color = Color.Yellow, textDecoration = TextDecoration.Underline)
        }



    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}
