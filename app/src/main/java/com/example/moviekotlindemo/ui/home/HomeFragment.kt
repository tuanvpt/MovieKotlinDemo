package com.example.moviekotlindemo.ui.home

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelStoreOwner
import com.example.moviekotlindemo.base.BaseFragment
import com.example.moviekotlindemo.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override fun inflateViewBinding(inflater: LayoutInflater) =
        FragmentHomeBinding.inflate(inflater)

    override fun getViewModelClass(): Class<HomeViewModel> {
        return HomeViewModel::class.java
    }

    override fun setUpView() {

    }

    override fun getViewModelProviderOwner(): ViewModelStoreOwner {
        return this
    }

}