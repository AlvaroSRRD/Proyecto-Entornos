package Trabajo;

import java.util.Scanner;

public class CSGOvsVALORANT {

    public static void main(String[] args) {
       
    	System.out.println("Bienvenido al portal del friki");
    	System.out.println("Hace poco se han jugado torneos de Valorant y CSGO");
    	System.out.println("Estos son los ganadores");
    	System.out.println("--------------------------");
    	
    	VALORANT equipoValorant = new VALORANT(null);
        
        equipoValorant.establecerNombreEquipo();
        equipoValorant.inicializarJugadores();

        System.out.println("Para el videojuego Valorant esto son los datos");
        System.out.println("Nombre del equipo: " + equipoValorant.getEquipo());
        System.out.println("Nombres de los jugadores:");
        for (Object jugador : equipoValorant.getNombre()) {
            System.out.println(jugador);
        }
        
    	System.out.println("--------------------------");

        CSGO equipoCSGO = new CSGO(null);
        
        equipoCSGO.establecerNombreEquipo();
        equipoCSGO.inicializarJugadores();

        System.out.println("Para el videojuego CSGO esto son los datos");
        System.out.println("Nombre del equipo: " + equipoCSGO.getEquipo());
        System.out.println("Nombres de los jugadores:");
        for (Object jugador : equipoCSGO.getNombre()) {
            System.out.println(jugador);
        }
    }

    }

