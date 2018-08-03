package com.haomostudio.SpringMVCTemplate;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;
import com.haomostudio.SpringMVCTemplate.common.service.IHmUserService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/8/3.
 */
public  class login {
    private IHmUserService hmUserService;
    Map<Object,String> resultMap=new HashMap<>();
    //传输过来的参数
    HmUser hmUser;
    public Map<Object,String> loginin(HmUser hmUser,Map resultMap){
        HmUser hmUserNew=new HmUser();
        hmUserNew.setLoginid(hmUser.getLoginid());
        hmUserNew.setPassword(hmUser.getPassword());
        try{
            hmUserNew=hmUserService.selectOneByObject(hmUserNew);
        }catch(Exception e){
        }
        if(hmUserNew!=null){

        }
        return resultMap;
    }
}
