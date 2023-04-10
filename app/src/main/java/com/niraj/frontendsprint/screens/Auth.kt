package com.niraj.frontendsprint.screens

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.niraj.frontendsprint.R
import com.niraj.frontendsprint.ui.theme.formulaFamily


@Preview
@Composable
fun AuthScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {
        Box (
                contentAlignment = Alignment.Center
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically
            ) {
                AuthAnimation()
                Spacer(modifier = Modifier.width(100.dp))
                AuthAnimation()
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                ClubLogo()
                Spacer(Modifier.height(50.dp))
                Text(
                    text = "FRONTEND",
                    fontFamily = formulaFamily,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    fontSize = 20.sp
                )
                Spacer(Modifier.height(50.dp))
                Image(
                    painter = painterResource(id = R.drawable.helmet),
                    contentDescription = "Helmet",
                    modifier = Modifier.size(280.dp)
                )
                Spacer(Modifier.height(50.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .height(50.dp),
                    shape = RoundedCornerShape(66.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color.Black)
                ) {
                    Text(
                        "SIGN UP",
                            fontFamily = formulaFamily,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(Modifier.height(15.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
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
            }
        }
    }
}

@Preview
@Composable
fun ClubLogo(){
    Surface(
        modifier = Modifier
            .height(45.dp)
            .width(46.dp),
        color = Color.White,
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_icon),
                contentDescription = "Logo Icon",
                Modifier.size(30.dp)
            )
            Text(
                text = "ANDROID CLUB VITB",
                fontSize = 3.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun AuthAnimation() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.winwinred))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier.width(120.dp)
    )
}
