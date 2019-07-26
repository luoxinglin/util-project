package com.lxl.utils.controller;

import com.lxl.utils.path.PathUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By IDEA
 *
 * @Title PathController
 * @Description:获取项目磁盘路径测试类
 * @Team: 电子科技大学自动化研究所
 * @Author: 罗星林
 * @Date: 2019年07月26日 9:33
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "/test")
public class PathController {


    @GetMapping("/getJarRoot")
    public String testGetJarRoot() {
        return PathUtil.getJarRoot();
    }

    @GetMapping(value = "/getRoot")
    public String testGetRoot() {
        return PathUtil.getRoot();
    }
}
