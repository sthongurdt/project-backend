package backend;
import java.sql.*;

public class Conexion {

	//Datos para la conexion
	private String bd = "bdmotivabici";
	private String login = "root";
	private String password = "F10rd310t0";
	private String url = "jdbc:mysql://localhost:3306/?user=root"+bd;
	private Connection conn = null;
	
	//Constructor 
	public Conexion (){
		try{         
	         Class.forName("com.mysql.jdbc.Driver");         
	         conn = DriverManager.getConnection(url,login,password);         
	      }catch(SQLException e){
	         System.out.println(e);
	      }catch(ClassNotFoundException e){
	         System.out.println(e);
	      }
	}
	
	//Funcion para almacenamiento de coordenadas
	public String procedure(String id_recor, String id_user, int hor_tom, float lat, float lon, float alt)
	   {
	       String resultado=null;
	       try {            
	            // se crea instancia a procedimiento, los parametros de entrada y salida se simbolizan con el signo ?
	            CallableStatement proc = conn.prepareCall(" CALL registrar_coordenada(?,?,?,?,?,?) ");
	            //se cargan los parametros de entrada
	            proc.setString("id_recor", id_recor);//Tipo String
	            proc.setString("id_user", id_user);//Tipo String
	            proc.setInt("hor_tom", hor_tom);//Tipo entero
	            proc.setFloat("lat", lat);//Tipo float
	            proc.setFloat("lon", lon);//Tipo float
	            proc.setFloat("alt", alt);//Tipo float
	            // Se ejecuta el procedimiento almacenado
	            proc.execute();            	            
	        } 
	       catch (Exception e) {                  
	            System.out.println(e);
	       }
	       return null;
	   }
	
	
}
