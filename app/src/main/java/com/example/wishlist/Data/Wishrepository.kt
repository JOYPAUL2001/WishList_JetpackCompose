package com.example.wishlist.Data

import kotlinx.coroutines.flow.Flow

class Wishrepository(private val wishDao: WishDao) {
    suspend fun addAWish(wish: Wish){
        wishDao.addAWish(wish)
    }
    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById(id:Long): Flow<Wish> {
        return wishDao.getAWishById(id)
    }
    suspend fun updateAWish(wish: Wish){
        wishDao.updateAWish(wish)
    }
    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }
}