package com.snszyk.iiot.lim.quota.domain.condition.vo;

import com.snszyk.iiot.lim.quota.domain.condition.repository.ConditionRepository;

import javax.validation.constraints.NotNull;

public class ConditionInfo {
    @NotNull
    private String name;
    @NotNull
    private String code;

    public void check(ConditionRepository repository) {
//        2 检查条件信息存在
        checkBlank();
//        3 排除重复，编码、名称
        exists(repository);
    }

    private void checkBlank(){

    }
    private void exists(ConditionRepository repository){
        if (repository.exists()) {
            throw new IllegalArgumentException("code or name exists");
        }
    }
}
