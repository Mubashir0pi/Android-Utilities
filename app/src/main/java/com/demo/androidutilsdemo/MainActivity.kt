package com.demo.androidutilsdemo

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.utilities.General
import com.android.utilities.ImageUtil
import com.android.utilities.PermissionsManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // for runtime permissions
        if (!PermissionsManager(this).isGranted(Manifest.permission.CAMERA)) {
            PermissionsManager(this).request(1,Manifest.permission.CAMERA)
        }
        // for general utilities
        General.getMd5("test")

        // for Image utilities
        ImageUtil.setOpenedTime(3L)


    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            } else {

            }
        }
    }
}