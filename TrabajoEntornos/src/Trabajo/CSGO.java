package Trabajo;

import java.util.ArrayList;

/**
 * Clase que representa un equipo de CSGO
 */

public class CSGO {
	
	/**
	 * El nombre del equipo
	 */
	private String equipo;
	
	/**
	 * Lista de nombres de los jugadores
	 */
	private ArrayList nombre;
	

	/**
	 * Constructor de la clase CSGO
	 * @param equipo El nombre del equipo
	 */
	public CSGO(String equipo) {
		super();
		this.equipo = equipo;
		this.nombre = new ArrayList();
	}
	
/**
 * Obtiene el nombre del equipo
 * @return El nombre del equipo
 */
	public String getEquipo() {
		return equipo;
	}
	
/**
 * Establece el nombre del equipo
 * @param equipo El nombre del equipo
 */
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
/**
 * Obtiene la lista de nombres de los jugadores
 * @return La lista de los nombres de los jugadores
 */
	public ArrayList getNombre() {
		return nombre;
	}
	
/**
 * Establece la lista de nombres de jugadores en el equipo
 * @param nombre La lista de nombres de jugadores a establecer
 */
	public void setNombre(ArrayList nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo para establecer el nombre del equipo
	 */
	public void establecerNombreEquipo() {
		
		this.equipo = "NAVI";
		
	}
	
	/**
	 * Metodo para inicializar la lista de nombres de jugadores
	 */
	public void inicializarJugadores() {
		
		nombre.add("b1t");
		nombre.add("Aleksib");
		nombre.add("iM");
		nombre.add("jL");
		nombre.add("w0nderful");
		
	}

}
