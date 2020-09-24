package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.WeatherInput;

import java.io.PrintWriter;

/**
 * Servlet implementation class getInputServlet
 */
@WebServlet("/getInputServlet")
public class getInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getInputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userDay = request.getParameter("userDay");		
		String userDegree = request.getParameter("userDegree");
		
		
		WeatherInput userWeather = new WeatherInput(userDay, Double.parseDouble(userDegree));		
		request.setAttribute("userWeatherPouch", userWeather);
		getServletContext().getRequestDispatcher("/WeatherWebResult.jsp").forward(request, response);
		
		/**
		//String userDegree = request.getParameter("userDegree");
		WeatherInput userConvert = new WeatherInput(Double.parseDouble(userDegree));		
		request.setAttribute("userConvertPouch", userConvert);
		getServletContext().getRequestDispatcher("/temperatureConvertResult.jsp").forward(request, response);
		*/
		
		
		/**
		PrintWriter writer = response.getWriter();
		writer.println(userWeather1.toString1());
		writer.close();
		*/
		
		/**
		PrintWriter writer = response.getWriter();
		writer.println(userWeather.toString());
		writer.close();
		*/
	}
}
