package br.com.halcoder.calcdev.ui.components

import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.ContentPaste
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.halcoder.calcdev.R


@Composable
fun Display(modifier: Modifier) {

    val addColor = MaterialTheme.colorScheme

    Row(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                ButtonCopyPaste(
                    text = "Copiar",
                    icon = Icons.Filled.ContentCopy,
                    content = stringResource(R.string.button_copy),
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi Copy")
                    }
                )
                ButtonCopyPaste(
                    text = "Copiar",
                    icon = Icons.Filled.ContentPaste,
                    content = stringResource(R.string.button_paste),
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi Copy")
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "",
                    color = if (isSystemInDarkTheme()) addColor.onSurface else addColor.primary
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "0",
                    fontSize = 36.sp,
                    color = if (isSystemInDarkTheme()) addColor.onSurface else addColor.primary
                )
            }
        }
    }
}