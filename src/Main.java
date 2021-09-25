import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        Material crispyFlour1 = new CrispyFlour("6","f",LocalDate.of(2021,6,10),100,5);
        Material crispyFlour2 = new CrispyFlour("6","f",LocalDate.of(2021,9,10),100,5);
        Material crispyFlour3 = new CrispyFlour("6","f",LocalDate.of(2021,12,10),100,5);
        Material crispyFlour4 = new CrispyFlour("6","f",LocalDate.of(2021,5,10),100,5);
        Material crispyFlour5 = new CrispyFlour("6","f",LocalDate.of(2021,3,10),100,5);

        Material meat1 = new Meat("1","a", LocalDate.of(2021,9,23),100,5);
        Material meat2 = new Meat("2","a", LocalDate.of(2021,9,20),100,5);
        Material meat3 = new Meat("3","a", LocalDate.of(2021,9,25),100,5);
        Material meat4 = new Meat("4","a", LocalDate.of(2021,9,27),100,5);
        Material meat5 = new Meat("5","a", LocalDate.of(2021,9,21),100,5);
        List<Material> materialList = new ArrayList<>();

        materialList.add(crispyFlour1);
        materialList.add(crispyFlour2);
        materialList.add(crispyFlour3);
        materialList.add(crispyFlour4);
        materialList.add(crispyFlour5);

        materialList.add(meat1);
        materialList.add(meat2);
        materialList.add(meat3);
        materialList.add(meat4);
        materialList.add(meat5);

        manager.setMaterialsList(materialList);

        manager.display();
    }
}
