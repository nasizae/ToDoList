package com.example.todolist.presentation.registration

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todolist.R
import com.example.todolist.ui.theme.ToDoListTheme

@Composable
fun RegistrationScreen() {
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var iconTogglePasswordVisibility by remember {
        mutableStateOf(false)
    }
    val icon =
        if (iconTogglePasswordVisibility)
            painterResource(id = R.drawable.ic_toggle_password_off)
        else
            painterResource(id = R.drawable.ic_toggle_password)
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            modifier = Modifier.padding(vertical = 20.dp, horizontal = 20.dp),
            text = stringResource(R.string.registration),
            color = colorResource(id = R.color.black),
            fontSize = 28.sp,
            fontFamily = FontFamily.Serif
        )

        OutlinedTextField(
            value = fullName,
            onValueChange = { fullName = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 16.dp)
                .padding(top = 40.dp)
                .border(
                    1.dp,
                    colorResource(id = R.color.grey),
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(shape = RoundedCornerShape(16.dp)),
            placeholder = {
                Text(text = stringResource(R.string.fullname), fontSize = 16.sp)
            }
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 16.dp)
                .border(
                    1.dp,
                    colorResource(id = R.color.grey),
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(shape = RoundedCornerShape(16.dp)),
            placeholder = {
                Text(text = stringResource(R.string.email), fontSize = 16.sp)
            }
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            trailingIcon = {
                IconButton(
                    onClick = {
                        iconTogglePasswordVisibility = !iconTogglePasswordVisibility
                    }) {
                    Icon(painter = icon, contentDescription = null)
                }
            },
            visualTransformation =
            if (iconTogglePasswordVisibility)
                VisualTransformation.None
            else PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 16.dp)
                .border(
                    1.dp,
                    colorResource(id = R.color.grey),
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(shape = RoundedCornerShape(16.dp)),
            placeholder = {
                Text(text = stringResource(R.string.password), fontSize = 16.sp)
            },
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Canvas(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp)
            ) {
                drawLine(
                    color = Color.Black,
                    start = Offset(0f, size.height / 2),
                    end = Offset(size.width, size.height / 2),
                    strokeWidth = 5f
                )
            }
            Text(text = stringResource(R.string.or), fontSize = 16.sp)
            Canvas(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp)
            ) {
                drawLine(
                    color = Color.Black,
                    start = Offset(0f, size.height / 2),
                    end = Offset(size.width, size.height / 2),
                    strokeWidth = 5f
                )
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp, vertical = 16.dp),
            colors = ButtonDefaults.buttonColors(
                colorResource(id = R.color.white)
            ),
            border = BorderStroke(1.dp, color = colorResource(id = R.color.black)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = null
                )
                Text(
                    text = stringResource(R.string.google),
                    color = colorResource(id = R.color.black),
                    fontSize = 16.sp
                )
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp, vertical = 16.dp),
            colors = ButtonDefaults.buttonColors(
                colorResource(id = R.color.white)
            ),
            border = BorderStroke(1.dp, color = colorResource(id = R.color.black)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = null
                )
                Text(
                    text = stringResource(R.string.facebook),
                    color = colorResource(id = R.color.black),
                    fontSize = 16.sp
                )
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 20.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.blue)),
            elevation = ButtonDefaults.buttonElevation(16.dp)
        ) {
            Text(
                text = stringResource(R.string.sign_up),
                fontSize = 16.sp,
                modifier = Modifier.padding(vertical = 12.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewAuth() {
    ToDoListTheme {
        RegistrationScreen()
    }
}