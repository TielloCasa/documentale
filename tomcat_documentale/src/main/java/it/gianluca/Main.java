package it.gianluca;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {

	public static void main(String[] args) {

		 Tomcat tomcat = new Tomcat();

	        tomcat.setPort(8080);

	        Context ctx = tomcat.addContext("/form", new File(".").getAbsolutePath());
	        Context ctx2 = tomcat.addContext("/crea", new File(".").getAbsolutePath());
	        Context ctx3 = tomcat.addContext("/verifica", new File(".").getAbsolutePath());

	        
	        Form form = new Form();
	        Crea crea = new Crea();
	        Verifica verifica = new Verifica();
	        
	        Tomcat.addServlet(ctx, "form", form);
	        ctx.addServletMapping("/*", "form");
	        
	        Tomcat.addServlet(ctx2, "crea", crea);
	        ctx2.addServletMapping("/*", "crea");
	        
	        Tomcat.addServlet(ctx3, "verifica", verifica);
	        ctx3.addServletMapping("/*", "verifica");


	        try {
				tomcat.start();
			} catch (LifecycleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        tomcat.getServer().await();
		}

	}

