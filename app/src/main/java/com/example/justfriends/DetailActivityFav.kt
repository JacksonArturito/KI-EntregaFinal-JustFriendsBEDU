package com.example.justfriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivityFav : AppCompatActivity() {
    companion object {
        val PRODUCT = "PRODUCT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_fav)

        val product = intent.getParcelableExtra<Product>(PRODUCT)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragmentFav
        if (product != null) {
            detailFragment?.showProduct(product)
        }

    }
}