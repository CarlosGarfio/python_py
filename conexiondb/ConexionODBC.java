package conexiondb;

public class ConexionODBC extends ConexionDB {

    public ConexionODBC() {
        super("sun.jdbc.odbc.JdbcOdbcDriver", "jdbc:odbc:MYSQL_ODBC");
    }

}
