/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ataris;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Rosas
 */
public class datosJDBC {
     private Conexion dbconnect;
    private Datos model;
    private Connection connection;
    public datosJDBC(){
        dbconnect = new Conexion();
        model = new Datos();
    }
        public void insertEmpleados(int id, String nom, String AP, String AM, String dni, String Fecha, float sala, String depa){
        PreparedStatement ps;
        String sql;
        
        model.setId(id);
        model.setNombre(nom);
        model.setApellidoPat(AP);
        model.setApellidoMat(AM);
        model.setDni(dni);
        model.setFech(Fecha);
        model.setSalario(sala);
        model.setDeparta(depa);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call insertaEmpleado(?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getId());
            stmt.setString(2, model.getNombre());
            stmt.setString(3, model.getApellidoPat());
            stmt.setString(4, model.getApellidoMat());
            stmt.setString(5, model.getDni());
            stmt.setString(6, model.getFech());
            stmt.setFloat(7, model.getSalario());
            stmt.setString(8, model.getDeparta());
            stmt.registerOutParameter(9, java.sql.Types.VARCHAR);
            stmt.execute();
            textMessage = stmt.getString(9);
            System.out.println("Mensaje" +  " es: " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    
    public void eliminarEmpleado(int Id){
        PreparedStatement ps;
        String sql;
        
        model.setId(Id);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call eliminarEmpleado(?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getId());
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(2);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    public void buscarEmpleado(String nombre, String AP, String AM){
        PreparedStatement ps;
        String sql;
        
        model.setNombre(nombre);
        model.setApellidoPat(AP);
        model.setApellidoMat(AM);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call buscaEmpleado(?,?,?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getNombre());
            stmt.setString(2, model.getApellidoPat());
            stmt.setString(3, model.getApellidoMat());
            stmt.registerOutParameter(4, java.sql.Types.INTEGER);
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(7, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(9, java.sql.Types.DATE);
            stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(11, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(12, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = Integer.toString(stmt.getInt(4))+"\n"+stmt.getString(5)+"\n"+stmt.getString(6)+"\n"+stmt.getString(7)+
                          "\n"+stmt.getString(8)+"\n"+stmt.getString(9)+"\n"+stmt.getString(10)+"\n"+stmt.getString(11)+"\n";
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    
    public void buscarCodigoEmpleado(int Id){
        PreparedStatement ps;
        String sql;
        
        model.setId(Id);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call buscarCodigoEmpleado(?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getId());
            stmt.registerOutParameter(2, java.sql.Types.INTEGER);
            stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(7, java.sql.Types.DATE);
            stmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(9, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = Integer.toString(stmt.getInt(2))+"\n"+stmt.getString(3)+"\n"+stmt.getString(4)+"\n"+stmt.getString(5)+
                          "\n"+stmt.getString(6)+"\n"+stmt.getString(7)+"\n"+stmt.getString(8)+"\n"+stmt.getString(9)+"\n";
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    
    public void insertDepartamento(String nombre, String descrip){
        PreparedStatement ps;
        String sql;
        
        model.setNombreDep(nombre);
        model.setDescripDep(descrip);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            
            sql = "{call insertarDepartamento(?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getNombreDep());
            stmt.setString(2, model.getDescripDep());
            stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(3);
            System.out.println("Mensaje" +  " es: " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    public void eliminarDepartamento(String nombre){
        PreparedStatement ps;
        String sql;
        
        model.setNombreDep(nombre);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            
            sql = "{call eliminarDepartamento(?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getNombreDep());
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(2);
            System.out.println("Mensaje" +  " es: " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    
    
       public void insertProyecto(int Id, String nombre, String descrip, float presu, String FechIn, 
                                String FechFin, String Estado, String DepNom){
        
        PreparedStatement ps;
        String sql;
        
        model.setIdProyect(Id);
        model.setNombreProyect(nombre);
        model.setDescriProyect(descrip);
        model.setPresuProyect(presu);
        model.setFechaInProyect(FechIn);
        model.setFechaFinProyect(FechFin);
        model.setEstado(Estado);
        model.setDeparta(DepNom);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call insertarProyecto(?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getIdProyect());
            stmt.setString(2, model.getNombreProyect());
            stmt.setString(3, model.getDescriProyect());
            stmt.setFloat(4, model.getPresuProyect());
            stmt.setString(5, model.getFechaInProyect());
            stmt.setString(6, model.getFechaFinProyect());
            stmt.setString(7, model.getEstado());
            stmt.setString(8, model.getDeparta());
            stmt.registerOutParameter(9, java.sql.Types.VARCHAR);
            
            stmt.execute();
            textMessage = stmt.getString(9);
            
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        
    }
    
    
    public void changeState(int Id, String EstN){
        PreparedStatement ps;
        String sql;
        
        model.setIdProyect(Id);
        model.setEstado(EstN);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            
            sql = "{call cambiaEstado(?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getIdProyect());
            stmt.setString(2, model.getEstado());
            stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(3);
            System.out.println("Mensaje" +  " es: " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    
    public void anadirEmpleado(int IdEmp, int IdProy, String Rol, String Fecha){
        PreparedStatement ps;
        String sql;
        
        model.setId(IdEmp);
        model.setIdProyect(IdProy);
        model.setRol(Rol);
        model.setFech(Fecha);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            
            sql = "{call agregarParticipacion(?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getId());
            stmt.setInt(2, model.getIdProyect());
            stmt.setString(3, model.getRol());
            stmt.setString(4, model.getFech());
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(5);
            System.out.println("Mensaje" +  " es: " + textMessage);
            
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    
    public void cambiarRol(int IdEmp, int IdProy, String Rol){
        PreparedStatement ps;
        String sql;
        
        model.setId(IdEmp);
        model.setIdProyect(IdProy);
        model.setRol(Rol);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            
            sql = "{call cambiaRol(?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getId());
            stmt.setInt(2, model.getIdProyect());
            stmt.setString(3, model.getRol());
            stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(4);
            System.out.println("Mensaje" +  " es: " + textMessage);
            
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        
        
    }
}
