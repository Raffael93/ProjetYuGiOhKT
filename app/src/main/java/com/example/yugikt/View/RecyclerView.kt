package com.example.yugikt.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yugikt.Model.Adapter.CardAdapter
import com.example.yugikt.Model.Interface.RetrofitService
import com.example.yugikt.Model.Data.Card
import com.example.yugikt.R

import com.example.yugikt.Model.Retrofit.Common
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