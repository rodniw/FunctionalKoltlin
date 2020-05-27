package dev.rodni.ru.functionalkotlinsandbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * anonymous functions
         */
        val summary: (Int, Int) -> Int = { firstNum, secondNum -> firstNum + secondNum}
        //this will print only the exact function which was passed through
        Log.d("summary","function is: $summary")
        //this will print a result of a summary fun
        Log.d("summary","summary is: ${summary(5,7)}")
    }
}
