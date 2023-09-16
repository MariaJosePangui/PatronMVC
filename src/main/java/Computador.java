public class Computador extends DispositivoTecnologico {
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantalla;

    public Computador(String marca, String memoriaRAM, String memoriaAlmacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int cantidadStock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
        super(marca, memoriaRAM, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    public String getTarjetaVideo() {
        return this.tarjetaVideo;
    }

    public void setTarjetaVideo(String tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public String getFuentePoder() {
        return this.fuentePoder;
    }

    public void setFuentePoder(String fuentePoder) {
        this.fuentePoder = fuentePoder;
    }

    public String getChasis() {
        return this.chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getTipo(){
        return "Computador";
    }

    public String toString(){
        return "Tipo: "+getTipo()+"\nMarca: "+getMarca()+"\nMemoria RAM: "+getMemoriaRAM()+"\nMemoria de Almacenamiento: "+getMemoriaAlmacenamiento()+"\nProcesador: "+getProcesador()+"\nModelo: "+getModelo()+"\nAño de Fabricacion"+getAnioFabricacion()+"\nPrecio: "+getPrecio()+"\nCantidad en Stock: "+getCantidadStock()+"\nTarjeta de Video: "+getTarjetaVideo()+"\nFuente de Poder: "+getFuentePoder()+"\nChasis: "+getChasis();
    }
}