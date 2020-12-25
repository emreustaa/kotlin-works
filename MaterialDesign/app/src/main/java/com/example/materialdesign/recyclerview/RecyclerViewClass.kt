package com.example.materialdesign.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialdesign.databinding.ActivityRecyclerViewBinding

class RecyclerViewClass : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding
    private lateinit var ulkelerList: ArrayList<Ulkeler>
    private lateinit var adapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)
        //binding.rv.layoutManager =
        //StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        var u1 = Ulkeler(1, "Türkiye")
        var u2 = Ulkeler(2, "İtalya")
        var u3 = Ulkeler(3, "Japonya")
        var u4 = Ulkeler(4, "Rusya")

        ulkelerList = ArrayList<Ulkeler>()
        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)

        adapter = RvAdapter(this, ulkelerList)
        binding.rv.adapter = adapter

    }
}