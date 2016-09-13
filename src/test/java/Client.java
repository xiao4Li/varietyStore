import com.funi.service.UserInfoCRUDImpl;
import com.funi.support.CRUD;
import com.funi.tools.LogEnhancer;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/9/13.
 */
public class Client {
    public static void main(String[] args){
        UserInfoCRUDImpl userInfoCRUD = new UserInfoCRUDImpl();
        CRUD userInfoCRUDLogEnhance = (CRUD) Proxy.newProxyInstance(Client.class.getClassLoader(),
                UserInfoCRUDImpl.class.getInterfaces(),
                new LogEnhancer(userInfoCRUD));

        userInfoCRUDLogEnhance.add();
        userInfoCRUDLogEnhance.delete();
        userInfoCRUDLogEnhance.update();
        userInfoCRUDLogEnhance.select();
    }
}
