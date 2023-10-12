package com.ashtime99.hello.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author xiayichao
 * @version 1.0
 */
@Configuration
@EnableSwagger2WebMvc
@EnableKnife4j
public class SwaggerConfiguration {

    @Bean
    public Docket defaultApi() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("3.默认接口").select()
            .apis(RequestHandlerSelectors.basePackage("com.ashtime99.hello.controller")).paths(PathSelectors.any())
            .build();
        // .securityContexts(CollectionUtil.newArrayList(securityContext()))
        // .securitySchemes(CollectionUtil.newArrayList(apiKey()));
        //.extensions(openApiExtensionResolver.buildExtensions("3.默认接口"));
        //.extensions(openApiExtensionResolver.buildSettingExtensions())
        //.securityContexts(CollectionUtil.newArrayList(securityContext()))
        //.securitySchemes(CollectionUtil.newArrayList(apiKey()));
        // .securitySchemes(securitySchemes());
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            //.title("swagger-bootstrap-ui-demo RESTful APIs")
            .description("# swagger-bootstrap-ui-demo RESTful APIs").termsOfServiceUrl("http://www.xx.com/")
            //.contact("xx@qq.com")
            .version("").build();
    }

}