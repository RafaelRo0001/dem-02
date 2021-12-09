package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class datosJDBC {
    private Conexion dbconnect;
    private Datos model;
    private Connection connection;
    public datosJDBC(){
        dbconnect = new Conexion();
        model = new Datos();
    }
    
    public void iniciarSesionClie(String nom, String con){
        PreparedStatement ps;
        String sql;
        
        model.setClienNombre(nom);
        model.setClienCon(con);
       
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null; 
            sql = "{call iniciarSesionClientes(?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getClienNombre());
            stmt.setString(2, model.getClienCon());
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
    
     public void insertClien(String nom, String aP, String aM, String dni, String ed,String tel,String Fecha,String cor,String con,String dir,String paq){
        PreparedStatement ps;
        String sql;
      model.setClienNombre(nom);
        model.setClienApePat(aP);
        model.setClienApeMat(aM);
        model.setClienDni(dni);
        model.setClienEd(ed);
        model.setClienTel(tel);
        model.setClienFech(Fecha);
        model.setClienCorreo(cor);
        model.setClienCon(con);
        model.setCliendirec(dir);
        model.setClienPaq(paq);
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call insertaClientes2 (?,?,?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getClienNombre());
            stmt.setString(2, model.getClienApePat());
            stmt.setString(3, model.getClienApeMat());
            stmt.setString(4, model.getClienDni());
            stmt.setString(5, model.getClienEd());
            stmt.setString(6, model.getClienTel());
            stmt.setString(7, model.getClienFech());
            stmt.setString(8, model.getClienCorreo());
            stmt.setString(9, model.getClienCon());
            stmt.setString(10,model.getCliendirec());
            stmt.setString(11,model.getClienPaq());
            stmt.registerOutParameter(12, java.sql.Types.VARCHAR);
            stmt.execute();
            textMessage = stmt.getString(12);
            System.out.println("Mensaje" +  " es: " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());        
        }    
     }  
     
     public void eliminarClien(int Id){
        PreparedStatement ps;
        String sql;
        
        model.setClienid(Id);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call eliminarClientes (?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getClienid());
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
     
     //eliminarClientes2
     public void eliminarClien2(String email){
        PreparedStatement ps;
        String sql;
        
        model.setClienCorreo(email);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call eliminarClientes2(?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getClienCorreo());
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
    
}
