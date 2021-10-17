//Venta de Ticketes

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        int opcion, precio=100,cantidad=0,resultado;
        boolean on = true;
        String nombre;




        while(on==true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion:" +
                    "\n1- Precios de Tickets \n2- Cantidad de Tickets \n3- Digite su nombre\n4- Salir "));

            if (opcion==4){
                on = false;
            }
            else if(opcion == 1){
                JOptionPane.showMessageDialog(null,"El precio por Ticket es de $100:");

            }
            else if(opcion==2){
                cantidad=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que desea llevar:"));
            }
            else if(opcion==3){
                nombre = JOptionPane.showInputDialog("Digite su nombre:");
                resultado=cantidad*precio;
                JOptionPane.showMessageDialog(null,"El resultado es:" +
                        "\nNombre: "+nombre+"\nEl valor es: $"+resultado);

            }



        }
    }



}
/*
[13:24] MOYA CARPIO JOHN GARY
    int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion"));
do {​​​
    if (opcion == 1){​​​
        System.out.println("Eligio la opcion 1");
// JOptionPane
}​​​ else if(opcion == 2){​​​
        System.out.println("Eligio la opcion 2");
}​​​ else if (opcion == 3){​​​
        System.out.println("Eligio la opcion 3");
}​​​
}​​​ while (opcion != 4);
​[13:24] MOYA CARPIO JOHN GARY
    1 precio
 */