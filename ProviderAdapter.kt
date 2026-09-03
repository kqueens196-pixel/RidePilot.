package com.ridepilot.server.provider

/**
 * Adapter contract for an officially authorized provider integration.
 * Implementations must use the provider's documented API and approved scopes.
 */
interface ProviderAdapter {
    val providerId: String

    suspend fun authorize(userId: String): AuthorizationUrl
    suspend fun ingestAuthorizedOrder(event: ProviderOrderEvent): NormalizedOrder?
    suspend fun acceptOrder(orderId: String): AcceptResult
}

data class AuthorizationUrl(val url: String)

data class ProviderOrderEvent(
    val externalOrderId: String,
    val payload: Map<String, Any?>
)

data class NormalizedOrder(
    val providerId: String,
    val externalOrderId: String,
    val type: OrderType,
    val distanceKm: Double?
)

enum class OrderType { RIDE, PARCEL }

sealed class AcceptResult {
    data object Accepted : AcceptResult()
    data class Rejected(val reason: String) : AcceptResult()
    data class Failed(val message: String) : AcceptResult()
}
