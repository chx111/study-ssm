package top.whq6.study.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.whq6.study.entity.Usercaseill;
import top.whq6.study.entity.UsercaseillExample;

public interface UsercaseillMapper {
    long countByExample(UsercaseillExample example);

    int deleteByExample(UsercaseillExample example);

    int deleteByPrimaryKey(Integer usercaseillId);

    int insert(Usercaseill record);

    int insertSelective(Usercaseill record);

    List<Usercaseill> selectByExample(UsercaseillExample example);

    Usercaseill selectByPrimaryKey(Integer usercaseillId);

    int updateByExampleSelective(@Param("record") Usercaseill record, @Param("example") UsercaseillExample example);

    int updateByExample(@Param("record") Usercaseill record, @Param("example") UsercaseillExample example);

    int updateByPrimaryKeySelective(Usercaseill record);

    int updateByPrimaryKey(Usercaseill record);
}