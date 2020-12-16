package com.hlh.springboot.bean;

import lombok.Data;
// import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
// import org.springframework.validation.annotation.Validated;
// import org.hibernate.validator.constraints.Email;


// import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 *
 */

// @PropertySource(value = {"classpath:person.properties"})
@Data
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
   // @Value("${person.last-name}")
    //@Email
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    // @Value("${person.maps}")
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
