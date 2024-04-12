package com.example.smartlubsimon.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smartlubsimon.Screens.EmailCod
import com.example.smartlubsimon.Screens.LogIn

/*Класс для перемещения по страницам*/
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,//контроллер реагирующий и отвечающий за перемещения
        startDestination = "EmailCodScreen")
    {
        //Для каждой страницы задается route - для дальнейшего обращения к ней
        //и указывается метод для запуска с переданными параметрами
        composable("logInScreen"){
            LogIn(/*navController*/)
        }
        composable("EmailCodScreen"){
            EmailCod(/*navController*/)
        }
    }
}