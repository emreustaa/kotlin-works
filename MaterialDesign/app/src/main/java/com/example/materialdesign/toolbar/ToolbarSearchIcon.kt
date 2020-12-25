package com.example.materialdesign.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.SearchView
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityToolbarSearchIconBinding


class ToolbarSearchIcon : AppCompatActivity(), SearchView.OnQueryTextListener {
    private lateinit var binding: ActivityToolbarSearchIconBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarSearchIconBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbarSearch.title = "ToolbarSearch"

        setSupportActionBar(binding.toolbarSearch)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbar_search_menu, menu)

        val item = menu!!.findItem(R.id.action_ara)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return true
    }

    override fun onQueryTextSubmit(query: String?): Boolean {

        Log.e("onQueryTextSubmit", query.toString())
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        Log.e("onQueryTextChange", newText.toString())
        return true
    }
}