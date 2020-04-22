package com.example.labinten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.labinten.model.Coupons
import com.example.labinten.model.Offer
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var listCoupons = ArrayList<Offer>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
        loadList()
    }

    private fun loadList() {
        val apiKey="a5b8c00476b0974b91ab780966dec771"

        val incremental = 0
        val last_extract_datetime = ""
        val format = "json"
        val off_record= 1
        val last_extract = 1577505596

        ApiService.create()
            .getOffers(apiKey)
            .enqueue(object : Callback<Coupons> {
                override fun onFailure(call: Call<Coupons>, t: Throwable) {
                    Log.d("Error", t.message)
                }

                override fun onResponse(call: Call<Coupons>, response: Response<Coupons>) {
                    if (response.isSuccessful) {
                        listCoupons = response.body()?.offers as ArrayList<Offer>
                        val couponsRVAdapter = CouponsRVAdapter(listCoupons)
                        recyclerView.adapter = couponsRVAdapter
                    }
                }
            })
    }



}
