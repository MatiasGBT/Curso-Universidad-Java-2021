package personas.jdbc;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;

public interface IPersonaDAO {
    
    public abstract List<PersonaDTO> select() throws SQLException;
    
    public abstract int insert(PersonaDTO persona) throws SQLException;
    
    public abstract int update(PersonaDTO persona) throws SQLException;
    
    public abstract int delete(PersonaDTO persona) throws SQLException;
}
