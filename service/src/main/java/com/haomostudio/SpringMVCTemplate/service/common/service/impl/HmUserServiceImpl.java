package com.haomostudio.SpringMVCTemplate.service.common.service.impl;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;
import com.haomostudio.SpringMVCTemplate.common.service.IHmUserService;
import com.haomostudio.SpringMVCTemplate.dao.impl.HmUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;





@Service("hmUserService")
public class HmUserServiceImpl implements IHmUserService {

	@Autowired
	private HmUserDao hmUserDao;
	
	@Override
	public HmUser selectOneByObject(HmUser HmUser){
		return hmUserDao.selectOneByObject(HmUser);
	}
	
	@Override
	public List<HmUser> selectListByObject(HmUser HmUser){
		return hmUserDao.selectListByObject(HmUser);
	}

	@Override
	public void insert(HmUser hmUser) {

	}

	@Override
	public void update(HmUser hmUser) {

	}

	
}
