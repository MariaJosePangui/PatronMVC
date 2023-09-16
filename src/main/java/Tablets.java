public class Tablets extends DispositivoTecnologico {
    private String resolucionPantalla;
    private String accesorios;

    public Tablets(String marca, String memoriaRAM, String memoriaAlmacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int cantidadStock, String resolucionPantalla, String accesorios) {
        super(marca, memoriaRAM, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
        this.resolucionPantalla = resolucionPantalla;
        this.accesorios = accesorios;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public String getTipo(){
        return "Tablet";
    }

    public String toString(){
        return "Tipo: "+getTipo()+"\nMarca: "+getMarca()+"\nMemoria RAM: "+getMemoriaRAM()+"\nMemoria de Almacenamiento: "+getMemoriaAlmacenamiento()+"\nProcesador: "+getProcesador()+"\nModelo: "+getModelo()+"\nAño de Fabricacion"+getAnioFabricacion()+"\nPrecio: "+getPrecio()+"\nCantidad en Stock: "+getCantidadStock()+"\nResolución de pantalla: "+getResolucionPantalla()+"\nLista de accesorios: "+getAccesorios();
    }
}