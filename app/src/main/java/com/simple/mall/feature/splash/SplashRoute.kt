package com.simple.mall.feature.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.simple.mall.R
import com.simple.mall.ui.theme.ComposeMallTheme

/**
 * @author jiangshiyu
 * @date 2024/6/2
 * 启动界面
 */

@Composable
fun SplashRoute() {
    SplashScreen()
}

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //启动界面banner
        Image(
            painter = painterResource(id = R.drawable.splash_banner),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 150.dp)
                .align(Alignment.TopCenter)
        )

        //region 启动界面logo
        Image(
            painter = painterResource(id = R.drawable.splash_logo),
            contentDescription = "启动界面logo",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 30.dp)
        )
        //endregion

    }
}


@Preview(showBackground = true)
@Composable
fun SplashRoutePreview() {
    ComposeMallTheme {
        SplashScreen()
    }
}