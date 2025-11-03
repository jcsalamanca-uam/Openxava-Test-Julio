package ni.edu.uam.OpenXavaTest_3-11-25.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class OpenXavaTest_3-11-25 {

	public static void main(String[] args) throws Exception {
		DBServer.start("OpenXavaTest_3-11-25-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("OpenXavaTest_3-11-25"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
