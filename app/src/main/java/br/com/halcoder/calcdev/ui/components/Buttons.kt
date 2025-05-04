package br.com.halcoder.calcdev.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import br.com.halcoder.calcdev.ui.theme.CalculatorButtonsSpecialOperatorsTextStyle
import br.com.halcoder.calcdev.ui.theme.CalculatorButtonsTextStyle

@Composable
fun ButtonCopyPaste(
    text: String,
    icon: ImageVector,
    content: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val addColor = MaterialTheme.colorScheme
    val colorTheme = if (isSystemInDarkTheme()) addColor.onSurface else addColor.primary

    OutlinedButton(
        onClick = onClick,
        modifier = modifier.padding(10.dp),
        border = BorderStroke(
            width = 1.dp,
            color = colorTheme
        )
    ) {
        Icon(
            imageVector = icon,
            contentDescription = content,
            tint = colorTheme
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = text,
            color = colorTheme
        )
    }
}

@Composable
fun ButtonHighlightSystem(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val addColor = MaterialTheme.colorScheme

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = addColor.primary,
            contentColor = if (isSystemInDarkTheme()) addColor.onSurface else addColor.onSecondary
        ),
        modifier = modifier
            .padding(10.dp)
            .size(70.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium.merge(CalculatorButtonsTextStyle)
        )
    }
}

@Composable
fun ButtonDisplayClear(
    icon: ImageVector,
    content: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val addColor = MaterialTheme.colorScheme

    IconButton(
        onClick = onClick,
        modifier = modifier
            .padding(10.dp)
            .size(70.dp)
            .background(
                color = addColor.secondary,
                shape = CircleShape
            )

    ) {
        Icon(
            imageVector = icon,
            contentDescription = content,
            tint = if (isSystemInDarkTheme()) addColor.onSurface else addColor.onSecondary
        )
    }
}

@Composable
fun ButtonSpecialOperators(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val addColor = MaterialTheme.colorScheme

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = addColor.surface,
            contentColor = addColor.onSurface
        ),
        modifier = modifier
            .padding(10.dp)
            .size(70.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium.merge(
                CalculatorButtonsSpecialOperatorsTextStyle
            )
        )
    }
}

@Composable
fun ButtonOperator(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val addColor = MaterialTheme.colorScheme

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = addColor.secondary,
            contentColor = if (isSystemInDarkTheme()) addColor.onSurface else addColor.onSecondary
        ),
        modifier = modifier
            .padding(10.dp)
            .size(70.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium.merge(CalculatorButtonsTextStyle)
        )
    }
}

/*@Composable
fun ButtonOperationResult(text: String, onClick: ()-> Unit, modifier: Modifier = Modifier){
    Button(
        onClick = onClick,
        modifier = modifier.padding(10.dp).size(70.dp)
    ) {
        Text(text = text)
    }
}*/

@Composable
fun ButtonNumber(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {

    val addColor = MaterialTheme.colorScheme

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = addColor.surface,
            contentColor = addColor.onSurface
        ),
        modifier = modifier
            .padding(10.dp)
            .size(70.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium.merge(CalculatorButtonsTextStyle)
        )
    }
}
