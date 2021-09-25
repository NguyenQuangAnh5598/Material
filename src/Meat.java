import java.time.LocalDate;

public class Meat extends Material implements Discount {
   private double weight;

   public Meat() {
   }

   public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
      super(id, name, manufacturingDate, cost);
      this.weight = weight;
   }

   @Override
   public String toString() {
      return "Meat { " +
              super.toString() +
              " weight = " + weight +
              " RealMoney " + getRealMoney() +
              " Difference =" + getDifference() +
              " }";
   }

   @Override
   public double getAmount() {
      return getCost()* weight;
   }

   @Override
   public LocalDate getExpiryDate() {
      return getManufacturingDate().plusDays(7);
   }

   @Override
   public double getRealMoney() {
       LocalDate now = LocalDate.now();
      if(getExpiryDate().equals(now.plusDays(3)) ||   getExpiryDate().isBefore(now.plusDays(3))) {
      return getAmount()/2;
      }
      else if (getExpiryDate().equals(now.plusDays(5)) || getExpiryDate().isBefore(now.plusDays(5))) {
         return getAmount()*7/10;
      }
      else {
         return getAmount()*9/10;
      }
   }

}
