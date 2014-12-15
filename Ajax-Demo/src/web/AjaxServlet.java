package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Point;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import data.Loader;

public class AjaxServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3986978137150125590L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Loader loader = new Loader();
		List<Point> list = loader.getPoints();
		
		LinkedList<JSONObject> jsonList = new LinkedList<JSONObject>();
		for (Point p : list) {
			JSONObject jsobj = JSONObject.fromObject(p);
			jsonList.add(jsobj);
		}
		JSONArray json = JSONArray.fromObject(jsonList);
		PrintWriter out = resp.getWriter();
		out.println(json.toString());
		out.flush();
		out.close();

	}

	// public static void main(String[] args){
	// AjaxServlet as = new AjaxServlet();
	// try {
	// as.doPost(HttpServletRequest.class.newInstance(),HttpServletResponse.class.newInstance());
	// } catch (InstantiationException | IllegalAccessException
	// | ServletException | IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

}
