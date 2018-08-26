package com.example.photoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PhotoActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.photo_activity)
		if (savedInstanceState == null) {
			supportFragmentManager.beginTransaction()
					.replace(R.id.container, PhotoFragment.newInstance())
					.commitNow()
		}
	}

}
