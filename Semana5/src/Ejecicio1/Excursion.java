package Ejecicio1;

import javax.swing.*;

public class Excursion {



    public String registroExcursion (String registro){
        if(registro == "Montaña"){
            return "SE HA REGISTRADO A LA EXCURSION DE MONTAÑA \nLA HORA DE SALIDA ES A LAS 8:00AM";
        }else if (registro == "Kayak"){
            return "\"SE HA REGISTRADO A LA EXCURSION DE KAYAK \nLA HORA DE SALIDA ES A LAS 2:00PM";
        }else if(registro == "Cabalgata"){
            return "\"SE HA REGISTRADO A LA EXCURSION EN CABALFGATA \nLA HORA DE SALIDA ES A LAS 7:00AM";
        }else{
            return "EL REGISTRO ES INVALIDO.";
        }
    }



    public void tipoDeExcursion(){
        JOptionPane.showMessageDialog(null, "LOS TIPOS DE EXCURSIONES SON: " +
                "\nMONTAÑA A LAS 8:00AM" +
                "\nKAYAK A LAS 2:00PM" +
                "\nCABALGATA A LAS 7:00AM");

    }



}
