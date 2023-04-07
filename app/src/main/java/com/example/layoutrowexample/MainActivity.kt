package com.example.layoutrowexample

import android.os.Bundle
import android.provider.MediaStore.Images
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutrowexample.ui.theme.LayoutRowExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            setContent(){
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xfff2f2f2))

                ){
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Shampoo Mint",
                                fontSize = 26.sp
                            )
                            Text(text = "5.0 $",
                                fontSize = 17.sp,
                                color= Color(0xff85bb65),
                                modifier = Modifier.align(Alignment.CenterVertically)
                            )
                        }
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Text(text = "Best New Product",
                            fontSize = 14.sp,
                            )
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Button(
                            onClick = { },
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        ) {
                            Text(text = "ORDER NOW")
                        }
                    }
                }
            }

        }
    }


