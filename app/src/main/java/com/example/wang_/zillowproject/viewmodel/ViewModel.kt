package com.example.wang_.zillowproject.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.util.Log
import com.example.wang_.zillowproject.BR
import com.example.wang_.zillowproject.model.MyProperty

class ViewModel: BaseObservable() {

    @get: Bindable
    var mylist :MutableList<MyProperty> = mutableListOf()
    set(value) {
        field = value
        notifyPropertyChanged(BR.mylist)
    }

    @get: Bindable
    var idx_change: Int = 0
    set(value) {
        field = value
        notifyPropertyChanged(BR.idx_change)
    }

    fun initList(){
        //mylist.add(MyProperty("id1","add1"))
       // mylist.add(MyProperty("id2","add2"))
    }

    fun updateList(myProperty: MyProperty){
        mylist.add(myProperty)
        //mylist[0] = MyProperty("hi","hi")
        idx_change = 0

    }

}