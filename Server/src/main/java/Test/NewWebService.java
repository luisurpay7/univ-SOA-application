/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Modelo.Conexion;
import Modelo.User;
import Modelo.UserDAO;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author lurpays
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    
    UserDAO dao = new UserDAO();
    @WebMethod(operationName = "listar")
    public List<User> listar() {
        List datos = dao.listar();
        //Conexion conex=new Conexion();
        //List datos = new List<User>;
        //Conexion conex=new Conexion();
        //List datos = null;
        return datos;
    }
    
    /*@WebMethod(operationName = "hello")
    public String hello() {
        String result="0";
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
        }catch(Exception e){
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            result = exceptionAsString;
            //result = "ERROR 9001";
        }
        return result;
    }*/
    
}
