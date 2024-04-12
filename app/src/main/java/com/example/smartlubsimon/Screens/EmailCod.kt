package com.example.smartlubsimon.Screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.smartlubsimon.R
import com.example.smartlubsimon.ui.theme.gray3
import com.example.smartlubsimon.ui.theme.gray4
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.ticker
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import java.time.LocalDateTime

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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 50.dp)
        )
        {
            var email: String by rememberSaveable { mutableStateOf("") }
            Text(
                text = "Введите код из E-mail",
                fontSize = 23.sp,
                fontWeight= FontWeight.Bold
            )
            Row (modifier = Modifier.fillMaxWidth().padding(top = 20.dp,start = 30.dp, end = 30.dp), horizontalArrangement = Arrangement.SpaceEvenly){


                CustomCode(search = email, onValueChange = { it ->
                    email = it
                })



                CustomCode(search = email, onValueChange = { it ->
                    email = it
                })



                CustomCode(search = email, onValueChange = { it ->
                    email = it
                })


                CustomCode(search = email, onValueChange = { it ->
                    email = it
                })

            }
            Box(
                Modifier
                    .padding(start = 60.dp, end = 60.dp),
                contentAlignment = Alignment.Center

            )
            {
                Text(
                    text = "Отправить код повторно можно будет через 59 секунд",
                    fontSize = 16.sp,
                    color = Color(0xFF7E7E9A),
                    modifier = Modifier.padding(top = 20.dp),
                    textAlign = TextAlign.Center


                )

            }
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
}}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomCode(
    search: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier
            .size(64.dp, 64.dp)
            .clip(RoundedCornerShape(12.dp))

    ) {
        TextField(
            value = search,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0XFFF5F5F9),
                focusedIndicatorColor = Color.Black,
                focusedTextColor = Color.Black,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color(0XFFEBEBEB),

                ),
            modifier = Modifier
                .background(Color(0XFFF5F5F9))
                .size(64.dp, 64.dp),
            placeholder = {
                /*Text(
                    text = "example@mail.ru",
                    color = Color(0xFF7E7E9A)
                    https://dev.to/aniketsmk/kotlin-flow-implementing-an-android-timer-ieo
                )*/
            }
        )

    }

}