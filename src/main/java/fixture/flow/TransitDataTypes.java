package fixture.flow;

/**
 * Data categories on PNL flows.
 * grep: data_category TRADE_ECONOMICS MARK_TO_MARKET PNL_PACK
 */
public final class TransitDataTypes {

  public static final String KAFKA_TRADE_ECONOMICS = "TRADE_ECONOMICS";
  public static final String HTTP_MARK_TO_MARKET = "MARK_TO_MARKET";
  public static final String HTTP_PNL_PACK = "PNL_PACK";

  public static final String KAFKA_PAYLOAD_FORMAT = "AVRO";
  public static final String HTTP_PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
