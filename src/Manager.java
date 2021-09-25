import java.util.List;

public class Manager {
    private List<Material> materialsList;

    public Manager() {
    }

    public List<Material> getMaterialsList() {
        return materialsList;
    }

    public void setMaterialsList(List<Material> materialsList) {
        this.materialsList = materialsList;
    }

    public void addMaterials(Material material) {
        materialsList.add(material);
    }
    public void removeMaterials(Material material) {
    materialsList.remove(material);
    }

    public void display() {
        for (Material x : materialsList ) {
            System.out.println(x.toString());
        }
    }
}
