# PNL (fixture)

Business function: `MIDDLE_OFFICE` (`app.business_function`).
Pillar: `Booking & PNL & REG` (`app.pillar`).

Profit and loss.

## Integrations (topology)

- Exposes `/api/v1/cashflows` called by **DataHub**.
- Exposes `/api/v1/pv` called by **DataHub**.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data | frequency |
|------|-----------|------|---------|------|-----------|
| DataHub | inbound | API | /api/v1/cashflows | `cashflow` | `daily` |
| DataHub | inbound | API | /api/v1/pv | `PV` | `daily` |

See `TransitDataTypes.java` and `application.yml` (`data`, `frequency`).
