/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/Action.java to edit this template
 */
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author grenn
 */
/*
En caso de exito "success" del metodo execute() re direcciona a la vista login.jsp
*/
@Result(name="success", location="/WEB-INF/content/login.jsp" )
public class LoginAction extends ActionSupport{

    @Action("login")//Llamado desde el index para mostrar la vista "login.jsp"
    public String execute() throws Exception {
        return SUCCESS;//devuelve exito
    }
    

}
