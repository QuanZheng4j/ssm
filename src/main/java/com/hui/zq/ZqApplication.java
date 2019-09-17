package com.hui.zq;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAutoConfiguration
@ServletComponentScan
@MapperScan("com.hui.zq.dao.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class ZqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZqApplication.class, args);
    }

}
