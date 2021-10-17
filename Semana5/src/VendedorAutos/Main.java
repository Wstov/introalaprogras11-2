package VendedorAutos;

import javax.swing.*;

public class Main {
    Vendedor arre[] ={new Vendedor()};

    public static void main(String[] args) {
        Vendedor ven = new Vendedor(String modelo, int precio,String nombre);


        ven.modelo = JOptionPane.showInputDialog("Escriba el modelo de Auto");
        ven.precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del Auto"));
        String nombre = JOptionPane.showInputDialog("Escriba el modelo de Auto");







    }


}
