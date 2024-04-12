package com.example.smartlubsimon.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartlubsimon.ui.theme.blue1
import com.example.smartlubsimon.ui.theme.gray2
import com.example.smartlubsimon.ui.theme.gray3
import com.example.smartlubsimon.ui.theme.gray4

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
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 80.dp, start = 20.dp, end = 20.dp, bottom = 60.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            )
            {

                Row ( modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "1", fontSize = 25.sp)
                    }
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "2", fontSize = 25.sp)
                    }
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "3", fontSize = 25.sp)
                    }
                }
                Row ( modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "4", fontSize = 25.sp)
                    }
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "5", fontSize = 25.sp)
                    }
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "6", fontSize = 25.sp)
                    }
                }
                Row ( modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "7", fontSize = 25.sp)
                    }
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "8", fontSize = 25.sp)
                    }
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "9", fontSize = 25.sp)
                    }
                }
                Row ( modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Button(
                        onClick = {/*navHost.navigate("EmailCodScreen")*/},
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        shape = RoundedCornerShape(60.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = gray3,
                            contentColor = Color.Black,
                        )
                    ) {
                        Text(text = "0", fontSize = 25.sp)
                    }

                }

            }

        }

    }
}