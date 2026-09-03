# Architecture

Android App
  -> HTTPS API
  -> Authentication / OTP
  -> Subscription & Entitlements
  -> Order Ingestion
  -> Matching Engine
  -> Provider Adapters
  -> Database
  -> Notifications

Provider lifecycle:
DISCOVER -> SANDBOX -> USER OAUTH -> PROVIDER APPROVAL -> PRODUCTION -> MONITORING

ProviderAdapter interface must isolate each provider so one provider outage does not break the entire application.
