package fixture.dto;

/**
 * P&L pack posted to Finance.
 * flow data_category: PNL_PACK
 */
public record PnlPackDto(String book, String asOfDate, String pnlAmount, String currency) {}
