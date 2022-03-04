package dao;

import entity.Abc;

import java.util.List;

/**
 * (Abc)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-09 11:17:08
 */
public interface AbcDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Abc queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Abc> queryAllByLimit( int offset,  int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param abc 实例对象
     * @return 对象列表
     */
    List<Abc> queryAll(Abc abc);

    /**
     * 新增数据
     *
     * @param abc 实例对象
     * @return 影响行数
     */
    int insert(Abc abc);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Abc> 实例对象列表
     * @return 影响行数
     */
    int insertBatch( List<Abc> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Abc> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch( List<Abc> entities);

    /**
     * 修改数据
     *
     * @param abc 实例对象
     * @return 影响行数
     */
    int update(Abc abc);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

