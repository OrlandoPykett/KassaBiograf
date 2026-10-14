public final class Money implements Comparable<Money> {
  private final long ore; // amount in minor units (öre for SEK)
  private final Currency currency;

  private Money(long minorUnits, Currency currency) { ... }

  // Factories: two ways to create, both end up as öre
  public static Money ofOre(long ore) {

  } // SEK

  public static Money ofKronor(long kronor, long ore) // ofKronor(125, 50) -> 12550

  public static Money of(long minorUnits, Currency c)

  public static Money zero(Currency c)

    // Arithmetic (all return new Money, all check same currency)
  public Money add(Money other)        // use Math.addExact

  public Money subtract(Money other)

  public Money multiply(int quantity)  // 3 tickets x price

  public Money percentage(int percent) // rounds HALF_UP to whole öre

  public Money negate()

    // Queries
  public long getOre()                 // or getMinorUnits()

  public long wholeKronor()            // ore / 100

  public long remainderOre()           // ore % 100

  public boolean isZero();

  public boolean isNegative();

  // toString -> "125,50 kr"
}
