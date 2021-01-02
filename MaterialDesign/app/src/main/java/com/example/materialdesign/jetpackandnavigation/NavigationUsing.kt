package com.example.materialdesign.jetpackandnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityNavigationUsingBinding

class NavigationUsing : AppCompatActivity() {
    private lateinit var navigationController: NavController
    private lateinit var binding: ActivityNavigationUsingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationUsingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigationController = Navigation.findNavController(this, R.id.fragmentNavigationHost)

        NavigationUI.setupActionBarWithNavController(this, navigationController)

    }

    override fun onSupportNavigateUp(): Boolean {

        return NavigationUI.navigateUp(navigationController,null)
    }

}