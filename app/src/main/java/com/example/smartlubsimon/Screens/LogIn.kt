package com.example.smartlubsimon.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Preview
@Composable
private fun LogIn(navHost: NavHostController) {
    var email: String by rememberSaveable { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize(1f)
        .background((Color.White))) {
        Text(
            text = "✋  Добро пожаловать!", fontSize = 28.sp, fontWeight = W700,
            modifier = Modifier.padding(top = 100.dp, start = 20.dp, end = 20.dp),
        )
        Text(
            text = "Войдите, чтобы пользоваться функциями приложения", fontSize = 15.sp,
            modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp),
        )
        Text(
                text = "Вход по E-mai", fontSize = 14.sp, color = Color(126, 126, 154),
                modifier = Modifier.padding(top = 80.dp, start = 20.dp, end = 20.dp),
            )
        CustomEmail(search = email, onValueChange = {
        })
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(26, 111,238),
                contentColor = Color(0xFFFFFFFF)
            )
        ) {
            Text(text = "Далее")
        }


}
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomEmail(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 5.dp, start = 20.dp, end = 20.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(245, 245, 249))

    ) {
        TextField(
            value = search,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(245, 245, 249),
                focusedIndicatorColor = Color.Black,
                focusedTextColor = Color(245, 245, 249),
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color(245, 245, 249),
            ),
            modifier = Modifier.background(Color(235, 235, 235)),
            placeholder = {
                Text(
                    text = "example@mail.ru",
                    color = Color(0x80000000)
                )
            }
        )

    }
}