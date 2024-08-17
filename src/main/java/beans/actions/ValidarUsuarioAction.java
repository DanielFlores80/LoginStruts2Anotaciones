/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/Action.java to edit this template
 */
package beans.actions;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author grenn
 */
/*
En caso de que el metodo execute() devuelva SUCCESS lanzará la vista "bienvenido.jsp"
En caso de que el metodo execute() devuelva INPUT lanzará el redireccionamiento a la misma vista "login.jsp"
*/
@Results({
    @Result(name="success", location="/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input", location="login", type="redirectAction")
    
})
public class ValidarUsuarioAction extends ActionSupport{
    Logger log = LogManager.getLogger(ValidarUsuarioAction.class);
    private String usuario;
    private String password; 

    @Action("validarUsuario")//Variable que es llamada desde "login.jsp" como petición del form
    public String execute() throws Exception {
        if ("admin".equals(usuario)) {
            return SUCCESS;//Retorna un "success" en caso de que el usuario ingresado sea "admin"
            
        }else{
            return INPUT;//Retorna un "input" en caso de que no lo sea y redirecciona el archivo struts.xml
        }
    }
    //Setters y Getters sin logica para obtener las variables desde la vista "bienvenido.jsp"
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
