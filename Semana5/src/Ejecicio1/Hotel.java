package Ejecicio1;

public class Hotel {

    public String registro(String tipoHabi, String nombre, String id, int cantidad) {
        if (tipoHabi == "Individual") {
            return "AH REGISTRADO UN HABITACION INDIVIDUAL A:" +
                    "\nNOMBRE: " + nombre +
                    "\nID: " + id +
                    "\nCANTIDAD DE PERSONAS: " + cantidad;
        } else if (tipoHabi == "Doble") {
            return "AH REGISTRADO UN HABITACION DOBLE A:" +
                    "\nNOMBRE: " + nombre +
                    "\nID: " + id +
                    "\nCANTIDAD DE PERSONAS: " + cantidad;
        } else if (tipoHabi == "Familiar") {
            return "AH REGISTRADO UN HABITACION DOBLE A:" +
                    "\nNOMBRE: " + nombre +
                    "\nID: " + id +
                    "\nCANTIDAD DE PERSONAS: " + cantidad;
        }else{
            return "LOS DATOS INGRESADOS SON INCORRECTOS";
        }
    }


}
