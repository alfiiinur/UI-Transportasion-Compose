package com.example.uitransportaion.nav

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.uitransportaion.view.AktifitasPage
import com.example.uitransportaion.view.EtiketPage
import com.example.uitransportaion.view.HomePage
import com.example.uitransportaion.view.ProfilePage

@Composable
fun NavBar(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDesitination = navBackStackEntry?.destination

                listOfNavItems.forEach{
                    navItem: NavItem ->   NavigationBarItem(
                        selected = currentDesitination?.hierarchy?.any{it.route == navItem.route} == true ,
                        onClick = {
                                  navController.navigate(navItem.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                        },
                        icon = {
                               Icon(
                                   imageVector = navItem.icon,
                                   contentDescription = "null"
                               )
                        },
                        label = {
                            Text(
                                text = navItem.label
                            )

                        }

                    )
                }
            }
        }
    ) {
        paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomePage.name,
            modifier = Modifier
                .padding(paddingValues)
        ){
            composable(route = Screens.HomePage.name){
                HomePage()
            }
            composable(route = Screens.EtiketPage.name){
                EtiketPage()
            }
            composable(route = Screens.AkitvitasPage.name){
                AktifitasPage()
            }
            composable(route = Screens.ProfilePage.name){
                ProfilePage()
            }
        }

    }
}