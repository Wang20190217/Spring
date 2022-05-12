package cn.curleyg.wang.factory;

import cn.curleyg.wang.service.IAccountService;
import cn.curleyg.wang.service.impl.AccountServiceImpl;

import java.util.Date;

/**
 * 城南花已开<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2022/5/12 06:23 <br>
 * @Author: Wang
 */
public class InstanceFactory {
    public IAccountService createAccountService(){
        return new AccountServiceImpl("wang",18,new Date());
    }
}
