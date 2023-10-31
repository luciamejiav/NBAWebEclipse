package view;


import manejador.Manejador;
import model.Player;
import model.Team;

public class Prueba {

	public static void main(String[] args) {
		Manejador manejador = new Manejador("http://www.ies-azarquiel.es/paco/apinba/teams");
		Team[] teams = manejador.getTeams();
		
		System.out.println("****************************************************");
		System.out.println("***************** Equipos **************************");
		System.out.println("****************************************************");
		for (Team team:teams) {
			System.out.println(team);
		}
		
/*		Manejador manejador = new Manejador("http://www.ies-azarquiel.es/paco/apinba/players");
		Player[] players = manejador.getPlayers();
		
		System.out.println("****************************************************");
		System.out.println("***************** Jugadores ************************");
		System.out.println("****************************************************");
		for (Player player:players) {
			System.out.println(player);
		}*/
	}

}
