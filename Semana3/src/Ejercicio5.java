import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int tabla,multi;
        tabla = Integer.parseInt(JOptionPane.showInputDialog("Digite la tabla: "));

        for(int i=0; i<11;i++){
            multi = tabla*i;
            System.out.println(tabla+"x"+i+" = "+multi);
        }
    }

}
