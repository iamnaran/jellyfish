package ui.appcomponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun EmailInput(
    label: String,
    currentValue: String,
    icon: Painter,
    focusRequester: FocusRequester? = null,
    keyboardActions: KeyboardActions,
    onValueChange: (String) -> Unit
) {

    TextField(
        value = currentValue,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(focusRequester ?: FocusRequester()),
        leadingIcon = { Icon(painter = icon, contentDescription = label) },
        label = { Text(text = label) },
        shape = RoundedCornerShape(8.dp),
        singleLine = true,
        keyboardActions = keyboardActions,
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
    )
}


@Composable
fun PasswordInput(
    label: String,
    icon: Painter,
    currentValue: String,
    focusRequester: FocusRequester? = null,
    keyboardActions: KeyboardActions,
    onValueChange: (String) -> Unit
) {

    var passwordVisible by remember { mutableStateOf(false) }

    TextField(
        value = currentValue,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(focusRequester ?: FocusRequester()),
        leadingIcon = { Icon(painter = icon, contentDescription = label) },
        label = { Text(text = label) },
        shape = RoundedCornerShape(8.dp),
        singleLine = true,
        keyboardActions = keyboardActions,
        visualTransformation =
            PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Next
        ),

        )


}


@Composable
fun NumberTextInput(
    label: String,
    icon: ImageVector,
    currentValue: String,
    focusRequester: FocusRequester? = null,
    keyboardActions: KeyboardActions,
    onValueChange: (String) -> Unit
) {

    TextField(
        value = currentValue,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(focusRequester ?: FocusRequester()),
        leadingIcon = { Icon(imageVector = icon, contentDescription = label) },
        label = { Text(text = label) },
        shape = RoundedCornerShape(8.dp),
        singleLine = true,
        keyboardActions = keyboardActions,
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Next
        ),

        )


}


@Composable
fun NameInput(
    label: String,
    icon: ImageVector,
    currentValue: String,
    visualTransformation: VisualTransformation,
    focusRequester: FocusRequester? = null,
    keyboardActions: KeyboardActions,
    onValueChange: (String) -> Unit
) {

    TextField(
        value = currentValue,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(focusRequester ?: FocusRequester()),
        leadingIcon = { Icon(imageVector = icon, contentDescription = label) },
        label = { Text(text = label) },
        shape = RoundedCornerShape(8.dp),
        singleLine = true,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Words,
            autoCorrect = true,
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Next
        ),
    )
}
