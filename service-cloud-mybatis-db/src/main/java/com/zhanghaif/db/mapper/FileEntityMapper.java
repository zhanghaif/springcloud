package com.zhanghaif.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zhanghaif.db.dao.BaseDao;
import com.zhanghaif.db.entity.FileEntity;
import com.zhanghaif.db.entity.FileEntityExample;

public interface FileEntityMapper extends BaseDao {
    int countByExample(FileEntityExample example);

    int deleteByExample(FileEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(FileEntity record);

    int insertSelective(FileEntity record);

    List<FileEntity> selectByExample(FileEntityExample example);

    FileEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FileEntity record, @Param("example") FileEntityExample example);

    int updateByExample(@Param("record") FileEntity record, @Param("example") FileEntityExample example);

    int updateByPrimaryKeySelective(FileEntity record);

    int updateByPrimaryKey(FileEntity record);
}