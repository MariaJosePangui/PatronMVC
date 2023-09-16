import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args){
        iniciar();
    }

    private static void iniciar() {

        Tienda tienda;
        GestorTienda gestorTienda;
        Cliente cliente = new Cliente("Erika","Opazo","erika.opazo@gmail.com","+56945187615","Soltera","Temuco");        Pantalla pantalla = new Pantalla("Lenovo","modelo1",2022);
        System.out.println(cliente.toString());


        Tablets tablet = new Tablets("Lenovo", "4GB", "64GB", "ARM Cortex-A53", "modelo 2",  2022, 75990, 5, "1280x800", "lapiz");
        Notebooks notebook = new Notebooks("Lenovo", "8GB", "512GB", "Intel Core i5", "modelo 1", 2022, 999990, 10, "1920x1080", "Teclado qwerty", 5000);
        Computador computador = new Computador("Lenovo","16GB","220GB","procesador1","modelo 2",2020,250000,45,"tarjeta1","poder1","chasis1",pantalla);
        pantalla = new Pantalla("Lenovo", "modelo 1", 2022);


        String archivo = "DispositovosTecnologicos.txt";

        try {

            FileWriter fileWriter = new FileWriter(archivo, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            bufferedWriter.write(tablet.toString());
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write(notebook.toString());
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write(computador.toString());
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write(pantalla.toString());

            bufferedWriter.close();

            System.out.println("Mostrar Dispositivos Tecnologicos en txt");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
