package personas.jdbc;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/capadedatos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="";
    //Creamos un objeto BasicDataSource.
    private static BasicDataSource ds=null;
    
    //Ahora, en vez de usar la clase DriverManager para obtener la conexión, tenemos que crear un método más.
    //Este método inicializara el objeto pool de conexiones y solicitara una nueva conexión a la base de datos.
    public static DataSource getDataSource() {
        //Si el objeto de dataSource (ds) es nulo, lo inicializa y setea la configuración.
        if(ds==null) {
            ds=new BasicDataSource();
            //Ahora proporcionamos cada uno de los valores para configurar el pool.
            ds.setUrl(JDBC_URL);
            ds.setUsername(JDBC_USER);
            ds.setPassword(JDBC_PASSWORD);
            //Finalmente, definimos el tamaño inicial del pool de conexiones
            ds.setInitialSize(5); //Creamos 5 conexiones por default, hay que tener cuidado cuantas inicializamos.
        }
        return ds;
    }
    
    public static Connection getConnection() throws SQLException {
        //Ahora en vez de usar DriverManager usamos el método de getDataSource().
        return getDataSource().getConnection();
        //Ya no tenemos que poner las constantes en el método getConnection().
    }
    
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
