
import java.sql.SQLException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m4rh3
 */
public interface ProfileServices {
    Profil insert(Profil Biodata) throws SQLException;
    void update(Profil Biodata) throws SQLException;
    void delete(String no_id) throws SQLException;
    List getAll() throws SQLException;
}
