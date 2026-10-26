package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Two inbound flows from DataHub: cashflow and PV, both daily.
 *
 * <p>Edge fields data and frequency.
 */
@RestController
@RequestMapping("/api/v1/cashflows")
public class IntegrationHints {

  // POST /api/v1/cashflows from DataHub — data cashflow, frequency daily
  // POST /api/v1/pv from DataHub — data PV, frequency daily
}
