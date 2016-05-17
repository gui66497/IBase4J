package org.ibase4j.mybatis.generator.dao;

import java.util.List;
import org.ibase4j.mybatis.generator.model.SysDic;

public interface SysDicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic
     *
     * @mbggenerated
     */
    int insert(SysDic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic
     *
     * @mbggenerated
     */
    SysDic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic
     *
     * @mbggenerated
     */
    List<SysDic> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysDic record);
}