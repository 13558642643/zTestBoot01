package cn.zxw.ztestboot.controller;

import cn.zxw.ztestboot.dao.UserMapper;
import cn.zxw.ztestboot.entity.User;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author : ZXW
 * @version : 1.0
 * @date : 2020-10-16 10:13
 * @Description : 测试接口
 */
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/testIndex")
    public String index(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("凉面面是^(*￣(oo)￣)^");
        stringBuilder.append("。嗯，他是的！");
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    @RequestMapping("/all")
    public JSONObject findAll(){
        List<User> userList = userMapper.getAllUser();
        JSONObject json =new JSONObject();
        json.put("data",userList);
        return json;
    }

    @RequestMapping("/addUser")
    public String addUser(HttpServletRequest req, HttpServletResponse res)  throws Exception{
        String name = "猪猪";
        int age = 18;
        User user = new User();
        user.setUserName(name);
        user.setUserAge(age);
        int num = userMapper.addUser(user);
        return  num+"";
    }


}
