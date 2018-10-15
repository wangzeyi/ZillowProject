package com.example.wang_.zillowproject.model

interface BindableAdapter<T> {
    fun updateList(items: List<T>)
    fun idxChanged(positions: Int)
}