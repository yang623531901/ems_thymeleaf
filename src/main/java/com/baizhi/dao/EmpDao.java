package com.baizhi.dao;

import com.baizhi.entity.Emp;

import java.util.List;

/**
 * @author 杨志远
 * @date 2020-06-06 19:04
 */
public interface EmpDao {

    /**
     * 查询所有员工
     *
     * @return
     */
    List<Emp> findAll();

    /**
     * 添加员工
     *
     * @param emp
     */
    void save(Emp emp);

    /**
     * 删除员工(根据id删除)
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    Emp find(Integer id);

    /**
     * 更新员工信息
     * @param emp
     */
    void update(Emp emp);

}
