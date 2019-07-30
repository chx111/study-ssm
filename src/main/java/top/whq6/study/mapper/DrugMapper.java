package top.whq6.study.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.whq6.study.entity.Drug;
import top.whq6.study.entity.DrugExample;

public interface DrugMapper {
    long countByExample(DrugExample example);

    int deleteByExample(DrugExample example);

    int deleteByPrimaryKey(Integer drugId);

    int insert(Drug record);

    int insertSelective(Drug record);

    List<Drug> selectByExample(DrugExample example);

    Drug selectByPrimaryKey(Integer drugId);

    int updateByExampleSelective(@Param("record") Drug record, @Param("example") DrugExample example);

    int updateByExample(@Param("record") Drug record, @Param("example") DrugExample example);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);
}