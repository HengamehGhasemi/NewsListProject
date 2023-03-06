package com.example.myapplication2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication2.ui.newsList.NewsListScreen
import com.example.myapplication2.ui.theme.MyApplication2Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication2Theme() {
                val navController = rememberNavController()
               NavHost(
                    navController = navController,
                    startDestination =  "first_page_Screen"
                ){
                    composable(route = "news_list_screen"){
                        NewsListScreen(navController = navController)
                    }
                   composable(
                       route = "news_detail_screen/{newsID}",
                       arguments = listOf(
                           navArgument(name = "newsId"){
                               type = NavType.IntType
                           }
                       )
                   ){
                        val newsId = remember {
                            it.arguments?.getInt("newsId") ?: -1
                        }
                   }
                }
            }
        }
    }
}