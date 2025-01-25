package nl.jovmit.androiddevs.core.view.composables

import androiddevskmp.core.view.generated.resources.Res
import androiddevskmp.core.view.generated.resources.cd_hide_password
import androiddevskmp.core.view.generated.resources.cd_show_password
import androiddevskmp.core.view.generated.resources.enter_password
import androiddevskmp.core.view.generated.resources.error_bad_password_format
import androiddevskmp.core.view.generated.resources.password_hint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import nl.jovmit.androiddevs.core.view.theme.AppTheme
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun PasswordInput(
    modifier: Modifier = Modifier,
    password: String,
    isInvalidPasswordFormat: Boolean = false,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    onPasswordChanged: (newValue: String) -> Unit,
    testTag: String = "password"
) {
    var isPasswordHidden by remember { mutableStateOf(true) }
    val visualTransformation = if (isPasswordHidden) {
        PasswordVisualTransformation()
    } else {
        VisualTransformation.None
    }
    TextInput(
        modifier = modifier,
        text = password,
        label = stringResource(Res.string.enter_password),
        hint = stringResource(Res.string.password_hint),
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        onTextChanged = onPasswordChanged,
        visualTransformation = visualTransformation,
        trailingIcon = {
            val drawable = if (isPasswordHidden) Default.VisibilityOff else Default.Visibility
            Icon(
                modifier = Modifier.clickable(
                    onClickLabel = if (isPasswordHidden) {
                        stringResource(Res.string.cd_show_password)
                    } else {
                        stringResource(Res.string.cd_hide_password)
                    },
                    onClick = { isPasswordHidden = !isPasswordHidden }
                ),
                imageVector = drawable,
                contentDescription = null,
                tint = AppTheme.colorScheme.onBackground
            )
        },
        error = {
            if (isInvalidPasswordFormat) {
                Text(
                    text = stringResource(Res.string.error_bad_password_format),
                    color = AppTheme.colorScheme.error
                )
            }
        },
        testTag = testTag
    )
}

@Composable
@Preview
private fun PreviewPasswordInput() {
    AppTheme {
        PasswordInput(
            password = "something",
            onPasswordChanged = {}
        )
    }
}

@Composable
@Preview
private fun PreviewPasswordInputWithHint() {
    AppTheme {
        PasswordInput(
            password = "",
            onPasswordChanged = {}
        )
    }
}

@Composable
@Preview
private fun PreviewPasswordInputWithError() {
    AppTheme {
        PasswordInput(
            password = "",
            isInvalidPasswordFormat = true,
            onPasswordChanged = {}
        )
    }
}
