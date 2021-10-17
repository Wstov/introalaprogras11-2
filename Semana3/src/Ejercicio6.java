import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int valor, sumador=1;


        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor: "));

        for(int i=0; i<valor+1;i++){
            if(sumador<=valor){
                for(int j=0;j<sumador;j++) {
                    System.out.print("*");
                }
                sumador++;
            }
            System.out.println();

        }

    }

}
