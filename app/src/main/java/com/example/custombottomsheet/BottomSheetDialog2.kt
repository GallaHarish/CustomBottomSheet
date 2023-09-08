package com.example.custombottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.updateLayoutParams
import com.example.custombottomsheet.databinding.BottomSheet2Binding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetDialog2 : BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheet2Binding
    private var screenSize: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheet2Binding.inflate(layoutInflater)
        val bundle = arguments
        screenSize = bundle!!.getInt("screenSize")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.updateLayoutParams { height = screenSize / 4 }
    }
}