package com.example.moviekotlindemo.ui.main

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.moviekotlindemo.R
import com.example.moviekotlindemo.base.BaseActivity
import com.example.moviekotlindemo.databinding.ActivityMainBinding
import com.example.moviekotlindemo.ui.detail.DetailFragment
import com.example.moviekotlindemo.ui.favorite.FavoriteFragment
import com.example.moviekotlindemo.ui.home.HomeFragment
import com.example.moviekotlindemo.ui.search.SearchFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun inflateViewBinding(inflater: LayoutInflater) =
        ActivityMainBinding.inflate(inflater)

    override fun initView() {
        // default status
        replaceFragment(HomeFragment())
        changeActionBar("Home")
        viewBinding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.iHome -> {
                    replaceFragment(HomeFragment())
                    changeActionBar("Home")
                }
                R.id.iAll -> {
                    replaceFragment(DetailFragment())
                    changeActionBar("All")
                }
                R.id.iSearch -> {
                    replaceFragment(SearchFragment())
                    changeActionBar("Search")
                }
                R.id.iUpdate -> {
                    replaceFragment(FavoriteFragment())
                    changeActionBar("Update")
                }
            }
            true
        }

    }

    /**
     * Fragment all page in activity
     *
     * @param fragment return another fragments
     */
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }

    override fun initData() {}

    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }
}