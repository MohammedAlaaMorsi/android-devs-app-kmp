import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class ImperfectCircleShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            path = Path().apply {
                moveTo(256.348f, 170.923f)
                cubicTo(250.501f, 187.464f, 239.892f, 201.828f, 228.886f, 214.097f)
                cubicTo(217.516f, 226.877f, 203.772f, 237.308f, 188.425f, 244.806f)
                cubicTo(173.281f, 252.066f, 156.318f, 258.008f, 139.297f, 258.921f)
                cubicTo(122.873f, 259.802f, 106.43f, 253.11f, 89.9612f, 247.265f)
                cubicTo(73.4921f, 241.421f, 56.2824f, 236.496f, 44.0622f, 225.447f)
                cubicTo(31.3872f, 213.999f, 20.96f, 198.99f, 13.7292f, 183.786f)
                cubicTo(6.49838f, 168.581f, 1.7623f, 150.989f, 0.852762f, 133.899f)
                cubicTo(0.709835f, 131.208f, 0.66003f, 128.479f, 0.703341f, 125.713f)
                cubicTo(0.92403f, 111.119f, 3.49078f, 96.6569f, 8.30445f, 82.8847f)
                cubicTo(14.1515f, 66.3494f, 26.4952f, 53.5648f, 37.5395f, 41.2954f)
                cubicTo(48.9412f, 28.5695f, 61.2264f, 16.5089f, 76.3702f, 9.2425f)
                cubicTo(91.5139f, 1.97612f, 108.646f, 1.12163f, 125.667f, 0.208441f)
                cubicTo(142.244f, -0.757879f, 158.845f, 1.64253f, 174.477f, 7.2661f)
                cubicTo(190.946f, 13.1366f, 204.972f, 21.1531f, 217.192f, 32.1962f)
                cubicTo(229.848f, 43.6306f, 242.588f, 55.3716f, 249.819f, 70.5697f)
                cubicTo(257.049f, 85.7677f, 259.869f, 102.988f, 260.772f, 120.084f)
                cubicTo(260.856f, 121.61f, 260.934f, 123.156f, 261.006f, 124.709f)
                cubicTo(261.694f, 139.868f, 261.629f, 155.927f, 256.348f, 170.923f)
                close()
            }.apply {
                // Scale and translate the path to fit the given size
                val pathSize = getBounds().size
                val scaleX = size.width / pathSize.width
                val scaleY = size.height / pathSize.height
                val left = getBounds().left
                val top = getBounds().top

                transform(
                    androidx.compose.ui.graphics.Matrix().apply {
                        scale(scaleX, scaleY)
                        translate(-left, -top)
                    }
                )
            }
        )
    }
}
