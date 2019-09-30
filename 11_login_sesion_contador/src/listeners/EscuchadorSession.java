package listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class EscuchadorSession
 *
 */
@WebListener
public class EscuchadorSession implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public EscuchadorSession() {
        // TODO Auto-generated constructor stub
    }

    public void sessionCreated(HttpSessionEvent se)  { 
        ServletContext context=se.getSession().getServletContext();
        int contador=(Integer)context.getAttribute("contador");
        contador++;
        context.setAttribute("contador", contador);
   }

	/**
    * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
    */
   public void sessionDestroyed(HttpSessionEvent se)  { 
   	ServletContext context=se.getSession().getServletContext();
       int contador=(Integer)context.getAttribute("contador");
       contador--;
       context.setAttribute("contador", contador);
   }
}
