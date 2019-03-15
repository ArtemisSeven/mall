package com.mall.controller.portal;

import com.mall.common.Const;
import com.mall.common.ResponseCode;
import com.mall.common.ServerResponse;
import com.mall.pojo.User;
import com.mall.vo.CartVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/test/")
public class TestController {
    public static final Logger logger=LoggerFactory.getLogger(TestController.class.getName());

    @RequestMapping("test.do")
    @ResponseBody
    public String list(){
        logger.info("logger's info");
        logger.warn("logger's warn");
        logger.error("logger's error");
        return "hello";
    }
}
