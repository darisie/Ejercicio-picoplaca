/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca;

import picoplaca.Metodos;
/**
 *
 * @author dsierra
 */
public class PicoPlaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Metodos pico=new Metodos();
        //pico.compararHora("07:00", "09:30", "10:30");
        
        //Aqui se debe ingresar un numero de placa cualquiera, la fecha del dia que se corra el programa
        //ya que por el momento el programa solo puede detectar el "Pico y placa" del la fecha actual,
        //y por ultimo se puede ingresar cualquier hora del día
        pico.picoHoy("LBA2186", "20/08/2018", "17:00");
    }
    
}
