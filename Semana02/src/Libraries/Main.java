package Libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // String nombreDeMicrofono = "AT2020";
        //String microfono2 = "Blue Yeti";

        //if (microfono2 == "Blue Yeti" )
        //{
           // System.out.println("Este mricofono sirve para poadcoast");
        //}
        //OPERADORES REALACIONALES

        //Integer prueba = 15;

        //if (prueba  > 10 )
        //{
           // System.out.println("El número es mayor a 15");
       // }



       /* PEDIR UN NPUMERO CON JOptionPane
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        if (nota >= 80){
            JOptionPane.showMessageDialog(null, "El estudiante Aprobo");
        } else {
            JOptionPane.showMessageDialog(null,"El estudiante no Aprobo");
        } */



        /* SAT, 800 Medicina Informatica Enfermeria sino Tecnicas
        int SAT;
        SAT = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su nota"));
        if (SAT >= 800){
            JOptionPane.showMessageDialog(null, "Puede elegir las materias de Medicna, Informática o Enfermería");
        } else {
            JOptionPane.showMessageDialog(null,"Puede elegir un Ténico");
        }*/



        /* COMPUERTAS LÓGICAS or ||, and &&, != diferente
        int numero = 25;
        int elSegundoNumero = 31;
        if (numero == 25 && elSegundoNumero ==30){
            System.out.println("los numeros son iguales"); */



        /* INDIQUE SU EDAD Y SI PUEDE O NO VOTAR
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad"));
        if (edad >= 18){
            JOptionPane.showMessageDialog(null, "Usted puede Votar");
        } else {
            JOptionPane.showMessageDialog(null,"Usted no puede votar");

        }*/


        /* INDIQUE LAS PROVINCIAS
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número que desea para saber la provincia"));
        if (num == 1){
            JOptionPane.showMessageDialog(null, "La Provincia es San José");
        }else if (num== 2){
            JOptionPane.showMessageDialog(null, "La Provincia es Alajuela");
        }else if (num== 3){
            JOptionPane.showMessageDialog(null, "La Provincia es Cartago");
        }else if (num== 4){
            JOptionPane.showMessageDialog(null, "La Provincia es Heredia");
        }else if (num== 5){
            JOptionPane.showMessageDialog(null, "La Provincia es Guanacaste");
        }else if (num== 6){
            JOptionPane.showMessageDialog(null, "La Provincia es Puntarenas");
        }else if (num== 7){
            JOptionPane.showMessageDialog(null, "La Provincia es Limón");
        }*/

        /* MOD EN JAVA
        int casa;
        casa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Casa"));
        if (casa % 2 == 0){
            System.out.println("Su casa es la numero" + casa + "Y los impuestos se pagan trimestralmente");
        } else {
            System.out.println("Los impuestos se pagan semetralmente");
        }*/


        /* DÍAS LABORALES
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número para saber si el día es laboral o libre"));
        if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5){
            JOptionPane.showMessageDialog(null, "El día es laboral");
        }else if (num == 6 || num == 7){
            JOptionPane.showMessageDialog(null, "El día es libre");
        }else{
            JOptionPane.showMessageDialog(null, "No existe ese número");
        }*/

        /* EJEMPLO DE SWITCH
        int casa;
        casa = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número para saber si el día es laboral o libre"));
        switch (casa) {
        case 0:
            System.out.println("La casa 0");
            break;
        case 1:
            System.out.println("La casa 1");
            break;
        default:
            System.out.println("Por defecto");
         */

        /* CASA DE EMPEÑO*/
        int precio;
        precio = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el precio"));


    }
}
