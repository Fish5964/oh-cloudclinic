package com.geeke.gen.dao;

import com.geeke.common.persistence.CrudDao;
import com.geeke.gen.entity.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统表字段控件DAO接口
 * @author lys
 * @version 2019-08-31
 */
@Mapper
public interface SchemaColumnDao extends CrudDao<GenTableColumn> {
	
}