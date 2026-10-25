package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * P&L engine. Receives marks from DataHub and sends the pack to Finance.
 *
 * <p>data_category: MARK_TO_MARKET (HTTP inbound), PNL_PACK (HTTP outbound).
 */
@RestController
@RequestMapping("/api/v1/marks")
public class IntegrationHints {

  // POST /api/v1/marks from DataHub — data_category MARK_TO_MARKET
  // HTTP POST finance /api/v1/pnl — data_category PNL_PACK (fixture.dto.PnlPackDto)
}
