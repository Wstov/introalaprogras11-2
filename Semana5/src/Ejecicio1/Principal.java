package Ejecicio1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Hotel ho = new Hotel();
        JOptionPane.showMessageDialog(null,ho.registro("Doble","Carlos","16853185321",2));


        Restaurante res = new Restaurante();
        JOptionPane.showMessageDialog(null,res.abreRestaurante("10:00am"));
        JOptionPane.showMessageDialog(null,res.registroEntrada("Carlos"));
        JOptionPane.showMessageDialog(null,res.cantidadPlaillosVnetidos(40));

        Excursion excu = new Excursion();

        excu.tipoDeExcursion();
        JOptionPane.showMessageDialog(null,excu.registroExcursion("Montaña"));


    }


}
