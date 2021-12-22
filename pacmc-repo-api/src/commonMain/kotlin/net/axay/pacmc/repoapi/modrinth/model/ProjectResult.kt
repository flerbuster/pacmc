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

import net.axay.pacmc.repoapi.modrinth.model.ProjectResultAllOf
import net.axay.pacmc.repoapi.modrinth.model.ServerRenderedProject

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param title The title or name of the project
 * @param description A short description of the project
 * @param categories A list of the categories that the project is in
 * @param clientSide The client side support of the project
 * @param serverSide The server side support of the project
 * @param projectType The project type of the project
 * @param downloads The total number of downloads of the project
 * @param projectId The ID of the project
 * @param author The username of the project's author
 * @param versions A list of the minecraft versions supported by the project
 * @param follows The total number of users following the project
 * @param dateCreated The date the project was created
 * @param dateModified The date the project was last modified
 * @param license The license of the project
 * @param slug The slug of a project, used for vanity URLs
 * @param iconUrl The URL of the project's icon
 * @param latestVersion The latest version of minecraft that this project supports
 */
@Serializable
data class ProjectResult (

    /* The title or name of the project */
    @SerialName(value = "title") @Required val title: kotlin.String,

    /* A short description of the project */
    @SerialName(value = "description") @Required val description: kotlin.String,

    /* A list of the categories that the project is in */
    @SerialName(value = "categories") @Required val categories: kotlin.collections.List<kotlin.String>,

    /* The client side support of the project */
    @SerialName(value = "client_side") @Required val clientSide: ProjectResult.ClientSide,

    /* The server side support of the project */
    @SerialName(value = "server_side") @Required val serverSide: ProjectResult.ServerSide,

    /* The project type of the project */
    @SerialName(value = "project_type") @Required val projectType: ProjectResult.ProjectType,

    /* The total number of downloads of the project */
    @SerialName(value = "downloads") @Required val downloads: kotlin.Int,

    /* The ID of the project */
    @SerialName(value = "project_id") @Required val projectId: kotlin.String,

    /* The username of the project's author */
    @SerialName(value = "author") @Required val author: kotlin.String,

    /* A list of the minecraft versions supported by the project */
    @SerialName(value = "versions") @Required val versions: kotlin.collections.List<kotlin.String>,

    /* The total number of users following the project */
    @SerialName(value = "follows") @Required val follows: kotlin.Int,

    /* The date the project was created */
    @SerialName(value = "date_created") @Required val dateCreated: kotlin.String,

    /* The date the project was last modified */
    @SerialName(value = "date_modified") @Required val dateModified: kotlin.String,

    /* The license of the project */
    @SerialName(value = "license") @Required val license: kotlin.String,

    /* The slug of a project, used for vanity URLs */
    @SerialName(value = "slug") val slug: kotlin.String? = null,

    /* The URL of the project's icon */
    @SerialName(value = "icon_url") val iconUrl: kotlin.String? = null,

    /* The latest version of minecraft that this project supports */
    @SerialName(value = "latest_version") val latestVersion: kotlin.String? = null

) {

    /**
     * The client side support of the project
     *
     * Values: required,optional,unsupported
     */
    @Serializable
    enum class ClientSide(val value: kotlin.String) {
        @SerialName(value = "required") required("required"),
        @SerialName(value = "optional") optional("optional"),
        @SerialName(value = "unsupported") unsupported("unsupported");
    }
    /**
     * The server side support of the project
     *
     * Values: required,optional,unsupported
     */
    @Serializable
    enum class ServerSide(val value: kotlin.String) {
        @SerialName(value = "required") required("required"),
        @SerialName(value = "optional") optional("optional"),
        @SerialName(value = "unsupported") unsupported("unsupported");
    }
    /**
     * The project type of the project
     *
     * Values: mod,modpack
     */
    @Serializable
    enum class ProjectType(val value: kotlin.String) {
        @SerialName(value = "mod") mod("mod"),
        @SerialName(value = "modpack") modpack("modpack");
    }
}

