
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    
    @Override
    public List listar() {
        List<User> datos = new ArrayList<>();
        String sql = "select * from user";
        try {
            con=conex.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setFname(rs.getString("fname"));
                u.setLname(rs.getString("lname"));
                datos.add(u);
            }
        }catch(Exception e){
            
        }
        return datos;
    }

    @Override
    public User listarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(String nombre, String ape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(int id, String nombre, String ape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
