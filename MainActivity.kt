package com.example.calculator

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculator()
                }
            }
        }
    }
}

@Composable
fun Calculator(modifier: Modifier = Modifier)
{
    var amountInput1 by remember{ mutableStateOf("")}
    var result by remember{ mutableStateOf("")}


    Column{
        //EditText editText = findViewById(R.id.edit_text);
        TextField(value = amountInput1, onValueChange = {amountInput1=it},
            /*keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number, imeAction = ImeAction.Done)*/)

        Row(){

            Column{
                Button(onClick = { amountInput1 + "1" }) {
                    Text(text = "1")
                }
                Button(onClick = { amountInput1 + "4"}) {
                    Text(text = "4")
                }
                Button(onClick = { amountInput1 + "7"}) {
                    Text(text = "7")
                }

            }

            Column{
                Button(onClick = { amountInput1 + "2" }) {
                    Text(text = "2")
                }
                Button(onClick = {amountInput1 + "4"}) {
                    Text(text = "5")
                }
                Button(onClick = { amountInput1 + "8" }) {
                    Text(text = "8")
                }
                Button(onClick = { amountInput1 + "0" }) {
                    Text(text = "0")
                }
            }

            Column{
                Button(onClick = { amountInput1 + "3" }) {
                    Text(text = "3")
                }
                Button(onClick = { amountInput1 + "6"}) {
                    Text(text = "6")
                }
                Button(onClick = { amountInput1 + "9" }) {
                    Text(text = "9")
                }

            }

            Column{
                Button(onClick = { amountInput1 + "+"}) {
                    Text(text = "+")
                }

                Button(onClick = { amountInput1 + "-"}) {
                    Text(text = "-")
                }

                Button(onClick = { amountInput1 + "=" }) {
                    Text(text = "=")
                }

                Button(onClick = {amountInput1 = ""}) {
                    Text(text = "Reset")
                }
            }

        }
    }
}


private fun calculate(amountInput1: Double)
{
    if (amountInput1 != null)
    {
        //var input = amountInput1.replace(Regex("[^0-9]+-"), "")
    }
}

private fun clear(amountInput1: Double)
{
    if(amountInput1 != null)
    {
        //amountInput1 = ""
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculatorTheme {
        Calculator()
    }
}