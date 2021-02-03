package com.example.geo_location
import android.os.Bundle
import android.content.Intent

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        val reLaunchMain = Intent(this,MainActivity()::class.java)
        reLaunchMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(reLaunchMain)
    }
}
