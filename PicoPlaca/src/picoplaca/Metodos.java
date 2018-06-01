/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author dsierra
 */
public class Metodos {
    
    Date fecha=new Date();
    Calendar semana=Calendar.getInstance();
 

    /**
     * Metodo para comparar los digitos de las placas con los dias de lunes a viernes
     * @param digito
     * @return 
     */
    public boolean compararDigito(String digito){
        
        DateFormat formato = new SimpleDateFormat("u");
        String diaHoy= formato.format(fecha);
//        int diaIngresado=semana.get(Calendar.DAY_OF_WEEK);
//        String diaSemana= formato.format(diaIngresado);
        String dia="";
        
        switch (digito) {
        case "1":
            dia="1";
        break;
        case "2":
            dia="1";
        break;
        case "3":
            dia="2";
        break;
         case "4":
            dia="2";
        break;
        case "5":
            dia="3";
        break;
        case "6":
            dia="3";
        break;
         case "7":
            dia="4";
        break;
        case "8":
            dia="4";
        break;
        case "9":
            dia="5";
        break;
         case "0":
            dia="5";
        break;
       
        default:
        break;

        }
                
        if(diaHoy.equals(dia)){
            return true;
        }else{
            return false;
        }

//            if(diaSemana.equals(dia)){
//                        return true;
//                    }else{
//                        return false;
//                    }
//
      }
   
/**
 * Metodo para comparar la hora que se quiere salir a conducir
 * @param horaInicio
 * @param horaFin
 * @param horaIngresada
 * @return 
 */
    public boolean compararHora(String horaInicio, String horaFin,String horaIngresada){
            LocalTime inicioPicoPlaca = LocalTime.parse(horaInicio);
            LocalTime finPicoPlaca = LocalTime.parse(horaFin);
            LocalTime horaIngreso  = LocalTime.parse(horaIngresada);

            int minutesInicio = (int) ChronoUnit.MINUTES.between(inicioPicoPlaca, horaIngreso);
            int minutesFin = (int) ChronoUnit.MINUTES.between(finPicoPlaca, horaIngreso);
           // System.out.println("Minutos inicio "+minutesInicio);
           // System.out.println("Minutos fin "+minutesFin);
       
          
            
            if (minutesInicio >= 0 && minutesFin <= 0) {
                return true;
            }else{
                return false;
            }           
    }


    /**
     * 
     * @param placa
     * @param fecha
     * @param hora 
     */
    public void picoHoy(String placa,String fecha, String hora){
        String digito=placa.substring(placa.length()-1,placa.length());
        
        Date d=new Date();
        DateFormat formato = new SimpleDateFormat("a");
        String jornada= formato.format(d);
        
        if(jornada.equals("AM")){
            if(compararDigito(digito) && compararHora("07:00", "09:30", hora)){
                System.out.println("NO puede salir, tiene pico y placa ");
            }else{
                System.out.println("SI puede salir, NO tiene pico y placa");
            }
        }else{
            if(compararDigito(digito) && compararHora("16:00", "19:30", hora)){
                System.out.println("NO puede salir, tiene pico y placa");
            }else{
                System.out.println("SI puede salir, NO tiene pico y placa");
            }
        }
    }
    
}
