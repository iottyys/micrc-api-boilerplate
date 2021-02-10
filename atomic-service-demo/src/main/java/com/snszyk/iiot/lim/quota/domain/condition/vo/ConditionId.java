package com.snszyk.iiot.lim.quota.domain.condition.vo;

import com.snszyk.iiot.lim.quota.domain.condition.repository.ConditionRepository;
import lombok.Data;

@Data
public class ConditionId {
    private String id;

    public ConditionId(ConditionRepository repository) {
        this.id = repository.generateId();
    }
}
