/**
 * Labrinth
 *
 * This API is documented in the **OpenAPI format** and is available for download [here](/openapi.yaml).  # Cross-Origin Resource Sharing This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with  [W3C spec](https://www.w3.org/TR/cors/). This allows for cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site.  # Authentication This API uses GitHub tokens for authentication. The token is in the `Authorization` header of the request. You can get a token [here](#operation/initAuth).   Example:  ```  Authorization: gho_pJ9dGXVKpfzZp4PUHSxYEq9hjk0h288Gwj4S  ``` 
 *
 * The version of the OpenAPI document: 13187de (v2)
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package net.axay.pacmc.repoapi.modrinth.model

import net.axay.pacmc.repoapi.modrinth.model.EditableProjectAllOfDonationUrls
import net.axay.pacmc.repoapi.modrinth.model.EditableProjectAllOfLicense

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param body A long form description of the mod
 * @param status The status of the project
 * @param license 
 * @param bodyUrl The link to the long description of the project
 * @param issuesUrl An optional link to where to submit bugs or issues with the project
 * @param sourceUrl An optional link to the source code of the project
 * @param wikiUrl An optional link to the project's wiki page or other relevant information
 * @param discordUrl An optional invite link to the project's discord
 * @param donationUrls A list of donation links for the project
 */
@Serializable
data class EditableProjectAllOf (

    /* A long form description of the mod */
    @SerialName(value = "body") @Required val body: kotlin.String,

    /* The status of the project */
    @SerialName(value = "status") @Required val status: EditableProjectAllOf.Status,

    @SerialName(value = "license") @Required val license: EditableProjectAllOfLicense,

    /* The link to the long description of the project */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "body_url") val bodyUrl: kotlin.String? = "null",

    /* An optional link to where to submit bugs or issues with the project */
    @SerialName(value = "issues_url") val issuesUrl: kotlin.String? = null,

    /* An optional link to the source code of the project */
    @SerialName(value = "source_url") val sourceUrl: kotlin.String? = null,

    /* An optional link to the project's wiki page or other relevant information */
    @SerialName(value = "wiki_url") val wikiUrl: kotlin.String? = null,

    /* An optional invite link to the project's discord */
    @SerialName(value = "discord_url") val discordUrl: kotlin.String? = null,

    /* A list of donation links for the project */
    @SerialName(value = "donation_urls") val donationUrls: kotlin.collections.List<EditableProjectAllOfDonationUrls>? = null

) {

    /**
     * The status of the project
     *
     * Values: approved,rejected,draft,unlisted,processing,unknown
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "approved") approved("approved"),
        @SerialName(value = "rejected") rejected("rejected"),
        @SerialName(value = "draft") draft("draft"),
        @SerialName(value = "unlisted") unlisted("unlisted"),
        @SerialName(value = "processing") processing("processing"),
        @SerialName(value = "unknown") unknown("unknown");
    }
}

