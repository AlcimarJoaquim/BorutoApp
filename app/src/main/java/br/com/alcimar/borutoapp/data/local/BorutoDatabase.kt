package br.com.alcimar.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.alcimar.borutoapp.data.local.dao.HeroDao
import br.com.alcimar.borutoapp.data.local.dao.HeroRemoteKeysDao
import br.com.alcimar.borutoapp.domain.model.Hero
import br.com.alcimar.borutoapp.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version = 1)
@TypeConverters(DatabaseCoverter::class)
abstract class BorutoDatabase: RoomDatabase() {
    abstract fun heroDao(): HeroDao
    abstract  fun heroRemoteKeysDao(): HeroRemoteKeysDao
}