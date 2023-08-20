package com.mathias.ec3_mathiastrasmonte.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mathias.ec3_mathiastrasmonte.model.Clothe

@Database(entities = [Clothe::class], version = 1)
abstract class ClotheDataBase: RoomDatabase() {
    abstract fun ClotheDao() : ClotheDao

    companion object{
        @Volatile
        private var instance : ClotheDataBase? = null
        fun getDataBase(context: Context): ClotheDataBase{
            if(instance == null){
                synchronized(this){
                    instance = buildDataBase(context)
                }
            }
            return instance!!
        }

        private fun buildDataBase(context: Context): ClotheDataBase? {
            return Room.databaseBuilder(
                context.applicationContext,
                ClotheDataBase::class.java,
                "clothe_database"
            ).build()
        }
    }

}