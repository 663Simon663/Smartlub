package com.example.smartlubsimon.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartlubsimon.ui.theme.blue1

@Preview
@Composable
fun CreatePassword (/*navHost: NavHostController*/){
    Column(modifier = Modifier
        .fillMaxSize(1f)
        .background((Color.White))) {
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
        ){
            Text(
                text = "Пропустить", fontSize = 15.sp, fontWeight = FontWeight.W400,textAlign = TextAlign.End, color = blue1,
                modifier = Modifier.padding(top = 70.dp, end = 20.dp,bottom = 40.dp),
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                text = "Создайте пароль", fontSize = 28.sp, fontWeight = FontWeight.W700,
            )
            Text(
                text = "Для защиты ваших персональных данных",
                fontSize = 16.sp,
                color = Color(0xFF7E7E9A),
                modifier = Modifier.padding(top = 20.dp),
                textAlign = TextAlign.Center


            )
        }

    }
}