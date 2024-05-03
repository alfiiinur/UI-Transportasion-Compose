package com.example.uitransportaion.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uitransportaion.ui.theme.BackgorundColor
import com.example.uitransportaion.ui.theme.PoppinsFamily


@Preview
@Composable
fun ProfilePage(){
    Box(
        modifier = Modifier
            .background(BackgorundColor)
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Profile",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = PoppinsFamily,
                color = MaterialTheme.colorScheme.onBackground
            )
            Icon(
                imageVector = Icons.Rounded.SupervisedUserCircle,
                contentDescription = "Icon user",
                modifier = Modifier
                    .size(90.dp)
            )
            Text(
                text = "Alfi Nur Danialin",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = PoppinsFamily,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = "@alfi nur ",
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                color = MaterialTheme.colorScheme.onBackground.copy(0.7f)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {},
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onBackground)
            ){
                Text(
                    text = "Edit Profile"
                )
            }

            Divider(
                modifier = Modifier.padding(top = 20.dp),
                thickness = 1.dp, color =  MaterialTheme.colorScheme.onBackground.copy(0.5f)
            )
            Spacer(
                Modifier.height(16.dp)
            )
            Fitur(Icons.Rounded.Settings, "Settings", "Setting")
            Fitur(Icons.Rounded.ListAlt, "List", "My Orders")
            Fitur(Icons.Rounded.MapsHomeWork, "Address", "Address")
            Fitur(Icons.Rounded.Lock, "Change Password", "Change Password")

            Divider(
                modifier = Modifier.padding(top = 20.dp),
                thickness = 1.dp, color = MaterialTheme.colorScheme.onBackground.copy(0.5f)
            )
            Spacer(Modifier.height(16.dp))

            Fitur(Icons.Rounded.QuestionMark, "qes", "Help & Support")
            Fitur(Icons.Rounded.Logout, "logut", "Logout")
        }

    }
}

@Composable
fun Fitur(iconFit: ImageVector, contetendes: String, textFitr : String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
            .clickable {  }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier
                    .padding(end = 5.dp)
            ) {
                Icon(
                    imageVector = iconFit,
                    contentDescription = contetendes,
                    modifier = Modifier
                        .padding(end = 5.dp)
                )
                Text(
                    text = textFitr,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = PoppinsFamily,
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
            Icon(
                imageVector = Icons.Rounded.KeyboardArrowRight,
                contentDescription = "Arrow right",
                modifier = Modifier
                    .size(25.dp)
            )
        }

    }
}
