package ru.netology.mycustomview

import android.os.Bundle
import androidx.activity.ComponentActivity
import ru.netology.mycustomview.UIView.StatsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<StatsView>(R.id.stats)
        view.postDelayed(
            {
                view.data = listOf(
                    500F,
                    500F,
                    500F,
                    500F,
                )
            }, 3000
        )
    }
}
