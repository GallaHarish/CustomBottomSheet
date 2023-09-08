package com.example.custombottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import androidx.core.view.updateLayoutParams
import com.example.custombottomsheet.databinding.BottomSheetBinding

class BottomSheetDialog : BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetBinding
    private var screenSize: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetBinding.inflate(layoutInflater)
        // Gets the data from the passed bundle
        val bundle = arguments
        screenSize = bundle!!.getInt("screenSize")
        binding.openBottomSheet2.setOnClickListener { openBottomSheet2() }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.updateLayoutParams { height = screenSize / 4 }
    }

    private fun openBottomSheet2() {
        val bottomSheet2 = BottomSheetDialog2()
        val mBundle = Bundle()
        mBundle.putInt("screenSize", screenSize)
        bottomSheet2.arguments = mBundle
        bottomSheet2.show(parentFragmentManager, "ModalBottomSheet2")
        binding.root.updateLayoutParams { height = screenSize / 2 }
    }
}