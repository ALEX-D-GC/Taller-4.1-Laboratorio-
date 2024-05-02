package packageAutomotor;

public class Fabricante {

    private String nombrefabricante;
    private String ciudadorigen;

    public Fabricante() {
    }

    public Fabricante(String nombrefabricante, String ciudadorigen) {
        this.nombrefabricante = nombrefabricante;
        this.ciudadorigen = ciudadorigen;
    }

    public String getNombrefabricante() {
        return nombrefabricante;
    }

    public void setNombrefabricante(String nombrefabricante) {
        this.nombrefabricante = nombrefabricante;
    }

    public String getCiudadorigen() {
        return ciudadorigen;
    }

    public void setCiudadorigen(String ciudadorigen) {
        this.ciudadorigen = ciudadorigen;
    }

    @Override
    public String toString() {
        return String.format("""
                             
                              Fabricante: %s
                              Ciudad de Origen: %s""",
                this.getNombrefabricante(), this.getCiudadorigen());
    }
}
