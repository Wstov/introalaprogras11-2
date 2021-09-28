package Libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	/*EJERCICIO NÚMERO 1
	Escriba un programa que lea el nombre del
    trabajador y su salario semanal. Calcule su
    salario mensual sin deducciones y el salario
    luego de aplicado un 9.34% siguiente de deducciones.


        String nom = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        int salario = Integer.parseInt( JOptionPane.showInputDialog(null,"Ingrese su salario"));

        double deduccion = (salario * 0.09) ;
        double neto = (salario - deduccion);


        JOptionPane.showMessageDialog(null, "Estimado tarbajador " + nom + ", el salario del siguiente mes se desglosa acontinuación: " +
                "  \n 1. Salario bruto: " + salario +
                "  \n 2. Deducciones: "+ deduccion +
                "  \n 3. Salario neto: " + neto +" " ); */


    /* EJERCICIO NÚMERO 2
    Realizar un programa que pida el nombre, apellido y sueldo,
    luego de almacenarlos en variables, muestre con JOptionPane
    lo siguiente "El nombre es , la edad es y el sueldo es "
    poniendo en la cadena los valores adecuados */

        String nom;
        int edad;
        int sueldo;

        nom = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        edad = Integer.parseInt( JOptionPane.showInputDialog(null,"Ingrese su edad"));
        sueldo = Integer.parseInt( JOptionPane.showInputDialog(null,"Ingrese su sueldo"));

        JOptionPane.showMessageDialog(null, "\n  Su nombre es : " + nom + "\n  Su edad es de : " + edad +" años \n  Su salario es de : " + sueldo +" colones");




    }
}
