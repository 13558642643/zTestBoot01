package cn.zxw.ztestboot.dao;

import cn.zxw.ztestboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : ZXW
 * @version : 1.0
 * @date : 2020-10-16 14:40
 * @Description :
 */
@Service
@Mapper
public interface UserMapper {
    int addUser(User user);

    List<User> getAllUser();
}
