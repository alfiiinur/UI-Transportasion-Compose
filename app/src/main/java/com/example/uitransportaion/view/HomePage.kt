@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.uitransportaion.view


import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uitransportaion.R
import com.example.uitransportaion.nav.NavBar
import com.example.uitransportaion.ui.theme.*


@Preview
@Composable
fun HomePage(){
    Box(
        modifier = Modifier
            .background(color = BackgorundColor)
            .fillMaxSize()
    ){
        Column(
            Modifier
                .padding(15.dp)
        ) {
            HeaderPage()
            Spacer(Modifier.height(10.dp))
            CardList()
            Spacer(Modifier.height(10.dp))
            CardDetail()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun CardDetail() {
    var text by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    var items = remember {
        mutableStateListOf("Bus Jakarta", "Bus Malang")
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(color = BackgorundColor),
    ) {
        Column() {
            //search
            SearchBar(
                modifier = Modifier.fillMaxWidth(),
                query = text,
                onQueryChange = {
                    text = it
                },
                onSearch = {
                    active = false
                },
                active = active,
                onActiveChange = {
                    active = it
                },
                placeholder = {
                    Text(text = "Search")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Rounded.Search, contentDescription = "Icon Search")
                },
                trailingIcon = {
                    if (active) {
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Icon Close",
                            modifier = Modifier.clickable { text = " " })
                    } else {
                        active = false
                    }
                }
            ) {
                items.forEach {
                    Row(
                        modifier = Modifier.padding(14.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.History,
                            contentDescription = "Icon History",
                            modifier = Modifier.padding(end = 10.dp)
                        )
                    }
                    Text(
                        text = it
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                CardMenu(Icons.Rounded.Train, "Train", DangerColor, "Kereta")
                CardMenu(Icons.Rounded.ElectricCar, "Car", CardColor, "Mobil")
                CardMenu(Icons.Rounded.BusAlert, "Bus", WarningColor, "Bus")
                CardMenu(Icons.Rounded.FireTruck, "FireTruck", SuccesColor, "Truck")
            }
            Spacer(Modifier.height(5.dp))
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Transportasi Terdekat ",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = PoppinsFamily,
                        color = Color.Black
                    )
                    Row(
                        modifier = Modifier
                            .padding(end = 5.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.MyLocation,
                            contentDescription = "Icon Maps",
                            modifier = Modifier
                                .size(15.dp),
                            tint = Color.Black.copy(0.6f)
                        )
                        Text(
                            text = "Lokasimu Saat ini ",
                            fontSize = 12.sp,
                            fontFamily = PoppinsFamily,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black.copy(0.6f),
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                    Text(
                        text = "Sidoarjo, Jawa Timur",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp,
                        fontFamily = PoppinsFamily,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 15.dp)
                    )
                }
            }
        }
    }
}



@Composable
fun CardMenu(icon_me: ImageVector, condes : String, coloric: Color,  FillName : String) {
    Box(
        modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Color.White)
            .size(75.dp)
    ){
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon_me,
                contentDescription = condes,
                modifier = Modifier
                    .size(40.dp),
                tint = coloric

            )
            Text(
                text = FillName,
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        }
    }
}


//@Preview()
@Composable
fun CardList() {
    Box(
        modifier = Modifier
            .size(width = 400.dp, height = 120.dp)
            .clip(RoundedCornerShape(15.dp))
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(15.dp)
            )
            .background(Color.White)
            .padding(10.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Row(
            modifier = Modifier
                .padding(5.dp)
                .height(IntrinsicSize.Min)
        ) {
            Card1(Icons.Rounded.Money, "IconMoney", colorIcon = WarningColor, "TransId", "Coins", "120141", "detail")
            Divider(
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.onBackground.copy(0.5f),
                modifier = Modifier.fillMaxHeight().width(1.dp)
            )
            Card1(Icons.Rounded.CardMembership, "IconCard", colorIcon = CardColor, "TransId", "Pays", "20000", "detail")
            Divider(
                thickness = 1.dp,
                color = MaterialTheme.colorScheme.onBackground.copy(0.5f),
                modifier = Modifier.fillMaxHeight().width(1.dp)
            )
            Icon(
               imageVector = Icons.Rounded.QrCodeScanner,
                contentDescription = "IconScan",
                modifier = Modifier
                    .padding(5.dp)
                    .size(50.dp)

            )
        }
    }
}

@Composable
fun Card1(icon : ImageVector, contentDes : String, colorIcon : Color, nameCard : String,detCard:String, mount : String, textDet : String){
    Row(
        modifier = Modifier
            .padding(5.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDes,
            modifier = Modifier
                .size(30.dp),
            tint = colorIcon
        )
        Column(
            modifier = Modifier
                .padding(start = 5.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            Row {
                Text(
                    fontSize = 12.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.SemiBold,
                    text = nameCard,
                    color = Color.Black.copy(0.7f)
                )
                Text(
                    text = detCard,
                    fontFamily = PoppinsFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black.copy(0.5f),
                    modifier = Modifier.padding(start = 2.dp)
                )
            }
            Text(
                text = mount,
                color = Color.Black,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
            Text(
                text = textDet,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                color = SuccesColor
            )
        }
    }
}

//@Preview()
@Composable
fun HeaderPage(){
    Column(
        modifier = Modifier
            .background(color = BackgorundColor)
            .fillMaxWidth()
            .padding(10.dp)
    ) {
       Row(
           modifier = Modifier
               .fillMaxWidth(),
           horizontalArrangement = Arrangement.Start,
           verticalAlignment = Alignment.CenterVertically

       ) {
           Image(
               painter = painterResource(R.drawable.icon1),
               contentDescription = "icon1",
               modifier = Modifier
                   .size(100.dp)
           )
           Text(
               fontSize = 30.sp,
               fontFamily = PoppinsFamily,
               fontWeight = FontWeight.SemiBold,
               text = "TransFor",
               color = Color.Black.copy(0.8f),
               modifier = Modifier
                   .padding(start = 10.dp)
           )
       }
        Text(
            fontSize = 18.sp,
            fontFamily = PoppinsFamily,
            fontWeight = FontWeight.SemiBold,
            text = "Hari ini mau kemana ?",
            color = Color.Black.copy(0.8f)
        )
        Text(
            fontSize = 15.sp,
            fontFamily = PoppinsFamily,
            fontWeight = FontWeight.Normal,
            text = "Tentukan Lokasi Tujuanmu, dan kami akan merekemondasikan rute terbatik untukmu",
            color = Color.Black.copy(0.5f),
            textAlign = TextAlign.Start
        )
    }
}