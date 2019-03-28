package cn.itsource.yangou.web.controller;


import cn.itsource.plat.domain.User;
import cn.itsource.yangou.common.ResultAjax;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResultAjax Login(@RequestBody User user) {
        if (user != null && !StringUtils.isEmpty(user.getUsername()) && !StringUtils.isEmpty(user.getPassword())) {
            if("yanqinag".equals(user.getUsername())&& "xiaohai".equals(user.getPassword())){
                return ResultAjax.me().setMesg("恭喜你登录成功");
            }else {
                return ResultAjax.me().setSuccess(false).setMesg("登录失败你个dsb");
            }
        }
        return ResultAjax.me().setSuccess(false).setMesg("用户名或者密码错误");
    }
}
