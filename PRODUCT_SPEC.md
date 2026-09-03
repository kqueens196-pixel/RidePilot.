# RidePilot Product Specification

## Modes
1. Parcel + One Ride (same/suitable route)
2. Only Ride
3. Only Parcel

Modes are independently switchable.

## Filters
Vehicle: Bike, Auto, Car, Delivery
Parcel radius: 1 km, 2 km, 5 km, 10 km
Route compatibility: configurable maximum detour

## Order flow
Authorized provider event -> normalize order -> apply mode -> vehicle filter -> distance/radius filter -> route check -> provider permission check -> official accept API -> status/audit log -> rider notification.
