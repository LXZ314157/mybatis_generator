package cn.com.lxz.mybatis.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.com.lxz.mybatis.generator.dao")
public class MybatisGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorApplication.class, args);
    }

}
