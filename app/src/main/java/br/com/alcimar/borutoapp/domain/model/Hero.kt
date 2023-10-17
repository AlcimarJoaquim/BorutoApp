package br.com.alcimar.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.alcimar.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY
import java.net.ProtocolFamily

@Entity(tableName = DETAILS_ARGUMENT_KEY)
data class Hero(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val moth: String,
    val day: String,
    val family: List<String>,
    val abilities: List<String>,
    val natureType: List<String>
)
