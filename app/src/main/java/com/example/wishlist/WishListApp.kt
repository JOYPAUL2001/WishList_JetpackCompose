package com.example.wishlist

import android.app.Application
import com.example.wishlist.Object.Graph

class WishListApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}