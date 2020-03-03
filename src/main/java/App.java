import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet(urlPatterns={"/"})
public class App extends HttpServlet{	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		try{
			PrintWriter pw = res.getWriter();
			pw.write("<h1>Hello, professor!!</h1> <i>ass: Bruna Totti</i>");
			pw.close();
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}	
}