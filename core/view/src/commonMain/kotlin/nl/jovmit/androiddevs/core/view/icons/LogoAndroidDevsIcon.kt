package nl.jovmit.androiddevs.core.view.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Unit
import org.jetbrains.compose.ui.tooling.preview.Preview

val LogoAndroidDevsIcon: ImageVector
    get() {
        if (_logoAndroidDevs != null) {
            return _logoAndroidDevs!!
        }
        _logoAndroidDevs = Builder(name = "LogoAndroidDevs", defaultWidth = 200.0.dp, defaultHeight
                = 200.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFFFFDE59)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF3DDB85)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.92f, 291.93f)
                curveTo(163.92f, 279.37f, 166.35f, 266.94f, 171.09f, 255.34f)
                curveTo(175.82f, 243.74f, 182.76f, 233.21f, 191.51f, 224.33f)
                curveTo(200.26f, 215.45f, 210.65f, 208.41f, 222.07f, 203.61f)
                curveTo(233.51f, 198.8f, 245.76f, 196.33f, 258.13f, 196.33f)
                curveTo(270.5f, 196.33f, 282.75f, 198.8f, 294.18f, 203.61f)
                curveTo(305.61f, 208.41f, 316.0f, 215.45f, 324.74f, 224.33f)
                curveTo(333.49f, 233.21f, 340.43f, 243.74f, 345.17f, 255.34f)
                curveTo(349.9f, 266.94f, 352.34f, 279.37f, 352.34f, 291.93f)
                lineTo(163.92f, 291.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.08f, 255.23f)
                arcToRelative(10.47f, 10.62f, 0.0f, true, false, 20.94f, 0.0f)
                arcToRelative(10.47f, 10.62f, 0.0f, true, false, -20.94f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(295.24f, 255.23f)
                arcToRelative(10.47f, 10.62f, 0.0f, true, false, 20.94f, 0.0f)
                arcToRelative(10.47f, 10.62f, 0.0f, true, false, -20.94f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3DDB85)),
                    strokeLineWidth = 5.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(315.26f, 220.91f)
                lineTo(336.57f, 183.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF3DDB85)),
                    strokeLineWidth = 5.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(202.98f, 219.58f)
                lineTo(181.66f, 182.11f)
            }
            group {
                path(fill = SolidColor(Color(0xFF5792F8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(256.73f, 401.73f)
                    curveTo(257.66f, 401.73f, 258.58f, 401.72f, 259.51f, 401.7f)
                    lineTo(243.23f, 424.51f)
                    lineTo(261.92f, 449.93f)
                    curveTo(260.2f, 449.98f, 258.47f, 450.0f, 256.73f, 450.0f)
                    curveTo(197.67f, 450.0f, 144.88f, 422.68f, 109.95f, 379.81f)
                    curveTo(109.35f, 379.83f, 108.74f, 379.84f, 108.13f, 379.84f)
                    curveTo(77.68f, 379.84f, 53.0f, 354.77f, 53.0f, 323.85f)
                    curveTo(53.0f, 308.8f, 58.85f, 295.13f, 68.36f, 285.07f)
                    curveTo(67.01f, 275.77f, 66.31f, 266.26f, 66.31f, 256.59f)
                    curveTo(66.31f, 225.1f, 73.72f, 195.37f, 86.86f, 169.1f)
                    lineTo(116.98f, 166.22f)
                    lineTo(128.93f, 191.58f)
                    curveTo(119.27f, 211.14f, 113.83f, 233.22f, 113.83f, 256.59f)
                    curveTo(113.83f, 260.49f, 113.99f, 264.36f, 114.29f, 268.19f)
                    curveTo(141.84f, 271.3f, 163.26f, 295.03f, 163.26f, 323.85f)
                    curveTo(163.26f, 335.99f, 159.46f, 347.23f, 152.99f, 356.4f)
                    curveTo(179.04f, 384.32f, 215.88f, 401.73f, 256.73f, 401.73f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD55252)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(302.75f, 68.86f)
                    curveTo(353.32f, 81.6f, 395.92f, 114.88f, 421.45f, 159.48f)
                    lineTo(409.5f, 185.56f)
                    lineTo(379.96f, 183.06f)
                    curveTo(363.04f, 153.87f, 336.35f, 131.21f, 304.46f, 119.74f)
                    curveTo(295.66f, 138.79f, 276.61f, 151.99f, 254.51f, 151.99f)
                    curveTo(232.97f, 151.99f, 214.32f, 139.45f, 205.24f, 121.15f)
                    curveTo(174.32f, 133.29f, 148.59f, 156.04f, 132.39f, 185.01f)
                    lineTo(121.01f, 159.13f)
                    lineTo(90.13f, 162.85f)
                    curveTo(114.58f, 118.11f, 155.99f, 84.25f, 205.55f, 70.24f)
                    curveTo(214.73f, 52.27f, 233.21f, 40.0f, 254.51f, 40.0f)
                    curveTo(275.27f, 40.0f, 293.34f, 51.65f, 302.75f, 68.86f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF6AAB77)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(251.29f, 424.74f)
                    lineTo(266.9f, 401.6f)
                    curveTo(304.48f, 398.91f, 338.04f, 381.48f, 362.02f, 354.95f)
                    curveTo(356.16f, 346.05f, 352.74f, 335.36f, 352.74f, 323.85f)
                    curveTo(352.74f, 295.93f, 372.86f, 272.78f, 399.17f, 268.54f)
                    curveTo(399.48f, 264.67f, 399.63f, 260.77f, 399.63f, 256.82f)
                    curveTo(399.63f, 232.54f, 393.76f, 209.65f, 383.38f, 189.54f)
                    lineTo(413.49f, 192.91f)
                    lineTo(424.98f, 166.15f)
                    curveTo(439.14f, 193.2f, 447.16f, 224.05f, 447.16f, 256.82f)
                    curveTo(447.16f, 265.65f, 446.57f, 274.35f, 445.44f, 282.87f)
                    curveTo(456.24f, 293.09f, 463.0f, 307.67f, 463.0f, 323.85f)
                    curveTo(463.0f, 354.77f, 438.32f, 379.84f, 407.87f, 379.84f)
                    curveTo(406.5f, 379.84f, 405.14f, 379.79f, 403.8f, 379.69f)
                    curveTo(371.27f, 419.81f, 323.14f, 446.39f, 268.83f, 449.85f)
                    lineTo(251.29f, 424.74f)
                    close()
                }
            }
        }
        .build()
        return _logoAndroidDevs!!
    }

private var _logoAndroidDevs: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = LogoAndroidDevsIcon, contentDescription = "")
    }
}
