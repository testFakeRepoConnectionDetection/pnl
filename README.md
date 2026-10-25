# PNL (fixture)

Profit and loss. Values booked trades with DataHub marks and sends the pack to Finance.

## Integrations (topology)

- Consumes Kafka topic `trade.economics` produced by **Booking**.
- Calls **DataHub** over HTTP for marks (`/api/v1/marks`).
- Posts the P&L pack to **Finance** on `/api/v1/pnl`.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | Channel | data_category |
|------|------|---------|---------------|
| Booking | KAFKA (inbound) | trade.economics | `TRADE_ECONOMICS` |
| DataHub | API | /marks | `MARK_TO_MARKET` |
| Finance | API | /pnl | `PNL_PACK` |

Constants: `fixture.flow.TransitDataTypes`. DTOs: `MarkToMarketRequestDto`, `PnlPackDto`.
