package top.whq6.study.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.whq6.study.entity.Problem;
import top.whq6.study.entity.ProblemExample;

public interface ProblemMapper {
    long countByExample(ProblemExample example);

    int deleteByExample(ProblemExample example);

    int deleteByPrimaryKey(Integer problemBankId);

    int insert(Problem record);

    int insertSelective(Problem record);

    List<Problem> selectByExample(ProblemExample example);

    Problem selectByPrimaryKey(Integer problemBankId);

    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);
}