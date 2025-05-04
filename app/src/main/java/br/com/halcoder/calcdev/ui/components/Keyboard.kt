package br.com.halcoder.calcdev.ui.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Backspace
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import br.com.halcoder.calcdev.R

@Composable
fun Keyboard(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxSize(),
    ) {

        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                ButtonSpecialOperators(
                    text = "Bin",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi Bin")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonSpecialOperators(
                    text = "Oct",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi Oct")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonSpecialOperators(
                    text = "Dec",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi Dec")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonSpecialOperators(
                    text = "Hex",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi Hex")
                    },
                    modifier = Modifier.weight(1f)
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                ButtonHighlightSystem(
                    text = "Ac",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi Ac")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonDisplayClear(
                    icon = Icons.AutoMirrored.Filled.Backspace,
                    content = stringResource(R.string.display_clear),
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi Excluir")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonOperator(
                    text = "/",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi /")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonOperator(
                    text = "*",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi *")
                    },
                    modifier = Modifier.weight(1f)
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                ButtonNumber(
                    text = "7",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi 7")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonNumber(
                    text = "8",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi 8")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonNumber(
                    text = "9",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi 9")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonOperator(
                    text = "-",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi -")
                    },
                    modifier = Modifier.weight(1f)
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                ButtonNumber(
                    text = "4",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi 4")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonNumber(
                    text = "5",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi 5")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonNumber(
                    text = "6",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi 6")
                    },
                    modifier = Modifier.weight(1f)
                )
                ButtonOperator(
                    text = "+",
                    onClick = {
                        Log.i("calculadora", "O botão apertado foi +")
                    },
                    modifier = Modifier.weight(1f)
                )
            }

            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.weight(3f)) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        ButtonNumber(
                            text = "1",
                            onClick = {
                                Log.i("calculadora", "O botão apertado foi 1")
                            },
                            modifier = Modifier.weight(1f)
                        )
                        ButtonNumber(
                            text = "2",
                            onClick = {
                                Log.i("calculadora", "O botão apertado foi 2")
                            },
                            modifier = Modifier.weight(1f)
                        )
                        ButtonNumber(
                            text = "3",
                            onClick = {
                                Log.i("calculadora", "O botão apertado foi 3")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth()) {
                        ButtonNumber(
                            text = "0",
                            onClick = {
                                Log.i("calculadora", "O botão apertado foi 0")
                            },
                            modifier = Modifier.weight(2f)
                        )
                        ButtonNumber(
                            text = ".",
                            onClick = {
                                Log.i("calculadora", "O botão apertado foi ponto")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
                Column(modifier = Modifier.weight(1f)) {
                    ButtonHighlightSystem(
                        text = "=",
                        onClick = {
                            Log.i("calculadora", "O botão apertado foi igual")
                        },
                        modifier = Modifier.fillMaxHeight()
                    )
                }
            }
        }
    }
}
