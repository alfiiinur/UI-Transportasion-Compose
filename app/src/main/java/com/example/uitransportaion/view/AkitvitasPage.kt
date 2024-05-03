package com.example.uitransportaion.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uitransportaion.ui.theme.*


val RiwayatCard = listOf(
    Riwayat(
        iconRiw = Icons.Rounded.Discount,
        iconTras = Icons.Rounded.BusAlert,
        textPesan = "Kode : WOAJ29824",
        asal = "Malang",
        tujuan = "Surbaya",
        waktubrnt = "03.00",
        waktudtng = "05.00",
        tangglbr = "12 Januari 2024",
        tanggldt = "13 Januari 2024",
        selesai = "Selesai",
        colorSelesai = SuccesColor,
        ColorTras = SuccesColor
    ),
    Riwayat(
        iconRiw = Icons.Rounded.Discount,
        iconTras = Icons.Rounded.BusAlert,
        textPesan = "Kode : LOEA3984",
        asal = "Surabya",
        tujuan = "Bojonegoro",
        waktubrnt = "12.00",
        waktudtng = "13.00",
        tangglbr = "2 Februari 2024",
        tanggldt = "3 Maret 2024",
        selesai = "Belum",
        colorSelesai = WarningColor,
        ColorTras = SuccesColor
    ),
    Riwayat(
        iconRiw = Icons.Rounded.Discount,
        iconTras = Icons.Rounded.BusAlert,
        textPesan = "Kode : WOAJ29824",
        asal = "Malang",
        tujuan = "Surbaya",
        waktubrnt = "03.00",
        waktudtng = "05.00",
        tangglbr = "12 Januari 2024",
        tanggldt = "13 Januari 2024",
        selesai = "Selesai",
        colorSelesai = SuccesColor,
        ColorTras = WarningColor
    ),
    Riwayat(
        iconRiw = Icons.Rounded.Discount,
        iconTras = Icons.Rounded.BusAlert,
        textPesan = "Kode : WOAJ29824",
        asal = "Malang",
        tujuan = "Surbaya",
        waktubrnt = "03.00",
        waktudtng = "05.00",
        tangglbr = "12 Januari 2024",
        tanggldt = "13 Januari 2024",
        selesai = "Selesai",
        colorSelesai = SuccesColor,
        ColorTras = SuccesColor
    ),
    Riwayat(
        iconRiw = Icons.Rounded.Discount,
        iconTras = Icons.Rounded.BusAlert,
        textPesan = "Kode : WOAJ29824",
        asal = "Malang",
        tujuan = "Surbaya",
        waktubrnt = "03.00",
        waktudtng = "05.00",
        tangglbr = "12 Januari 2024",
        tanggldt = "13 Januari 2024",
        selesai = "Selesai",
        colorSelesai = SuccesColor,
        ColorTras = WarningColor
    ),
    Riwayat(
        iconRiw = Icons.Rounded.Discount,
        iconTras = Icons.Rounded.BusAlert,
        textPesan = "Kode : WOAJ29824",
        asal = "Malang",
        tujuan = "Surbaya",
        waktubrnt = "03.00",
        waktudtng = "05.00",
        tangglbr = "12 Januari 2024",
        tanggldt = "13 Januari 2024",
        selesai = "Selesai",
        colorSelesai = SuccesColor,
        ColorTras = DangerColor
    )
)

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AktifitasPage(){
    var text by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    var items = remember {
        mutableStateListOf("Bus Jakarta", "Bus Malang")
    }
    Box(
        modifier = Modifier
            .background(BackgorundColor)
            .fillMaxSize()
    ) {
        Column{
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Riwayat",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = PoppinsFamily,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )

            }
            //search
            SearchBar(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
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
            LazyColumn {
                items(RiwayatCard.size) { index ->
                    RiwayatList(index)
                }
            }
        }
    }
}

@Composable
fun RiwayatList(index: Int) {
    val riwayat_da = RiwayatCard[index]
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .padding(16.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(15.dp)
            )
            .background(Color.White)
    ){
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = riwayat_da.iconRiw,
                contentDescription = "icon",
                modifier = Modifier
                    .size(70.dp)
            )
            Divider(
                thickness = .5.dp,
                color = MaterialTheme.colorScheme.onBackground.copy(0.5f),
                modifier = Modifier.fillMaxHeight().width(1.dp)
            )
            BoxDetail(index)
        }
    }
}

@Composable
fun BoxDetail(index: Int) {
    val riwayat_da = RiwayatCard[index]
    Column(
        modifier = Modifier.padding(start = 5.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = riwayat_da.iconTras,
                    contentDescription = "IconTras",
                    tint = riwayat_da.ColorTras,
                    modifier = Modifier.padding(end = 7.dp)
                )
                Text(
                    text = riwayat_da.textPesan,
                    fontSize = 14.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(Modifier.width(50.dp))
                Box(
                    modifier = Modifier
                        .size(width = 60.dp, height = 20.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(riwayat_da.colorSelesai),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = riwayat_da.selesai,
                        fontSize = 10.sp,
                        fontFamily = PoppinsFamily,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = riwayat_da.asal,
                    fontSize = 10.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.onBackground

                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = riwayat_da.waktubrnt,
                    fontSize = 14.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = riwayat_da.tangglbr,
                    fontSize = 8.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
            Icon(
                imageVector = Icons.Rounded.ArrowCircleRight,
                contentDescription = "IconARROW"
            )
            Column {
                Text(
                    text = riwayat_da.tujuan,
                    fontSize = 10.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = riwayat_da.waktudtng,
                    fontSize = 12.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = riwayat_da.tanggldt,
                    fontSize = 8.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }

    }
}

