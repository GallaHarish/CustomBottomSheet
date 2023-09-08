package com.example.custombottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import com.example.custombottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // on below line we are creating and
        // initializing variable for display metrics.
        val displayMetrics = DisplayMetrics()
        // on below line we are getting metrics
        // for display using window manager.
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        binding.openBottomSheet.setOnClickListener {
            val bottomSheet = BottomSheetDialog()
            val mBundle = Bundle()
            mBundle.putInt("screenSize", displayMetrics.heightPixels)
            bottomSheet.arguments = mBundle
            bottomSheet.show(supportFragmentManager, "ModalBottomSheet")
        }
    }
}