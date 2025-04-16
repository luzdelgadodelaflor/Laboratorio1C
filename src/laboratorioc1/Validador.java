/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioc1;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Validador {
    
    public boolean validarTexto(String texto) {
        if (texto == null || texto.trim().isEmpty())
        {
            return false;
        }

        for (char c : texto.toCharArray()) {
            if (!Character.isLetter(c) && !Character.isWhitespace(c))
            {    
                return false;
            }
        }
        return true;
    }

    public boolean validarEntero(int numero) {
        return numero >= 0;
    }

    public boolean validarFecha(Date fecha) {
        if (fecha == null) 
                return false;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String hoyStr = formato.format(new Date());
        String fechaStr = formato.format(fecha);

        return hoyStr.equals(fechaStr);
    }
}
