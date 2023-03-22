package com.sid.localizationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akexorcist.localizationactivity.ui.LocalizationActivity

class LocActivity : LocalizationActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loc)
    }
}