package com.company.project;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.bstek.ureport.console.UReportServlet;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import javax.servlet.Servlet;
import java.net.InetAddress;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@ImportResource ("classpath:ureport-console-context.xml") // 加载ureport对应的xml配置文件
@MapperScan("com.company.project.mapper")
@Slf4j
public class CompanyProjectApplication {

    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext application = SpringApplication.run(CompanyProjectApplication.class, args);

        Environment env = application.getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Login: \thttp://{}:{}/login\n\t" +
                        "Doc: \thttp://{}:{}/doc.html\n" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }

    /**
     * ureport2报表Servlet配置
     */
    @Bean
    public ServletRegistrationBean<Servlet> ureport2Servlet(){
        return new ServletRegistrationBean<> (new UReportServlet (), "/ureport/*");
    }


}
