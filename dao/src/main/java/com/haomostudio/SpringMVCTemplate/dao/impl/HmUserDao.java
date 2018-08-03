package com.haomostudio.SpringMVCTemplate.dao.impl;
import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;

import java.util.List;

/**
 * 
 * 
 * @author wugz
 * @email wugz1@yusys.com.cn
 * @date 2018-08-02 19:40:15
 */
public interface HmUserDao {

    HmUser selectOneByObject(HmUser HmUser);
	
	List<HmUser> selectListByObject(HmUser HmUser);
		
	void insert(HmUser hmUser);
	
	void update(HmUser hmUser);
}
