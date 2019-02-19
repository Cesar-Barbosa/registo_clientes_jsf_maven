package pt.com.ccb.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;

/**
 * @author Cesar Barbosa
 */
public class FacesContextUtil {

    private static final String HIBERNATE_SESSION = "hobernate_session";

    public static void setRequestSession(Session session) {
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, session);
    }

    public static Session getRequestSession() {
        return (Session) FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }
}
