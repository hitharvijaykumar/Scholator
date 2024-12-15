package com.example.scholator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.scholator.ui.theme.ScholatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Set the UI content here
        setContent {
            ScholatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Replace this with your actual layout code for the login page

                    // Assuming you have buttons with IDs "login" and "signup" in your layout XML
                    val loginButton = findViewById<Button>(R.id.login)
                    val signupButton = findViewById<Button>(R.id.signup)

                    // Action for Login Button (navigate to SecondActivity)
                    loginButton.setOnClickListener {
                        val intent = Intent(this@MainActivity, SecondActivity::class.java)
                        startActivity(intent)
                    }

                    // Action for Sign Up Button (show a toast message)
                    signupButton.setOnClickListener {
                        Toast.makeText(this@MainActivity, "Sign Up Done", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScholatorTheme {
        Greeting("Android")
    }
}
