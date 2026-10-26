# PNL (fixture)

Business function: `MIDDLE_OFFICE` (`app.business_function`).
Pillar: `Booking & PNL & REG` (`app.pillar`).

Profit and loss. Receives marks from DataHub and sends the pack to Finance.

## Integrations (topology)

- Exposes `/api/v1/marks` called by **DataHub**.
- Posts the P&L pack to **Finance** on `/api/v1/pnl`.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | direction | Channel | data_category |
|------|------|-----------|---------|---------------|
| DataHub | API | inbound | /marks | `MARK_TO_MARKET` |
| Finance | API | outbound | /pnl | `PNL_PACK` |

Constants: `fixture.flow.TransitDataTypes`. DTO: `PnlPackDto`.
