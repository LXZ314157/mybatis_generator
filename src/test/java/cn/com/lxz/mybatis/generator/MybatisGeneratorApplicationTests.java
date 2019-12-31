package cn.com.lxz.mybatis.generator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisGeneratorApplicationTests {

    @Test
    public void getCode(){
        //生成model和mapper
        CodeGeneratorUtil.genModelAndMapper("user","User");

        //生成service和serviceImpl
        CodeGeneratorUtil.genService("user","User");

        //生成Controller
        CodeGeneratorUtil.genController("user","User");
    }

}
