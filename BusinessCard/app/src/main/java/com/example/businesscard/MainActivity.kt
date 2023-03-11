package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun HeaderInfo() {
    val painterResource = painterResource(id = R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color.Black)
    ) {
        Image(
            painter = painterResource,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = stringResource(R.string.card_given_name),
            fontSize = 45.sp,
            color = Color(0xFF3DDC84),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 5.dp),
        )
        Text(
            text = stringResource(R.string.card_primary_title),
            fontSize = 32.sp,
            color = Color(0xFF3DDC84),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 5.dp),
        )
        Text(
            text = stringResource(R.string.card_secondary_title),
            fontSize = 32.sp,
            color = Color(0xFF3DDC84),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 5.dp),
        )
    }
}

@Composable
fun ContactInformation() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(color = Color.Black)
    ) {
        Divider(
            color = Color.LightGray,
            modifier = Modifier.padding(bottom = 5.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 5.dp)
        ) {
            Spacer(
                modifier = Modifier.width(45.dp)
            )
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = stringResource(R.string.card_phone_number),
                color = Color.LightGray,
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Divider(
            color = Color.LightGray,
            modifier = Modifier.padding(bottom = 5.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 5.dp)
        ) {
            Spacer(
                modifier = Modifier.width(45.dp)
            )
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = stringResource(R.string.card_social_media),
                color = Color.LightGray,
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Divider(
            color = Color.LightGray,
            modifier = Modifier.padding(bottom = 5.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 5.dp)
        ) {
            Spacer(
                modifier = Modifier.width(45.dp)
            )
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = stringResource(R.string.card_email),
                color = Color.LightGray,
                modifier = Modifier.padding(start = 25.dp)
            )
        }
        Divider(
            color = Color.LightGray,
            modifier = Modifier.padding(bottom = 5.dp)
        )
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier.background(color = Color.Black)
    ) {
        HeaderInfo()
        Spacer(
            modifier = Modifier
                .height(25.dp)
        )
        ContactInformation()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}