public final class Currency {
  private final String code; // "SEK"
  private final String symbol; // "kr"
  private final String minorName; // "öre"
  private final int minorPerMajor; // 100 öre per krona

  public static final Currency SEK = new Currency("SEK", "kr", "öre", 100);
  public static final Currency EUR = new Currency("EUR", "€", "cent", 100);

  // constructor, getters, equals/hashCode on code
}
