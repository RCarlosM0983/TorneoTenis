/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneotenis;

import Controles.Conexion;
import Controles.JugadorData;
import Modelos.Jugador;
import java.time.LocalDate;

/**
 *
 * @author carlo_000
 */
public class TorneoTenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion c = new Conexion();
        JugadorData jd = new JugadorData(c);
        Jugador j = new Jugador("juan gonz", 35642310, LocalDate.of(1983, 8, 9), 1.8, 78.5, "polvo ladrillo", 
                "derecho", true);
        jd.guardarJugador(j);
    }
    
}
