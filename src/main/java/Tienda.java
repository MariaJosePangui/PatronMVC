import java.util.ArrayList;

public class Tienda {
    private String direccion;
    private ArrayList catalogoDispositivos;
    private ArrayList<DispositivoTecnologico> dispositivosTecnologicos;
    private ArrayList<Cliente> clientes;

    public Tienda(String direccion, ArrayList catalogoDispositivos, ArrayList<DispositivoTecnologico> dispositivosTecnologicos, ArrayList<Cliente> clientes) {
        this.direccion = direccion;
        this.catalogoDispositivos = catalogoDispositivos;
        this.dispositivosTecnologicos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList getCatalogoDispositivos() {
        return this.catalogoDispositivos;
    }

    public void setCatalogoDispositivos(ArrayList catalogoDispositivos) {
        this.catalogoDispositivos = catalogoDispositivos;
    }

    public ArrayList<DispositivoTecnologico> getDispositivosTecnologicos() {
        return dispositivosTecnologicos;
    }

    public void setDispositivosTecnologicos(ArrayList<DispositivoTecnologico> dispositivosTecnologicos) {
        this.dispositivosTecnologicos = dispositivosTecnologicos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}