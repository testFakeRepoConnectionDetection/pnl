package fixture.flow;

/**
 * Edge attributes on PNL flows.
 * grep: data frequency cashflow PV daily
 */
public final class TransitDataTypes {

  /** Node attribute business_function for PNL. */
  public static final String BUSINESS_FUNCTION = "MIDDLE_OFFICE";

  /** Node attribute pillar for PNL. */
  public static final String PILLAR = "Booking & PNL & REG";

  public static final String DATA_CASHFLOW = "cashflow";
  public static final String DATA_PV = "PV";
  public static final String FREQUENCY_DAILY = "daily";

  private TransitDataTypes() {}
}
