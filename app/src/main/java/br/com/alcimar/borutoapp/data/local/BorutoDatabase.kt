package br.com.alcimar.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.alcimar.borutoapp.data.local.dao.HeroDao
import br.com.alcimar.borutoapp.data.local.dao.HeroRemoteKeyDao
import br.com.alcimar.borutoapp.domain.model.Hero
import br.com.alcimar.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
abstract class BorutoDatabase: RoomDatabase() {
    abstract fun heroDao(): HeroDao
    abstract  fun HeroRemoteKeyDao(): HeroRemoteKeyDao
}