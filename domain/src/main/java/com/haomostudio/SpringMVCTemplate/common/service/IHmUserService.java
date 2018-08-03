package com.haomostudio.SpringMVCTemplate.common.service;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author wugz
 * @email wugz1@yusys.com.cn
 * @date 2018-08-02 19:40:15
 */
public interface IHmUserService {
	
	HmUser selectOneByObject(HmUser HmUser);
	
	List<HmUser> selectListByObject(HmUser HmUser);
		
	void insert(HmUser hmUser);
	
	void update(HmUser hmUser);
	
}
