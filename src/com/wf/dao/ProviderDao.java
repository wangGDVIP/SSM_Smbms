package com.wf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wf.entity.Provider;

public interface ProviderDao {
	
	/**
	 * 模糊查询 分页
	 * @param queryProCode
	 * @param queryProName
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public List<Provider> findProviders(@Param("queryProCode")String queryProCode,@Param("queryProName")String queryProName,
			@Param("pageIndex")Integer pageIndex,@Param("pageSize")Integer pageSize);
	
	/**
	 * 模糊查询总记录数
	 * @param queryProCode
	 * @param queryProName
	 * @return
	 */
	public Integer getProvidCount(@Param("queryProCode")String queryProCode,@Param("queryProName")String queryProName);
	
	/**
	 * 新增供应商
	 * @param provider
	 * @return
	 */
	public Integer addProvider(Provider provider);
	
	/**
	 * 根据Id 查询供应商
	 * @param id
	 * @return
	 */
	public Provider findProById(Integer id);
	
}
