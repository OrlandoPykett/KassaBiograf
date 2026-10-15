// public interface Payment {
//   Money amountToPay(Money total);

//   Money change(Money total);
// }

// public class CardPayment implements Payment {
//   public Money amountToPay(Money total) {
//     return total;
//   } // exact öre

//   public Money change(Money total) {
//     return Money.zero(total.getCurrency());
//   }
// }

// public class CashPayment implements Payment {
//   private final Money tendered;

//   public Money amountToPay(Money total) {
//     return total.roundToWholeKronor();
//   }

//   public Money change(Money total) {
//     Money due = amountToPay(total);
//     if (tendered.compareTo(due) < 0)
//       throw new IllegalArgumentException("Not enough cash");
//     return tendered.subtract(due);
//   }
// }
