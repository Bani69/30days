package com.example.thirtydays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.thirtydays.ui.theme.ThirtydaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtydaysTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.primary
                ) {
                    Scaffold(

                        topBar = {CustomTopAppBar()}
                    )

                      {values->

                        LazyColumn(contentPadding = values){
                            items(1){
                                Imagecard(title ="Day 1: Introduction to JavaScript", description ="Today marks the beginning of my JavaScript learning journey. I'll start by understanding the basics of JavaScript, its importance, and how it's used in web development. By the end of the day, I aim to have a solid grasp of what JavaScript is and why it's a crucial skill for web developers", image = R.drawable.img1)
                                Imagecard(title ="Day 2: Setting Up Environment", description ="I'll spend today setting up my JavaScript development environment. Whether it's using a browser console, Node.js, or an integrated development environment like Visual Studio Code, having a well-configured environment is key to efficient coding", image = R.drawable.img2)
                                Imagecard(title = "Day 3-5: Basic JavaScript Concepts", description ="For the next three days, I'll delve into the fundamental concepts of JavaScript. This includes variables, data types, operators, control flow (if statements, loops), and functions. I'll practice writing simple programs to solidify my understanding." , image = R.drawable.img3 )
                                Imagecard(title ="Day 6-8: Working with Data" , description ="For the next three days, I'll delve into the fundamental concepts of JavaScript. This includes variables, data types, operators, control flow (if statements, loops), and functions. I'll practice writing simple programs to solidify my understanding." , image =  R.drawable.img4)
                                Imagecard(title = "Day 9-12: Event Handling", description = "Understanding how to handle events is crucial for creating dynamic and interactive web pages. Over the next four days, I'll learn about different events, how to set up event listeners, and how to respond to user interactions on a web page.", image = R.drawable.img5 )
                                Imagecard(title = "Day 13-15: Asynchronous JavaScript", description ="Asynchronous programming is a key aspect of JavaScript. I'll spend the next three days diving into concepts like callbacks, Promises, and async/await. This understanding will empower me to handle asynchronous operations effectively." , image = R.drawable.img6 )
                                Imagecard(title = "Day 16-18: Advanced Functions", description ="I'll focus on advanced concepts related to functions, including function expressions, arrow functions, closures, and scope. These features are essential for writing clean, modular, and efficient JavaScript code." , image =  R.drawable.img7)
                                Imagecard(title = "Day 19-22: JavaScript in the Browser", description ="The next four days will be dedicated to working with the browser environment. I'll explore AJAX, the Fetch API, and learn how to make asynchronous requests to servers. Additionally, I'll get hands-on experience working with APIs." , image =  R.drawable.img8)
                                Imagecard(title = "Day 23-25: Modern JavaScript Features", description = "As I approach the end of my 30-day journey, I'll spend time exploring modern JavaScript features introduced in ES6 and beyond. This includes arrow functions, template literals, and other enhancements that make JavaScript more powerful and expressive.", image = R.drawable.img9 )
                                Imagecard(title = "Day 26-28: Building Basic Projects", description = "I'll apply what I've learned by working on basic JavaScript projects. These projects will help reinforce my understanding of concepts and provide practical experience in solving real-world problems.", image =  R.drawable.img10)
                                Imagecard(title = "Day 29-30: Advanced JavaScript Projects", description = "In the final two days, I'll challenge myself with more advanced JavaScript projects. These projects will integrate multiple concepts and showcase my ability to create complex applications using JavaScript.", image =  R.drawable.img11)
                            }
                        }
                    }
                }
            }
        }

    }
}
@Composable
fun CustomTopAppBar(modifier: Modifier = Modifier, title: String = " A Daily Coding Adventure") {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                val isDarkTheme = isSystemInDarkTheme()

                val textColor = if (isDarkTheme) {
                    Color.White
                } else {
                    Color.Black
                }
                Text(text = title, style = MaterialTheme.typography.caption, color=textColor , modifier = Modifier.fillMaxWidth())


            }
        },
        modifier = modifier
    )
}



