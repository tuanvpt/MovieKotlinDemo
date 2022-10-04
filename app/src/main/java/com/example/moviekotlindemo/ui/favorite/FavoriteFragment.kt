package com.example.moviekotlindemo.ui.favorite

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelStoreOwner
import com.example.moviekotlindemo.databinding.FragmentFavoriteBinding
import com.example.moviekotlindemo.base.BaseFragment
import com.example.moviekotlindemo.databinding.FragmentHomeBinding
import com.example.moviekotlindemo.ui.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoriteFragment : BaseFragment<FragmentFavoriteBinding, FavoriteViewModel>() {

    override fun inflateViewBinding(inflater: LayoutInflater) =
        FragmentFavoriteBinding.inflate(inflater)

    override fun getViewModelClass(): Class<FavoriteViewModel> {
        return FavoriteViewModel::class.java
    }

    override fun setUpView() {

    }

    override fun getViewModelProviderOwner(): ViewModelStoreOwner {
        return this
    }
}




