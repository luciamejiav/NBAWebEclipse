package manejador;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import com.google.gson.Gson;

import model.Player;
import model.Team;

public class Manejador {

	Player[] players;
	Team[] teams;
	private String jsonTxt;

	public Manejador(String urlTxt) {
		try {
			// traer JSON de internet a través de la URL en formato String
			jsonTxt = IOUtils.toString(new URL(urlTxt), Charset.forName("UTF-8"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Player[] getPlayers() {
		// serializar
		players = new Gson().fromJson(jsonTxt, Player[].class);
		return players;
	}
	public Team[] getTeams() {
		// serializar
		teams = new Gson().fromJson(jsonTxt, Team[].class);
		return teams;
	}


	

}
