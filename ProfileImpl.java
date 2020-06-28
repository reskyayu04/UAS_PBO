
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 */
import java.sql.*;
import java.util.*;

/**
 *
 * @author windows
 */
public abstract class ProfileImpl implements ProfileServices {

    @Override
    public Profil insert(Profil biodata) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("insert into biodata values(?,?,?,?,?)");
        st.setString(1, Biodata.getId());
        st.setString(2, Biodata.getNama());
        st.setString(3, Biodata.getAlamat());
        st.setString(4, Biodata.getJk());
        st.setString(5, Biodata.getEmail());
        st.executeUpdate();



        return Biodata;
    }

    @Override
    public void update(Profil Biodata) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("update biodata set nama=?,alamat=?,jk=?,email=? where nomhs=?");

        st.setString(1, Biodata.getNama());
        st.setString(3, Biodata.getAlamat());
        st.setString(4, Biodata.getJk());
        st.setString(5, Biodata.getEmail());
        st.setString(3, Biodata.getId());
        st.executeUpdate();

    }

    public void delete(int no_id) throws SQLException {
        PreparedStatement st = KoneksiDb.getConnection().prepareStatement("delete from biodata where no_id=?");
        st.setInt(1, id);
        st.executeUpdate();
    }

    @Override
    public List getAll() throws SQLException {
        Statement st = KoneksiDb.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from biodata");
        List list = new ArrayList();
        while (rs.next()) {
            Profil p = new Profil();
            p.setId(rs.getString("no_id"));
            p.setNama(rs.getString("nama"));
            p.setAlamat(rs.getString("alamat"));
            p.setJk(rs.getString("jk"));
            p.setEmail(rs.getString("email"));
            list.add(p);
        }
        return list;
    }
}
