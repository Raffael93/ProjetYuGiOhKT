package com.example.yugikt.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView;
import android.widget.Toast
import com.example.yugikt.R

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        val search = findViewById<SearchView>(R.id.searchView)
        val listView = findViewById<ListView>(R.id.listView)

        val names = arrayOf("Yugi Muto","Ryô Bakura","Seto Kaiba","Marik Ishtar","Pharaon Atem","Anzu Mazaki","Katsuya Jono-Uchi","Makuba Kaiba","Pegasus Jr Crawford","Prêtre Mahad",
        "Jaden Yuki","Alexia Rhodes","Chad Princeton","Zane Truesdale","Aster Phoenix")

        val adapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)

        listView.adapter =adapter

        search.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                search.clearFocus()
                if(names.contains(query)){
                    adapter.filter.filter(query)
                }else{
                    Toast.makeText(applicationContext,"Item not found",Toast.LENGTH_LONG).show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }

        })

    }
}