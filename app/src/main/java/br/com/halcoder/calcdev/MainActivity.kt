package br.com.halcoder.calcdev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.halcoder.calcdev.ui.components.Display
import br.com.halcoder.calcdev.ui.components.Keyboard
import br.com.halcoder.calcdev.ui.theme.CalcDevTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalcDevTheme {
                Main()
            }
        }
    }
}

@Composable
fun Main() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = { innerPadding ->
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)) {
                Display(modifier = Modifier.weight(0.3f))
                Keyboard(modifier = Modifier.weight(0.7f))
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    CalcDevTheme {
        Main()
    }
}