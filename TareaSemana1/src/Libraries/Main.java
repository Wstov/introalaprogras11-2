package Libraries;

//Definimos las librerías que utilizaremos
import javax.swing.JOptionPane;
import java.util.Scanner; //Libreria para utilizar la clase Scanner y hacer una variable de tipo Scanner, para tomar valores desde la consola directamente
                          //Esto solo para la primera parte del ejercicio, puesto que la segunda utiliza los JOptionPane

public class Main {

    public static void main(String[] args) {
	    /*Escriba un programa que lea el nombre del trabajador y su salario semanal
	    Calcule su salario mensual sin deducciones y el salario luego de aplicado un 9.34% siguiente de deducciones.
	    Muestre en pantalla lo:

	    Estimado trabajador <<nombre>>, el salario de este mes se desglosa de la siguiente manera:

	    Salario bruto: 9999999.99
	    Deducciones: 9999999.99
	    Salario neto: 99999999.99
	    */

        //Inicializamos nuetra variable de tipo escáner, esto para tomar los datos de la consola cuando sea necesario
        Scanner tomardato = new Scanner(System.in);

        //Inicializamos variables
        String nombre = ""; //Nombre del trabajador
        double salsem = 0; //Salario semanal
        double salbru = 0; //Salario Bruto
        double ded = 0; //Deducciones
        double salnet = 0; //Salario neto

        //Pedimos al usuario tanto su nombre como su salario semanal
        System.out.println("Digite su nombre: ");
        nombre = tomardato.nextLine(); //El tomardato es para tomar el valor digitado por el usuario en la consola, y el nextLine, le especifica que tome el dato que
                                        //está en la siguiente línea que se le muestra al usuario

        System.out.println("Digite su salario semanal: ");
        salsem = Double.parseDouble(tomardato.nextLine());

        //Realizamos los cálculos necesarios
        salbru = salsem * 4; //Calculamos el salario bruto multiplicando el semanal por 4

        ded = (salbru * 9.34) / 100; //Obtenemos el monto que serán las deducciones, puesto que se debe mostrar en pantalla más adelante

        salnet = salbru - ded; //Calculamos salario neto, restándole las deducciones anteriormente conseguidas, al salario bruto


        //Mostramos en la consola los datos correspondientes
        System.out.println("Estimado trabajador "+nombre+", el salario de este mes se desglosa de la siguiente manera:\n Salario bruto: "+salbru+"\n Deducciones: "+ded+"\n Salario neto: "+salnet);

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\\

        //Problema #2

        //Realizar un programa que pida el nombre, apellido y sueldo, luego de almacenarlos en variables, muestre con
        //JOptionPane lo siguiente "El nombre es , la edad es y el sueldo es " poniendo en la cadena los valores adecuados


        /*
        //Inicializamos las variables
        String nombre = "";
        double salsem = 0; //Salario semanal
        double salbru = 0; //Salario Bruto
        double ded = 0; //Deducciones
        double salnet = 0; //Salario neto

        //Pedimos al usuario mediante un JOptionPane, su nombre y salario semanal
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        salsem = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario semanal"));

        //Realizamos los cálculos necesarios
        salbru = salsem * 4; //Calculamos el salario bruto multiplicando el semanal por 4

        ded = (salbru * 9.34) / 100; //Obtenemos el monto que serán las deducciones, puesto que se debe mostrar en pantalla más adelante

        salnet = salbru - ded; //Calculamos salario neto, restándole las deducciones anteriormente conseguidas, al salario bruto


        //Por último, mostramos en pantalla mediante un JOptionPane, el nombre del empleado y los cálculos obtenidos de su salario
        JOptionPane.showMessageDialog(null, "Estimado trabajador "+nombre+", el salario de este mes se desglosa de la siguiente manera: \n" + "Salario bruto: "+salbru+"\n"+ "Deducciones: "+ded+"\n"+"Salario neto:"+salnet);
        */

    }
}
