import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
   private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
       return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        if(getExpiryDate().equals(now.plusMonths(2)) ||   getExpiryDate().isBefore(now.plusMonths(2))) {
            return getAmount()/10*6;
        }
        else if (getExpiryDate().equals(now.plusMonths(4)) || getExpiryDate().isBefore(now.plusMonths(4))) {
            return getAmount()*8/10;
        }
        else {
            return getAmount()*9.5/10;
        }
    }

    @Override
    public String toString() {
        return "CrispyFlour { " +
                super.toString() +
                " Real money = " + getRealMoney() +
                " quantity =" + quantity +
                " Difference =" + getDifference() +
                " }";
    }


}
