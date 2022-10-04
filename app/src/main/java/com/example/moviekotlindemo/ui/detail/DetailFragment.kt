package com.example.moviekotlindemo.ui.detail

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelStoreOwner
import com.example.moviekotlindemo.base.BaseFragment
import com.example.moviekotlindemo.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : BaseFragment<FragmentDetailBinding, DetailViewModel>() {

    override fun inflateViewBinding(inflater: LayoutInflater) =
        FragmentDetailBinding.inflate(inflater)

    override fun getViewModelProviderOwner(): ViewModelStoreOwner {
        return this
    }

    override fun getViewModelClass(): Class<DetailViewModel> {
        return DetailViewModel::class.java
    }

    override fun setUpView() {

    }


}