package com.snszyk.iiot.lim.quota.infrastructure.ports.mybatis.condition

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import io.ttyys.core.support.architecture.EnhanceMapper
import lombok.Data

@Data
@EnhanceMapper
class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;


    def condition1() {
        QueryWrapper<User> wrapper = new QueryWrapper()
        wrapper.eq("user_name", "Jack")
    }
}
