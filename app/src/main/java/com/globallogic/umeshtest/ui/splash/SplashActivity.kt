package com.globallogic.umeshtest.ui.splash

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.globallogic.umeshtest.R
import com.globallogic.umeshtest.ui.home.HomeActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var tvAppName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        tvAppName = findViewById(R.id.tvAppName)
        tvAppName.alpha = 0f
        tvAppName.animate().setDuration(2000).alpha(1f).withEndAction {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left)
            finish()
        }
    }
}