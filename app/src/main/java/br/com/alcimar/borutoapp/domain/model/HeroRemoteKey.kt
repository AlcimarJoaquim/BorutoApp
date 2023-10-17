package br.com.alcimar.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.alcimar.borutoapp.util.Constants.HERO_REMOTE_KEY_DATA

@Entity(tableName = HERO_REMOTE_KEY_DATA)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevKey: Int?,
    val nextKey: Int?
)
