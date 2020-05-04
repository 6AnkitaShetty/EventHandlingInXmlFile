package nl.realworks.www.eventhandlingxml

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeToGreen(view: View?) {
        relativeLayout.setBackgroundColor(Color.GREEN)
    }

    fun changeToBlue(view: View?) {
        relativeLayout.setBackgroundColor(Color.BLUE)
    }
}
