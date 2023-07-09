package com.danielgs.nonotes.notes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.danielgs.nonotes.notes.domain.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao : NoteDao

    companion object{
        const val DATABASE_NAME = "notes_db"
    }

}