package com.simple.mall.feature.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.simple.mall.R
import com.simple.mall.core.design.theme.ComposeMallTheme
import com.simple.mall.util.SuperDateUtil

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


    //缩放动画
    val scale = remember { Animatable(0f) }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 2000,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
    }

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
                .scale(scale.value)
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

        //版权文本
        Text(text = stringResource(id = R.string.copyright,SuperDateUtil.currentYear()),
            style = TextStyle(
                fontSize = 12.sp,
                color = Color.Gray
            ),
            modifier = Modifier
                .padding(bottom = 20.dp)
                .align(Alignment.BottomCenter))
    }
}


@Preview(showBackground = true)
@Composable
fun SplashRoutePreview() {
    ComposeMallTheme {
        SplashScreen()
    }
}