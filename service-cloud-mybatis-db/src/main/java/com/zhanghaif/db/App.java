package com.zhanghaif.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableScheduling
@MapperScan("org.wcloud.db.task.mapper")
public class App 
{
    public static void main( String[] args )
    {
//    	org.wcloud.db.task.dao
    	SpringApplication.run(App.class, args);
//        System.out.println( "Hello World!" );
    }
}
