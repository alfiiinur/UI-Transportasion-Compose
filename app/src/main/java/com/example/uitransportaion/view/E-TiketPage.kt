package com.example.uitransportaion.view

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowRight
import androidx.compose.material.icons.rounded.ArrowRightAlt
import androidx.compose.material.icons.rounded.BusAlert
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uitransportaion.ui.theme.CardColor
import com.example.uitransportaion.ui.theme.PoppinsFamily
import com.example.uitransportaion.ui.theme.WarningColor
import com.example.uitransportaion.R


@Preview
@Composable
fun EtiketPage() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "E-Tiket",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = PoppinsFamily,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
        Spacer(Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(CardColor)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "BUS EKONOMI JAWA - Ekonomi",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = PoppinsFamily,
                            color = Color.Black
                        )
                        Icon(
                            imageVector = Icons.Rounded.Close,
                            contentDescription = "Icon Close",
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 15.dp, vertical = 5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.BusAlert,
                            contentDescription = "IconBus",
                            modifier = Modifier
                                .size(25.dp),
                            tint = WarningColor
                        )
                        Text(
                            fontSize = 14.sp,
                            fontFamily = PoppinsFamily,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black.copy(0.7f),
                            text = "Kode Pemesanan : W03928R",
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                    //JAM
                    JadwalTime()
                    //HARGA TIKET
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 15.dp, vertical = 5.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = PoppinsFamily,
                            text = "Harga Tiket ",
                            color = Color.Black
                        )
                        Text(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = PoppinsFamily,
                            text = "Rp. 40.000, 00",
                            color = Color.Black
                        )
                    }
                    //dividir
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(CardColor)
                        )
                        val pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
                        Canvas(Modifier.width(250.dp).height(1.dp)) {
                            drawLine(
                                color = CardColor,
                                start = Offset(0f, 0f),
                                end = Offset(size.width, 0f),
                                pathEffect = pathEffect
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(CardColor)
                        )
                    }
                    //DETAIL PENUMPANG
                    PenumpangCard()
                    //dividir
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(CardColor)
                        )
                        val pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
                        Canvas(Modifier.width(250.dp).height(1.dp)) {
                            drawLine(
                                color = CardColor,
                                start = Offset(0f, 0f),
                                end = Offset(size.width, 0f),
                                pathEffect = pathEffect
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(CardColor)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Pindai Kode",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            fontFamily = PoppinsFamily,
                            color = Color.Black.copy(0.8f),
                            textAlign = TextAlign.Center
                        )
                        Box(
                            modifier = Modifier
                                .size(150.dp)
                                .clip(RoundedCornerShape(15.dp))
                                .padding(10.dp)
                                .shadow(
                                    elevation = 5.dp,
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .background(Color.White),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.barcode),
                                contentDescription = "BARCODE",
                                modifier = Modifier
                                    .size(100.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun JadwalTime() {
    Column(
        modifier = Modifier
            .padding(15.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                fontSize = 10.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Normal,
                text = "Sidoarjo",
                color = Color.Black
            )
            Text(
                fontSize = 10.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Normal,
                text = "Madura",
                color = Color.Black
            )
        }
//        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            //colum jam
            ColumJam("13:20", "26 April 2024")
            Icon(
                imageVector = Icons.Rounded.ArrowRightAlt,
                contentDescription = "IconRight",
                tint = Color.Black.copy(0.7f),
                modifier = Modifier
                    .size(50.dp)
            )
            //colum jam
            ColumJam("15:20", "26 April 2024")
        }
    }
}

@Composable
fun ColumJam(waktu : String, tanggal: String) {
    Column(
        modifier = Modifier
            .padding(bottom = 10.dp)
    ) {
        Text(
            text = waktu,
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = PoppinsFamily,
            color = Color.Black
        )
        Text(
            text = tanggal,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = PoppinsFamily,
            color = Color.Black

        )
    }
}

//@Preview
@Composable
fun PenumpangCard() {
    Column(
        modifier = Modifier
            .padding(15.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Normal,
                text = "Penumpang",
                color = Color.Black.copy(0.7f)
            )
            Text(
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Normal,
                text = "No ID",
                        color = Color.Black.copy(0.7f)
            )
        }
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.SemiBold,
                text = "Alfi Nur Danialin",
                color = Color.Black
            )
            Text(
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.SemiBold,
                text = "202128329",
                color = Color.Black
            )
        }
        Spacer(Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Normal,
                text = "Tipe Penumpang",
                color = Color.Black.copy(0.7f)
            )
            Text(
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.Normal,
                text = "No Kursi",
                color = Color.Black.copy(0.7f)
            )
        }
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.SemiBold,
                text = "UMUM",
                color = Color.Black
            )
            Text(
                fontSize = 15.sp,
                fontFamily = PoppinsFamily,
                fontWeight = FontWeight.SemiBold,
                text = "34",
                color = Color.Black
            )
        }

    }
}

