package com.example.photoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

class PhotoFragment : Fragment() {

	companion object {
		fun newInstance() = PhotoFragment()
	}

	private lateinit var viewModel: PhotoViewModel

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
	                          savedInstanceState: Bundle?): View {
		return inflater.inflate(R.layout.photo_fragment, container, false)
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProviders.of(this).get(PhotoViewModel::class.java)
		// TODO: Use the ViewModel
	}

}
