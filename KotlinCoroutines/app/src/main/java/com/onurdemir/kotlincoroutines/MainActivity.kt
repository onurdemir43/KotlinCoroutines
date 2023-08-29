package com.onurdemir.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        //Run Blocking
        println("run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end")
        */

        /*
        //Global Scope
        println("global scope start")
        GlobalScope.launch {
                delay(5000)
                println("global scope")
        }
        println("global scope end")

         */

        /*
        //Coroutines Scope
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")

         */

        /*
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
            coroutineScope {
                launch {
                    delay(3000)
                    println("coroutine scope")
                }

            }
        }   */

        /*
        //Dispatchers Coroutines
        //Dispatchers.Default -> CPU Intensive
        //Dispatchers.IO -> Input / Output, Networking
        //Dispatchers.Main -> UI
        //Dispatchers.Unconfined -> Inherited Dispatcher

        runBlocking {
            launch(Dispatchers.Main) {
                println("Main Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO) {
                println("IO Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default) {
                println("Default Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined) {
                println("Unconfined Thread: ${Thread.currentThread().name}")
            }
        }
        */




    }

}