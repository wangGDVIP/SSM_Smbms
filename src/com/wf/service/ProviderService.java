package com.wf.service;

import java.util.List;

import com.wf.entity.Provider;

public interface ProviderService {

	/**
	 * 模糊查询 分页
	 * @param queryProCode
	 * @param queryProName
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public List<Provider> findProviders(String queryProCode,String queryProName,
			Integer pageIndex,Integer pageSize);
	
	/**
	 * 模糊查询总记录数
	 * @param queryProCode
	 * @param queryProName
	 * @return
	 */
	public Integer getProvidCount(String queryProCode,String queryProName);
	
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
