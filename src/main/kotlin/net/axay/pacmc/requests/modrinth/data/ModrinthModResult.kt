package net.axay.pacmc.requests.modrinth.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import net.axay.pacmc.data.MinecraftVersion
import net.axay.pacmc.data.Repository
import net.axay.pacmc.requests.common.CommonConvertible
import net.axay.pacmc.requests.common.data.CommonModResult

@Serializable
data class ModrinthModResult(
    @SerialName("mod_id") val modId: String,
    val slug: String,
    val author: String,
    val title: String,
    val description: String,
    val versions: List<String>,
) : CommonConvertible<CommonModResult> {
    override fun convertToCommon() = CommonModResult(
        Repository.MODRINTH,
        modId.removePrefix("local-"),
        slug,
        title,
        description,
        author,
        versions.mapNotNull { MinecraftVersion.fromString(it) }
    )
}