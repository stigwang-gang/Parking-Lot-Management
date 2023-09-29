package com.ht.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.ht")
@PropertySource("classpath:jdbc.properties")
public class configration {

}
