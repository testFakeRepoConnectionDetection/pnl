package fixture.dto;

/**
 * Mark request sent to DataHub when valuing a book.
 * flow data_category: MARK_TO_MARKET
 */
public record MarkToMarketRequestDto(String book, String instrumentId, String asOfDate) {}
