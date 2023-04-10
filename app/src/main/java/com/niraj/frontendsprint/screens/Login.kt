package com.niraj.frontendsprint.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.niraj.frontendsprint.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.niraj.frontendsprint.ui.theme.formulaFamily
import com.niraj.frontendsprint.ui.theme.robotoFamily

@Preview
@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            LoginAnimation()
            Form()
        }
    }
}

@Composable
fun Form(){
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        Text(
            text = "Login",
            color = Color.White,
            textAlign = TextAlign.Start,
            fontFamily = formulaFamily,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Enter your email and password to login",
            color = Color.White,
            textAlign = TextAlign.Start,
            fontFamily = robotoFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Email",
            color = Color.White,
            textAlign = TextAlign.Start,
            fontFamily = robotoFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = "hello@company.com",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Black,
                placeholderColor = Color.White,
                textColor = Color.White
            ),
            shape = RoundedCornerShape(corner = CornerSize(20.dp))
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Password",
            color = Color.White,
            textAlign = TextAlign.Start,
            fontFamily = robotoFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = "Your password",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Black,
                placeholderColor = Color.White,
                textColor = Color.White
            ),
            shape = RoundedCornerShape(corner = CornerSize(20.dp))
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text (text = "Forgot Password?", textAlign = TextAlign.Right, color = Color.White)
        }
        Spacer(modifier = Modifier.height(25.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(66.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red, contentColor = Color.White)
        ) {
            Text(
                "LOGIN",
                fontFamily = formulaFamily,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(Modifier.height(5.dp))
        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text (text = "I am new user! SignUp", textAlign = TextAlign.Right, color = Color.White)
        }
    }
}

@Composable
fun LoginAnimation() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.login))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier
            .width(400.dp)
            .height(250.dp)
    )
}