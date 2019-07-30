package top.whq6.study.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.whq6.study.entity.Caseillness;
import top.whq6.study.entity.CaseillnessExample;

public interface CaseillnessMapper {
    long countByExample(CaseillnessExample example);

    int deleteByExample(CaseillnessExample example);

    int deleteByPrimaryKey(Integer caseillnessId);

    int insert(Caseillness record);

    int insertSelective(Caseillness record);

    List<Caseillness> selectByExample(CaseillnessExample example);

    Caseillness selectByPrimaryKey(Integer caseillnessId);

    int updateByExampleSelective(@Param("record") Caseillness record, @Param("example") CaseillnessExample example);

    int updateByExample(@Param("record") Caseillness record, @Param("example") CaseillnessExample example);

    int updateByPrimaryKeySelective(Caseillness record);

    int updateByPrimaryKey(Caseillness record);
}