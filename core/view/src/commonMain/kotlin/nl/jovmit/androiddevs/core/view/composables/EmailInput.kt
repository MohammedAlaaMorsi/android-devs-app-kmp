package nl.jovmit.androiddevs.core.view.composables

import androiddevskmp.core.view.generated.resources.Res
import androiddevskmp.core.view.generated.resources.email_hint
import androiddevskmp.core.view.generated.resources.enter_email
import androiddevskmp.core.view.generated.resources.error_bad_email_format
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import nl.jovmit.androiddevs.core.view.theme.AppTheme
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun EmailInput(
    modifier: Modifier = Modifier,
    email: String,
    isInvalidEmailFormat: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        keyboardType = KeyboardType.Email,
        imeAction = ImeAction.Done
    ),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    onEmailChanged: (newValue: String) -> Unit,
    testTag: String = "email"
) {
    TextInput(
        modifier = modifier,
        text = email,
        label = stringResource(Res.string.enter_email),
        hint = stringResource(Res.string.email_hint),
        onTextChanged = onEmailChanged,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        error = {
            if (isInvalidEmailFormat) {
                Text(
                    text = stringResource(Res.string.error_bad_email_format),
                    color = AppTheme.colorScheme.error
                )
            }
        },
        testTag = testTag
    )
}

@Composable
@Preview
private fun EmailInputPreview() {
    AppTheme {
        EmailInput(
            email = "",
            onEmailChanged = {}
        )
    }
}

@Composable
@Preview
private fun EmailInputPreviewWithError() {
    AppTheme {
        EmailInput(
            email = "",
            onEmailChanged = {},
            isInvalidEmailFormat = true
        )
    }
}
