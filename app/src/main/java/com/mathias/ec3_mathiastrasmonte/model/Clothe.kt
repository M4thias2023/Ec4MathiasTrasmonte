package com.mathias.ec4_mathiastrasmonte.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "clothe")
@Parcelize
data class Clothe(
    @PrimaryKey
    val id: Int,
    val image: String,
    val title: String,
    val price: String,
    val description: String
): Parcelable


fun getData():List<Clothe>{
return listOf(
    Clothe(1,"","Polo Rojo","30.00",""),
    Clothe(1,"","Polo Rojo","30.00",""),
    Clothe(1,"","Polo Rojo","30.00",""),
    Clothe(1,"","Polo Rojo","30.00",""),
    Clothe(1,"","Polo Rojo","30.00",""),
    Clothe(1,"","Polo Rojo","30.00",""),
    Clothe(1,"","Polo Rojo","30.00",""),
    Clothe(1,"","Polo Rojo","30.00",""),
    )
}
