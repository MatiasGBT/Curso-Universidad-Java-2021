
package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversiones {
    /*
    La finalidad de esta clase es convertir un tipo Date a un String para manipular las
    fechas a manipular en nuestro reporte de Excel.
    */
    private static final String FORMATO_FECHA="dd-MM";
    
    public static String formato(Date fecha) {
        SimpleDateFormat formateador=new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
    
    public static String formato(String fecha) {
        SimpleDateFormat formateador=new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha); //el metodo format tambien puede recibir un objeto, no solo un Date.
    }
}
