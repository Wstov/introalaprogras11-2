package Ejecicio1;

public class Restaurante{
    String empleados;
    String patillos;
    String clientes;

    //METODO 1
    public String abreRestaurante(String hora){
        if(hora=="10:00am"){
            return"EL RESTAURANTE ABRIO";

        }else {
            return"EEL RESTAURANTE ESTA CERRADO";

        }
    }

    //METODO 2
    public String registroEntrada(String entrada){
        if (entrada=="Luis" || entrada == "Maria" || entrada == "Carlos"){
           return "HA REGISTRADO SU ENTRADA";
        }else {
            return "EL NOMBRE REGISTRDO ES INCORRECTO";
        }
    }

    //METODO 3
    public String cantidadPlaillosVnetidos(int cantidad){
        return "LA CANTIDAD DE PLATILLOS VENDIDOS FUE "+cantidad;
    }





}
