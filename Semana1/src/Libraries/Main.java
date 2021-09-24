package Libraries;

import javax.swing.JOptionPane;


public class Main {


    public static void main(String[] args){
        /*
        //Clase es un conjunto de código
        //Variable espacio de memoria RAM en la cual se guarda un dato
        //EF243555F Hola
        //String
        String saludo = "Saludo"; //String nombre;
        //Integer edad = 25;
        Float temperatura = 25.09F;
        Double salario = 25.000;
        Boolean verdadero = false;

        int edad2 = 26;
        float celsius = 26.04F;
        double salarioNeto = 25.000;
        boolean falso = false;
        char initial = 'a';

        String apellido; //Variable no asignada, instanciada

        //System.out.println("Hola mundo, soy un programa de Java");

        //String nombre // int edad// string direccion
        // sout lo de atrás

        String nombre = "Alex Amaya";
        Integer edad = 19;
        String direccion = "San Juan de Dios, Desamparados, San José";

        System.out.println("Hola, mi nombre es "+nombre+" , tengo "+edad+" años, y mi dirección es: "+direccion);
        */

        /*
        String nombre = "";
        String direccion = "";
        int edad = 0;
        float salario = 0;

        nombre = JOptionPane.showInputDialog("Digite su nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad:"));
        direccion = JOptionPane.showInputDialog("Digite su direcciòn:");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite su salario: "));

        JOptionPane.showMessageDialog(null,"El nombre de la persona es: "+nombre+", la persona tiene "+edad+" años, vive en: "+direccion+" y su sueldo es de: "+salario);
        */

//--------------------------------------------------------------------------------------------------------------------------------------


        //***Ejercicio 1***
        /* Escriba un programa que calcule la suma y el promedio de cuatro números de tipo int
        Muestre los resultados.  Usted le asigna los valores a las variables.

        int a = 2;
        int b = 4;
        int c = 9;
        int d = 14;

        int suma = 0;
        int promedio = 0;

        promedio = (a + b + c + d) / 4;


        suma = a + b + c + d;

        JOptionPane.showMessageDialog(null, "La suma de los números es: "+suma+" y el promedio de los mismos es: "+promedio);


//--------------------------------------------------------------------------------------------------------------------------------------

        //***Ejercicio 2***

        int w, x, y, z = 0;
        int suma = 0;
        int promedio = 0;

        w = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor"));
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer valor"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite el cuarto valor"));


        promedio = (w + x + y + z) / 4 ;


        suma = w + x + y + z;

        JOptionPane.showMessageDialog(null, "La suma de los números es: "+suma+" y el promedio de los mismos es: "+promedio);
        */

//--------------------------------------------------------------------------------------------------------------------------------------


        /* Escriba un programa que lea el nombre de una persona y la salude.
        * */

        String nombre = "";
        nombre = JOptionPane.showInputDialog("Digite su nombre:");
        JOptionPane.showMessageDialog(null, "Hola "+nombre+", ¿Como estás?");

    }




}
