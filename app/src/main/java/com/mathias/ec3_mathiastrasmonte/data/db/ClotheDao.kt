package com.mathias.ec3_mathiastrasmonte.data.db

import androidx.room.*
import com.mathias.ec3_mathiastrasmonte.model.Clothe

@Dao
interface ClotheDao {
    @Query("SELECT * FROM clothe ORDER BY id DESC")
    fun getFavorites():List<Clothe>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addFavorite(clothe: Clothe)

    @Delete
    suspend fun removeFavorite(clothe: Clothe)
}