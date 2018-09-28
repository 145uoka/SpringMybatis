package org.sample.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.sample.mybatis.entity.SampleTbl;
import org.sample.mybatis.entity.SampleTblExample;

public interface SampleTblDao {
    long countByExample(SampleTblExample example);

    int deleteByExample(SampleTblExample example);

    int deleteByPrimaryKey(Integer sampleId);

    int insert(SampleTbl record);

    int insertSelective(SampleTbl record);

    List<SampleTbl> selectByExampleWithRowbounds(SampleTblExample example, RowBounds rowBounds);

    List<SampleTbl> selectByExample(SampleTblExample example);

    SampleTbl selectByPrimaryKey(Integer sampleId);

    int updateByExampleSelective(@Param("record") SampleTbl record, @Param("example") SampleTblExample example);

    int updateByExample(@Param("record") SampleTbl record, @Param("example") SampleTblExample example);

    int updateByPrimaryKeySelective(SampleTbl record);

    int updateByPrimaryKey(SampleTbl record);
}