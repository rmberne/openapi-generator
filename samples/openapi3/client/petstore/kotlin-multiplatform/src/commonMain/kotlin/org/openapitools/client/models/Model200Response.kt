/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer
/**
 * Model for testing model name starting with number
 * @param name 
 * @param propertyClass 
 */
@Serializable
data class Model200Response (
    @SerialName(value = "name") val name: kotlin.Int? = null,
    @SerialName(value = "class") val propertyClass: kotlin.String? = null
)

