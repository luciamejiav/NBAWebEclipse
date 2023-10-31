package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manejador.Manejador;
import model.Player;
import model.Team;


/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String op = request.getParameter("op");
		
		switch (op) {
		case "inicio": {
			Manejador manejador = new Manejador("http://www.ies-azarquiel.es/paco/apinba/teams");
			Team[] teams = manejador.getTeams();

			request.setAttribute("teams", teams);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			break;
			
		} case "detail": {
			String teamname = request.getParameter("teamname");
			String url ="http://www.ies-azarquiel.es/paco/apinba/players/team?name="+teamname;
			url = url.replace(" ", "%20");
			Manejador manejador = new Manejador(url);
			Player[] players = manejador.getPlayers();

			request.setAttribute("teamname", teamname);
			request.setAttribute("players", players);
			request.getRequestDispatcher("detail.jsp").forward(request, response); //nueva página para los jugadores
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
