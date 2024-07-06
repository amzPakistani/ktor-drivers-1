package example.com.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Driver(
    val name: String,
    val id: String,
    val desc: String,
    val picURL:String
)