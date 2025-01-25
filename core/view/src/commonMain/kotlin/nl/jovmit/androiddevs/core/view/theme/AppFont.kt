package nl.jovmit.androiddevs.core.view.theme


import androiddevskmp.core.view.generated.resources.Res
import androiddevskmp.core.view.generated.resources.opensans_bold
import androiddevskmp.core.view.generated.resources.opensans_regular
import androiddevskmp.core.view.generated.resources.opensans_semibold
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font

val OpenSans: FontFamily
    @Composable get() = FontFamily(
        Font(
            resource = Res.font.opensans_regular,
            weight = FontWeight.Normal
        ),
        Font(
            resource = Res.font.opensans_semibold,
            weight = FontWeight.SemiBold
        ),
        Font(
            resource = Res.font.opensans_bold,
            weight = FontWeight.Bold
        )
    )
