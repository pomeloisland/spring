package com.pomeloisland.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价与<bean id="user" class="com.pomeloisland.pojo.User"/>
//@Component 组件
@Component
//@Scope("singleton") 标注为单例模式
//@Scope("prototype") 标注为原型模式
public class User {


    public String name;

    //相当于<property name="name" value="柚屿"/>
    @Value("柚屿")
    public void setName(String name) {
        this.name = name;
    }
}
