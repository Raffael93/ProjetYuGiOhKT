package com.example.yugikt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yugikt.Adapter.CardAdapter
import com.example.yugikt.Interface.RetrofitService
import com.example.yugikt.Model.Card

import com.example.yugikt.Retrofit.Common
import kotlinx.android.synthetic.main.activity_test.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RecyclerView : AppCompatActivity() {

    lateinit var mService: RetrofitService
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var  adapter : CardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        mService = Common.retrofitService

        recyclerView.setHasFixedSize(true)

        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager


        getAllCardList()
    }


    private fun getAllCardList(){



        mService.getCards().enqueue(object : Callback<MutableList<Card>> {
            override fun onFailure(call: Call<MutableList<Card>>, t: Throwable) {

            }

            override fun onResponse(call: Call<MutableList<Card>>, response: Response<MutableList<Card>>) {
               adapter =  CardAdapter(baseContext, response.body() as MutableList<Card>)
                adapter.notifyDataSetChanged()
                recyclerView.adapter = adapter

            }


        })



















    }
}