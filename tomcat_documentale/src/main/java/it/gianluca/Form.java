package it.gianluca;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form extends HttpServlet{


	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        //File file = new File();
        
        w.write(""
        		+ "		<html>"
        		+ "		<body>"
        		+ "		 <center>"
        		+ "      <h1>INSERICSCI DOC</h1>"
        		+ "		 <form name=\"loginForm\" method=\"post\" action=\"crea\">"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='DDT'> <br/>"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='Fattura'> <br/>"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='FatturaAccompagnatoria'> <br/>"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='FatturaAnalogica'> <br/>"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='FatturaInversa'> <br/>"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='NotaDiCredito'> <br/>"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='NotaDiDebito'> <br/>"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='Ordine'> <br/>"
        		+ "		 <input type=\"submit\" name=\"numero\"/ value='Preventivo'> <br/>"
        		+ "		 </form><br><br>"
	       		+ "<a href='verifica'><button>VERIFICA DOCUMENTI</button>"
        		+ "		 </center>"
        		+ "		 </body>"
        		+ "		 </html>");
        w.flush();
        w.close();
    }
}
