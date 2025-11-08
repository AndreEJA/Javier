package ni.edu.uam.JAVIER-ADMIN.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class JAVIERADMIN {

	public static void main(String[] args) throws Exception {
		DBServer.start("JAVIER-ADMIN-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("JAVIER-ADMIN"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
