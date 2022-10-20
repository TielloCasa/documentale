package it.gianluca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Verifica extends HttpServlet{

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
	
		
		int fattura=0;
		int fattA=0;
		int ordine=0;
		int preventivo=0;
		int ddt=0;
		int notedic=0;
		int fatturainv=0;
		int fatturaA=0;
		int notadiD=0;

		for(int i=0;i<ListaDocumenti.d.size();i++) {
			if(ListaDocumenti.d.get(i) instanceof Fattura) {
				fattura++;
			}
			if(ListaDocumenti.d.get(i) instanceof FatturaAccompagnatoria) {
				fattA++;
			}
			if(ListaDocumenti.d.get(i) instanceof Ordine) {
				ordine++;
			}
			if(ListaDocumenti.d.get(i) instanceof Preventivo) {
				preventivo++;
			}
			if(ListaDocumenti.d.get(i) instanceof DDT) {
				ddt++;
			}
			if(ListaDocumenti.d.get(i) instanceof NotaDiCredito) {
				notedic++;
			}
			if(ListaDocumenti.d.get(i) instanceof FatturaInversa) {
				fatturainv++;
			}
			if(ListaDocumenti.d.get(i) instanceof FatturaAnalogica) {
				fatturaA++;
			}
			if(ListaDocumenti.d.get(i) instanceof NotaDiDebito) {
				notadiD++;
			}
		}
		
		
		System.out.println("All'interno della lista di documenti, abbiamo: ");
		System.out.println(fattura+" Fatture");
		System.out.println(fattA+" Fattura di accompagnamento");
		System.out.println(ordine+" Ordini");
		System.out.println(preventivo+" Preventivi");
		System.out.println(ddt+" DDT");
		System.out.println(notedic+" Note di Credito");
		System.out.println(fatturainv+" Fatture inverse");
		System.out.println(fatturaA+" Fatture Analogiche");
		System.out.println(notadiD+" Note di Debito");
		
		
        PrintWriter writer = resp.getWriter();
        
        writer.println("<html>"
        		+ "<body>"
        		+ "<center>"
        		+ "<p>All'interno della lista di docuementi, abbiamo: </p>"
        		+ "<p>"+fattura+" Fatture</p>"
        		+ "<p>"+fattA+" Fattura di accompagnamento</p>"
        		+ "<p>"+ordine+" Ordini</p>"
        		+ "<p>"+preventivo+" Preventivi </p>"
        		+ "<p>"+ddt+" DDT </p>"
        		+ "<p>"+notedic+" Note di credito</p>"
        		+ "<p>"+fatturainv+" Fatture inverse</p>"
        		+ "<p>"+fatturaA+" Fatture Analogiche</p>"
        		+ "<p>"+notadiD+" Note di debito</p>"
	       		+ "<a href='form'><button>INSERISCI ANCORA</button></center>"
        		+ "</body>"
        		+ "</html>");
      

	
	
	}
}
