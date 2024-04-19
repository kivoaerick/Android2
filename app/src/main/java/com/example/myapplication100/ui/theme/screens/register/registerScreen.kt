package com.example.morningmvvm.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication100.R
import com.example.myapplication100.data.AuthViewModel
import com.example.myapplication100.navigation.ROUTE_HOME
import com.example.myapplication100.navigation.ROUTE_LOGIN
import com.example.myapplication100.navigation.ROUTE_LOGIN

//import com.example.firebaseauth.data.AuthViewModel
//import com.example.firebaseauth.navigation.ROUTE_LOGIN
//import com.example.firebaseauth.navigation.ROUTE_REGISTER
@Composable
fun RegisterScreen(navController: NavController){
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current
    Image(painter = painterResource(id = R.drawable.favorites), contentDescription = "", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize())
    Column(modifier = Modifier
        .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(painter = painterResource(id = R.drawable.placeholder), contentDescription = "", modifier = Modifier.width(50.dp))
Spacer(modifier = Modifier.height(25.dp))
        Text(text = "Register here",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier.background(color = Color.Cyan, shape = RoundedCornerShape(10.dp))) {
            OutlinedTextField(
                value = email, onValueChange = { email = it },
                label = { Text(text = "Enter Email" ) },

                keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),

                )
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value =pass , onValueChange = {pass=it},
                label = { Text(text = "Enter password") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(value =confirmpass , onValueChange = {
                confirmpass=it},
                label = { Text(text = "Enter Confirm Pass") },

                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))


            Button(onClick = {
                val myregister=AuthViewModel(navController,context)
                myregister.signup(email.text.trim(),pass.text.trim(),
                    confirmpass.text.trim())
                navController.navigate(ROUTE_HOME)




            }, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Register ")
            }
            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate(ROUTE_LOGIN)
            }, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Have an Account? Click to Login" )
            }

        }
        }

        }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(rememberNavController())

}