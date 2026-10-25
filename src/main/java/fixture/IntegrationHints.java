package fixture;

import org.springframework.kafka.annotation.KafkaListener;

/**
 * P&L engine. Consumes Booking economics, marks them with DataHub, sends the pack to Finance.
 *
 * <p>data_category: TRADE_ECONOMICS (Kafka inbound), MARK_TO_MARKET (HTTP outbound),
 * PNL_PACK (HTTP outbound).
 */
public class IntegrationHints {

  /** data_category TRADE_ECONOMICS — produced by Booking */
  @KafkaListener(topics = "trade.economics", groupId = "pnl-engine")
  public void onTradeEconomics(String payload) {}

  // HTTP POST datahub /api/v1/marks — data_category MARK_TO_MARKET (fixture.dto.MarkToMarketRequestDto)
  // HTTP POST finance /api/v1/pnl — data_category PNL_PACK (fixture.dto.PnlPackDto)
}
