package com.example.scholator

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import com.example.scholator.ui.theme.ScholatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the UI content
        setContent {
            ScholatorTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current // Get the context for Intent and Toast

    // Scaffold provides structure for the screen, allowing for padding and other common UI components
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Login Button
            Button(onClick = {
                // Navigate to SecondActivity
                val intent = Intent(context, SecondActivity::class.java)
                context.startActivity(intent)
            }) {
                Text("Login")
            }

            Spacer(modifier = Modifier.height(16.dp)) // Space between buttons

            // Sign Up Button
            Button(onClick = {
                // Show a toast for Sign Up action
                Toast.makeText(context, "Sign Up Done", Toast.LENGTH_SHORT).show()
            }) {
                Text("Sign Up")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ScholatorTheme {
        MainScreen()
    }
}
