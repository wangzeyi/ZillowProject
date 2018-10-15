package com.example.wang_.zillowproject.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import com.example.wang_.zillowproject.R
import com.example.wang_.zillowproject.databinding.ActivityMainBinding
import com.example.wang_.zillowproject.model.MyProperty
import com.example.wang_.zillowproject.model.MyPropertyAdapter
import com.example.wang_.zillowproject.viewmodel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel = ViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val adapter = MyPropertyAdapter()
        recycler_property.adapter = adapter
        recycler_property.layoutManager = LinearLayoutManager(this)

        binding.viewmodel = viewModel

        //viewModel.updateList()
        viewModel.initList()



        button_update.setOnClickListener(View.OnClickListener {
            var info = editText_property.text
            var info_split = info.split(" ")
            var myProperty = MyProperty(info_split[0], info_split[1])
            viewModel.updateList(myProperty) }
        )
    }


}
