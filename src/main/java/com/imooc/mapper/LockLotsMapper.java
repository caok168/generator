package com.imooc.mapper;

import com.imooc.pojo.LockLots;
import java.util.List;

public interface LockLotsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lock_lots
     *
     * @mbg.generated Sun Jul 10 13:01:36 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lock_lots
     *
     * @mbg.generated Sun Jul 10 13:01:36 CST 2022
     */
    int insert(LockLots record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lock_lots
     *
     * @mbg.generated Sun Jul 10 13:01:36 CST 2022
     */
    LockLots selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lock_lots
     *
     * @mbg.generated Sun Jul 10 13:01:36 CST 2022
     */
    List<LockLots> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lock_lots
     *
     * @mbg.generated Sun Jul 10 13:01:36 CST 2022
     */
    int updateByPrimaryKey(LockLots record);
}