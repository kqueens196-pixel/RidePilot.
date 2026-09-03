# Initial API Contract

POST /v1/auth/request-otp
POST /v1/auth/verify-otp

GET  /v1/me
PATCH /v1/me/preferences

GET  /v1/providers
POST /v1/providers/{provider}/connect
POST /v1/providers/{provider}/disconnect

GET  /v1/orders
GET  /v1/orders/{id}

GET  /v1/subscription
POST /v1/subscription/monthly
POST /v1/subscription/day-pass

POST /v1/webhooks/{provider}

Production implementation must add authentication, rate limits, idempotency, audit logs, encryption, and provider-specific signature verification.
