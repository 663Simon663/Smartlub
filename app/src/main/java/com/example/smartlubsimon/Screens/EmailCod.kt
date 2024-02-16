package com.example.smartlubsimon.Screens

import android.content.res.Resources
import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.smartlubsimon.R
import com.example.smartlubsimon.ui.theme.blue1
import com.example.smartlubsimon.ui.theme.gray2
import com.example.smartlubsimon.ui.theme.gray3
import com.example.smartlubsimon.ui.theme.gray4

@Preview
@Composable
fun EmailCod (/*navHost: NavHostController*/){
    Column(modifier = Modifier
        .fillMaxSize(1f)
        .background((Color.White))) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(75.dp)
                .width(70.dp)
                .padding(top = 32.dp, start = 27.dp)
                .clip(RoundedCornerShape(10.dp))
                .clickable {
                    /*navHost.navigate("logInScreen")*/
                }
                .background(gray3)
        ) {
            Icon(painter = painterResource(id = R.drawable.vector),
                contentDescription = "",
                tint = gray4,
                modifier = Modifier
                    .height(20.dp)
                    .width(10.dp)

            )
        }
        Text(
            text = "Введите код из E-mail",
            fontSize = 22.sp,
            fontWeight = FontWeight.W600,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(top = 240.dp)
        )
/*        Text(
            text = "Отправить код повторно можно будет через 59 секунд",
            fontSize = 20.sp,
            fontWeight = FontWeight.W400,
            textAlign = TextAlign.Center,
            color = gray2,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(top = 240.dp)
        )*/
    }
}