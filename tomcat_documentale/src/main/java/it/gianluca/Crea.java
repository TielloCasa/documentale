package it.gianluca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Crea extends HttpServlet{

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

		
		 String val = req.getParameter("numero");
		 
		if(val.equals("DDT")) {
			ListaDocumenti.d.add(new DDT());
		}
		if(val.equals("Fattura")) {
			ListaDocumenti.d.add(new Fattura());
		}
		if(val.equals("FatturaAccompagnatoria")) {
			ListaDocumenti.d.add(new FatturaAccompagnatoria());
		}
		if(val.equals("FatturaAnalogica")) {
			ListaDocumenti.d.add(new FatturaAnalogica());
		}
		if(val.equals("FatturaInversa")) {
			ListaDocumenti.d.add(new FatturaInversa());
		}
		if(val.equals("NotaDiCredito")) {
			ListaDocumenti.d.add(new NotaDiCredito());
		}
		if(val.equals("NotaDiDebito")) {
			ListaDocumenti.d.add(new NotaDiDebito());
		}
		if(val.equals("Ordine")) {
			ListaDocumenti.d.add(new Ordine());
		}
		if(val.equals("Preventivo")) {
			ListaDocumenti.d.add(new Preventivo());
		}
		
	
		System.out.println(val);
        PrintWriter writer = resp.getWriter();
        
	       writer.println("<html>"
	       		+ "<body>"
	    		+ "<center>"
	    		+ "<h2>HAI INSERITO "+val+"</h2>"
	       		+ "<a href='form'><button>INSERISCI ANCORA</button>"
	       		+ "<a href='verifica'><button>VERIFICA DOCUMENTI</button>"
	       		+ "</a><br>");
	   
	       
	       writer.println(	
	       		 "</center></body>"
	       		+ "</html>");
	      
	
	
	}
	}
	

