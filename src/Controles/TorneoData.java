
package Controles;

import Modelos.Torneo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class TorneoData {
    
     private Connection con = null;

  public TorneoData() {
    }
     
     
  
  public TorneoData(Conexion conn){ 
      con = conn.conectar();
    }
  public void registrarTorneo(Torneo t){
    String sql = "INSERT INTO torneos(nombre, fecha_ini, fecha_fin, activo) VALUES (?, ?, ?, ?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, t.getNombre());
            ps.setDate(2, Date.valueOf(t.getFechaInicio()));
            ps.setDate(3, Date.valueOf(t.getFechaFin()));
            ps.setBoolean(4, t.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                t.setIdTorneo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Torneo registrado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el Torneo "+ex);
        }
  }
      public ArrayList<Torneo> obtenerTodosLosTorneos() {
        return obtenerTorneos("");
    }

  public ArrayList<Torneo> obtenerTorneos(String cadena){
        Torneo t = new Torneo();
        ArrayList<Torneo> torneos=new ArrayList<>();        
        String sql="SELECT * FROM torneos WHERE Nombre like '%" + cadena + "%';";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs= ps.executeQuery();
        
            while(rs.next()){
                t.setIdTorneo(rs.getInt("id_torneo"));
                t.setNombre(rs.getString("nombre"));
                t.setFechaInicio(rs.getDate("fecha_ini").toLocalDate());
                t.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                t.setActivo(rs.getBoolean("activo"));
                
                torneos.add(t);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion.");
        }
        return torneos;
    }
 
  public Torneo buscarTorneo(int idTorneo){
        Torneo t = new Torneo();
        String sql = "SELECT * FROM torneos WHERE id_torneo = ? ";

      PreparedStatement ps;
          try {
              ps = con.prepareStatement(sql);
              ps.setInt(1, idTorneo);
              ResultSet rs = ps.executeQuery();

              while(rs.next()){
                t.setIdTorneo(rs.getInt("id_torneo"));  
                t.setNombre(rs.getString("nombre"));
                t.setFechaInicio((rs.getDate("fecha_ini")).toLocalDate());
                t.setFechaFin((rs.getDate("fecha_fin")).toLocalDate());
                t.setActivo(rs.getBoolean("activo"));

              }
              ps.close();

          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error");
          }

      return t;
    }
  public void borrarTorneo(int idTorneo){
      String sql = "UPDATE torneos SET activo = false WHERE id_torneo = ?";
    
       try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, idTorneo);
          ps.executeUpdate();
          
         if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Torneo borrado");
      }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar Torneo "+ex);
        }   
    }
  public void actualizarTorneo(Torneo t){
        try {
            String sql = "UPDATE torneos SET nombre = ?, fecha_ini = ?, fecha_fin = ?, activo = ? WHERE id_torneo = ? ";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);            
            
            ps.setString(1, t.getNombre());
            ps.setDate(2, Date.valueOf(t.getFechaInicio()));
            ps.setDate(3, Date.valueOf(t.getFechaFin()));
            ps.setBoolean(4, t.isActivo());
            ps.setInt(5, t.getIdTorneo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
           if(ps.executeUpdate()>0){
        JOptionPane.showMessageDialog(null, "Torneo actualizado");
        
      }else{
              JOptionPane.showMessageDialog(null, "El Torneo no existe"); 
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Torneo");
        }
  }
}
