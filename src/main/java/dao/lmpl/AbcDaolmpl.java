package dao.lmpl;

import dao.AbcDao;
import entity.Abc;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utlis.DBManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AbcDaolmpl implements AbcDao {
    QueryRunner qr = new QueryRunner();
    @Override
    public Abc queryById(Integer id) {
        return null;
    }

    @Override
    public List<Abc> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public List<Abc> queryAll(Abc abc) {
        Connection conn = DBManager.getConn();
        String sql = "select * from abc";
        try {
            List<Abc> abc1 = qr.query(conn, sql, new BeanListHandler<>(Abc.class));
            return abc1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int insert(Abc abc) {
        return 0;
    }

    @Override
    public int insertBatch(List<Abc> entities) {
        return 0;
    }

    @Override
    public int insertOrUpdateBatch(List<Abc> entities) {
        return 0;
    }

    @Override
    public int update(Abc abc) {
        return 0;
    }

    @Override
    public int deleteById(Integer id) {
        return 0;
    }
}
