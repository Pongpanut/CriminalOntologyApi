package OntologyRestApi;

import com.thetransactioncompany.cors.CORSConfiguration;
import com.thetransactioncompany.cors.CORSFilter;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Access-Control-Allow-Origin", "*");
        map.put("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        map.put("Access-Control-Allow-Headers", "Content-Type, api_key, Authorization");

        ResourceConfig config = new ResourceConfig();
        config.register(new CORSFilter());
//        config.getProperties().put(
//                "com.sun.jersey.spi.container.ContainerResponseFilters",
//                "com.sun.jersey.api.container.filter.LoggingFilter;com.myprogram.CrossDomainFilter"
//        );
        config.packages("OntologyRestApi");
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));

        Server server = new Server(9999);
        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");


        try {
            server.start();
            server.join();
        } catch (Exception ex){

        } finally {
            server.destroy();
        }


    }
}
