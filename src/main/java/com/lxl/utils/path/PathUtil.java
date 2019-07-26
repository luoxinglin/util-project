package com.lxl.utils.path;

import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created By IDEA
 *
 * @Title PathUtil
 * @Description:获取springboot项目根路径工具类
 * @Team: 电子科技大学自动化研究所
 * @Author: 罗星林
 * @Date: 2019年07月26日 9:22
 * @Version V1.0
 */
@Component
public class PathUtil {

    /**
    * @return: java.lang.String
    * @Description:获取springboot项目工程绝对路径-测试环境使用
    * @Author: 罗星林
    * @date: 2019/7/26
    * @param: [request]
    */
    public static String getRoot() {
        File file = null;
        try {
            file = new File(ResourceUtils.getURL("classpath:").getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String root = file.getParentFile().getParentFile().getPath();
        return root;
    }

    /**
    * @return: java.lang.String
    * @Description:获取发布后的jar当前路径-部署使用
    * @Author: 罗星林
    * @date: 2019/7/26
    * @param: []
    */
    public static String getJarRoot(){
        ApplicationHome home = new ApplicationHome(PathUtil.class);
        File jarFile = home.getSource();
        return jarFile.getParentFile().getPath();
    }

}
