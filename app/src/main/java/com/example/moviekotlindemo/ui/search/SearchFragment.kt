package com.example.moviekotlindemo.ui.search

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelStoreOwner
import com.example.moviekotlindemo.base.BaseFragment
import com.example.moviekotlindemo.databinding.FragmentSearchBinding
import com.example.tripsapplicationskotlins.ui.search.SearchViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding, SearchViewModel>() {


    override fun inflateViewBinding(inflater: LayoutInflater) =
        FragmentSearchBinding.inflate(inflater)

    override fun getViewModelProviderOwner(): ViewModelStoreOwner {
        return this
    }

    override fun getViewModelClass(): Class<SearchViewModel> {
        return SearchViewModel::class.java
    }

    override fun setUpView() {

    }
}