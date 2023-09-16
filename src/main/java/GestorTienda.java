import java.util.ArrayList;

public class GestorTienda {
    private Tienda tienda;

    public void registrarCliente(Cliente cliente) {
        Cliente cliente1 = buscarCliente(cliente.getNombre(), cliente.getApellido());
        if(cliente1 == null){
            tienda.getClientes().add(cliente1);
            System.out.println("El cliente ya ha sido agregado.");
        }
        else{
            System.out.println("El cliente ya esta registrado.");
        }
    }

    public void buscarDispositivoPorMarca(String marca) {
        for (DispositivoTecnologico dispositivoTecnologico : tienda.getDispositivosTecnologicos()){
            if(dispositivoTecnologico.getMarca().equals(marca)){
                System.out.println(dispositivoTecnologico.toString());
            }
        }
    }

    public void buscarDispositivoPorModelo(String modelo) {
        for (DispositivoTecnologico dispositivoTecnologico : tienda.getDispositivosTecnologicos()){
            if(dispositivoTecnologico.getModelo().equals(modelo)){
                System.out.println(dispositivoTecnologico.toString());
            }
        }
    }

    public void buscarTipoDispositivo(String tipo) {
        for (DispositivoTecnologico dispositivoTecnologico : tienda.getDispositivosTecnologicos()){
            if(dispositivoTecnologico.getTipo().equals(tipo)){
                System.out.println(dispositivoTecnologico.toString());
            }
        }
    }

    public Cliente buscarCliente(String nombre, String apellido) {
        for(Cliente cliente : tienda.getClientes()){
            if(cliente.getNombre().equals(nombre) && cliente.getApellido().equals(apellido)){
                return cliente;
            }
        }
        return null;
    }

    public void mostrarEspecificacionDispositivo(DispositivoTecnologico dispositivoTecnologico){
        for (DispositivoTecnologico dispositivoTecnologico1 : tienda.getDispositivosTecnologicos()){
            System.out.println(dispositivoTecnologico1.toString());
        }
    }

    public void compra(Cliente cliente, ArrayList<DispositivoTecnologico> listaDispositivo, String fecha) {
        Cliente cliente1 = buscarCliente(cliente.getNombre(),cliente.getApellido());
        if(cliente != null){
            System.out.println(cliente1.getNombre()+" "+cliente1.getApellido());
            for (DispositivoTecnologico dispositivoTecnologico : listaDispositivo){
                System.out.println(dispositivoTecnologico.toString());
                for (DispositivoTecnologico dispositivoTecnologico1 : tienda.getDispositivosTecnologicos()){
                    if(dispositivoTecnologico.getModelo().equals(dispositivoTecnologico1.getModelo())){
                        dispositivoTecnologico1.setCantidadStock(dispositivoTecnologico1.getCantidadStock()-1);
                    }
                }
            }
            System.out.println(fecha);

        }
        else{
            System.out.println("El cliente no esta registrado.");
        }
    }
}