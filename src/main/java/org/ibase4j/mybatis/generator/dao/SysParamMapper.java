package org.ibase4j.mybatis.generator.dao;

import java.util.List;
import org.ibase4j.mybatis.generator.model.SysParam;

public interface SysParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    int insert(SysParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    SysParam selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    List<SysParam> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysParam record);
}