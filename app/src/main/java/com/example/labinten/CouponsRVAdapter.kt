package com.example.labinten

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labinten.model.Offer
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.coupons_list_item.view.*

class CouponsRVAdapter (couponsList: ArrayList<Offer>):
    RecyclerView.Adapter<CouponsRVAdapter.CouponsViewHolder>() {

    private var couponsList = ArrayList<Offer>()

    init {
        this.couponsList = couponsList
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CouponsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.coupons_list_item, parent, false)
        return CouponsViewHolder(itemView)

    }

    override fun getItemCount(): Int = couponsList.size

    override fun onBindViewHolder(holder: CouponsViewHolder, position: Int) {
        val coupon = couponsList[position]
        holder.setCoupon(coupon)
    }

    class CouponsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
            View.OnClickListener {

        private var coupon: Offer? = null

        init {
            itemView.setOnClickListener(this)
        }

        fun setCoupon(coupon: Offer) {
            this.coupon = coupon

            //val URL_IMAGES = "https://image.tmdb.org/t/p/w500"

            itemView.tv_title.text = coupon.title
            itemView.tv_descrip.text = coupon.description
            itemView.tv_offer_value.text = coupon.offerValue
            itemView.tv_end_date.text = "hurry up the end date is: " + coupon.endDate
            itemView.tv_store.text = "STORE: " + coupon.store
            itemView.tv_categories.text = coupon.categories

            if (!coupon.imageUrl.isNullOrEmpty()) {
                Picasso.get().load(coupon.imageUrl).into(itemView.iv_picture)
                //Glide.with(itemView.context).load(URL_IMAGES + movie.posterPath).into(itemView.iv_picture)
            }

        }

        override fun onClick(v: View?) {
            /*      val intent = Intent(itemView.context, DetailActivity::class.java)
             intent.putExtra("movie", movie)
             intent.putExtra("envia","list")
             itemView.context.startActivity(intent)*/
        }

    }

}