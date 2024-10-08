package com.example.demo.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                //参数的内容都是根据自己的项目自己起的
                title = "emos-api",
                description = "Emos管理系统的后端Java项目",
                version = "1.0"
//                author="a"
        )
)
//为Swagger整合JWT支持，项目没有令牌模块下面这个注解可以不写
//@SecurityScheme(
//        name = "Token",
//        type = SecuritySchemeType.HTTP,
//        bearerFormat = "JWT",
//        scheme = "bearer"
//)
public class SwaggerConfig {

}
