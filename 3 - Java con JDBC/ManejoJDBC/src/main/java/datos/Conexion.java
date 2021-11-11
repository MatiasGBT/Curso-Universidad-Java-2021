package datos;

import java.sql.*;

public class Conexion {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="";
    
    public static Connection getConnection() throws SQLException { //En vez de el try/catch reportamos la excepcion.
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }
    
    //PreparedStatement es una interface el cual tiene una mejor performance
    //que el objeto Statement, así que se usa en mayor medida.
    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
