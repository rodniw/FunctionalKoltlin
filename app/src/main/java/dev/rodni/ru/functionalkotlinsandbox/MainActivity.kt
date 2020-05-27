package dev.rodni.ru.functionalkotlinsandbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        anonymousFunsWithVars()

        /**
         * example of using high-order function
         */
        doFun { perimeter() }
    }

    /**
     * example of the high-order function
     */
    private fun doFun(func: () -> Unit) {
        func()
    }

    /**
     * calculates a perimeter of some shape
     */
    private fun perimeter() {
        val perimeter = { firstSide: Int, secondSide: Int -> firstSide*2 + secondSide*2}
        Log.d("perimeter", "perimeter is: ${perimeter(3, 4)}")
    }

    private fun anonymousFunsWithVars() {
        /**
         * anonymous functions with params
         */
        val summary: (Int, Int) -> Int = { firstNum, secondNum -> firstNum + secondNum }

        /**
         * anonymous functions with no explicit param for the var but with it for the fun
         */
        val summaryWithExplicit = { firstNum: Int, secondNum: Int -> firstNum + secondNum }

        /**
         * anonymous functions without params
         * this impossible when i have more than one params
         */
        val square: (Int) -> Int = { it * it }

        //this will print only the exact function which was passed through
        Log.d("summary","function is: $summary")
        //this will print a result of a summary fun
        Log.d("summary","summary is: ${summary(5,7)}")

        //this will print a result of a square fun
        Log.d("square","square is: ${square(5)}")
    }
}
