package com.testjarvis.ca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.jarvis.ca.Mark

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Mark.showAlert(this, "title", "message", R.color.colorAccent, 3000)

        Handler().postDelayed({
            Mark.showAlert(this, "title", "message", R.color.colorPrimary, 3000, R.drawable.alerter_ic_notifications)
        }, 3000)


        Handler().postDelayed({
            Mark.showAlertSuccess(this, "title", "message")
        }, 6000)

        Handler().postDelayed({
            Mark.showAlertSuccess(this,  "message")
        }, 9000)


        Handler().postDelayed({
            Mark.showAlertError(this, "message")
        }, 12000)

        Handler().postDelayed({
            Mark.showAlertError(this, "title", "message")
        }, 15000)


        Handler().postDelayed({
            Mark.showAlertWarning(this, "message")
        }, 18000)

        Handler().postDelayed({
            Mark.showAlertWarning(this, "title", "message")
        }, 21000)
    }
}
