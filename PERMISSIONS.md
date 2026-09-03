# Android Permission Strategy

Request only permissions needed by the enabled features.

Potential permissions:
- POST_NOTIFICATIONS: order/status notifications on Android 13+
- ACCESS_COARSE_LOCATION / ACCESS_FINE_LOCATION: location-based matching
- FOREGROUND_SERVICE and location foreground-service capability where required by the Android version
- Notification listener access: only if the user explicitly enables notification-based ingestion; this does NOT grant permission to control another app.

Do not request unrelated permissions. Explain each permission before requesting it and provide an in-app settings page to review access.
