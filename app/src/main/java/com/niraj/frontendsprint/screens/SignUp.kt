package com.niraj.frontendsprint.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.niraj.frontendsprint.R
import com.niraj.frontendsprint.ui.theme.formulaFamily
import com.niraj.frontendsprint.ui.theme.robotoFamily

@Preview
@Composable
fun SignUp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            SignUpAnimation()
            SignUpForm()
        }
    }
}

@Composable
fun SignUpForm() {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        Text(
            text = "SIGN-UP",
            color = Color.White,
            textAlign = TextAlign.Start,
            fontFamily = formulaFamily,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Create an account to become a member",
            color = Color.White,
            textAlign = TextAlign.Start,
            fontFamily = robotoFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun SignUpAnimation() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.signup))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier
            .width(400.dp)
            .height(250.dp)
    )
}