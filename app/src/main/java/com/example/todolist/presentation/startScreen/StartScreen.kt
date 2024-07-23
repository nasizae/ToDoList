package com.example.todolist.presentation.startScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todolist.R

@Composable
@Preview(showSystemUi = true)
fun StartScreen() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "image",
            Modifier
                .fillMaxWidth()
                .height(260.dp)
                .padding(bottom = 20.dp)
        )
        Text(
            modifier = Modifier.padding(horizontal = 26.dp),
            text = stringResource(R.string.welcome),
            color = colorResource(id = R.color.black),
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp)
                .padding(horizontal = 20.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal_200)),
            elevation = ButtonDefaults.buttonElevation(16.dp)
        ) {
            Text(
                text = stringResource(R.string.let_s_go_start),
                modifier = Modifier.padding(vertical = 8.dp),
                fontSize = 16.sp
            )
        }
    }
}