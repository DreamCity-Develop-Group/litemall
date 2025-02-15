package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.GameLevel;
import org.linlinjava.litemall.db.domain.GameLevelExample;

public interface GameLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    long countByExample(GameLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int deleteByExample(GameLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int insert(GameLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int insertSelective(GameLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    GameLevel selectOneByExample(GameLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    GameLevel selectOneByExampleSelective(@Param("example") GameLevelExample example, @Param("selective") GameLevel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    List<GameLevel> selectByExampleSelective(@Param("example") GameLevelExample example, @Param("selective") GameLevel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    List<GameLevel> selectByExample(GameLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    GameLevel selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") GameLevel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    GameLevel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    GameLevel selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GameLevel record, @Param("example") GameLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GameLevel record, @Param("example") GameLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GameLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GameLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") GameLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_level
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}