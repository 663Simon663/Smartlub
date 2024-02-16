package com.example.smartlubsimon.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.smartlubsimon.ui.theme.Purple1
import com.example.smartlubsimon.ui.theme.black1
import com.example.smartlubsimon.ui.theme.blue1
import com.example.smartlubsimon.ui.theme.blue1a
import com.example.smartlubsimon.ui.theme.gray1
import com.example.smartlubsimon.ui.theme.gray2
import com.example.smartlubsimon.ui.theme.gray3
import com.example.smartlubsimon.ui.theme.strokecolor
import kotlin.math.round

@Preview
@Composable
fun LogIn(/*navHost: NavHostController*/) {
    var email: String by rememberSaveable { mutableStateOf("") }
    var flag = remember {
        mutableStateOf(false)
    }
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
                text = "Вход по E-mail", fontSize = 14.sp, color = gray1 ,
                modifier = Modifier.padding(top = 80.dp, start = 20.dp, end = 20.dp),
            )
        CustomEmail(search = email, onValueChange = {it->email=it
        })
        flag.value = email.isNotEmpty()
        val color = if(flag.value) ButtonDefaults.buttonColors(
            containerColor = blue1,
            contentColor = Color.White
        )
        else ButtonDefaults.buttonColors(
            containerColor = blue1a,
            contentColor = Color.White
        )
        Button(
            onClick = {/*navHost.navigate("EmailCodScreen")*/},
            modifier = Modifier
                .height(90.dp)
                .fillMaxWidth()
                .padding(top = 30.dp, start = 20.dp, end = 20.dp),
            colors = color,
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Далее", fontSize = 18.sp)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(0.dp, 0.dp, 0.dp, 50.dp))
        {
            Text(
                text = "Или войдите с помощью", fontSize = 16.sp, color = gray2,
                modifier = Modifier
                    .padding(),
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(90.dp)
                    .fillMaxWidth()
                    .padding(top = 30.dp, start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black,
                ),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, strokecolor)
            ) {
                Text(text = "Войти с Яндекс")
            }
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
            .background(gray3)

    ) {
        TextField(
            value = search,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(245, 245, 249),
                focusedIndicatorColor = black1,
                focusedTextColor = black1,
                disabledIndicatorColor = black1,
                unfocusedIndicatorColor = black1,
                cursorColor = black1,
            ),
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(235, 235, 235))
                .border(1.dp, strokecolor),
            placeholder = {
                Text(
                    text = "example@mail.ru",
                    color = black1
                )
            }
        )

    }
}