package com.example.notes.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.notes.dao.NoteDao
import com.example.notes.model.ModelNote



@Database(entities = [ModelNote::class], version = 1, exportSchema = false)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao ?

    companion object {
        private var noteDatabase: NoteDatabase? = null
        @Synchronized
        fun getInstance(context: Context): NoteDatabase? {
            if (noteDatabase == null) {
                noteDatabase = Room.databaseBuilder(context, NoteDatabase::class.java, "Notedb").build()
            }
            return noteDatabase
        }
    }
}