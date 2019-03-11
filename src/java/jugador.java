/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frano
 */
public class jugador {
    private int turnoGanado;
    
    public jugador(){
    }

    public int getTurnoGanado() {
        return turnoGanado;
    }

    public void setTurnoGanado(int turnoGanado) {
        this.turnoGanado = turnoGanado;
    }
    
    public void aumentaPuntajeGanado(){
    turnoGanado++;
    }
    
    
    
}
