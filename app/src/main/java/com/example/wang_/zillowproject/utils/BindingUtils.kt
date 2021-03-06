package com.example.wang_.zillowproject.utils

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.example.wang_.zillowproject.model.BindableAdapter


@BindingAdapter("mylist")
fun <T> setRecyclerViewProperties(recyclerView: RecyclerView, items: List<T>) {
    if (recyclerView.adapter is BindableAdapter<*>) {
        (recyclerView.adapter as BindableAdapter<T>).updateList(items)
    }
}

@BindingAdapter("idx_change")
fun <T> setDataChanged(recyclerView: RecyclerView, positions: Int) {
    if (recyclerView.adapter is BindableAdapter<*>) {
        (recyclerView.adapter as BindableAdapter<T>).idxChanged(positions)

    }
}