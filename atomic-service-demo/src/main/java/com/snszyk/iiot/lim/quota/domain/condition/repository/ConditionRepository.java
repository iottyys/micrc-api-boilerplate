package com.snszyk.iiot.lim.quota.domain.condition.repository;

import com.snszyk.iiot.lim.quota.domain.condition.Condition;
import com.snszyk.iiot.lim.quota.domain.condition.vo.ConditionId;

import java.util.Set;

public interface ConditionRepository {

    String generateId();

    Condition fromId(ConditionId id);

    boolean exists();

    void saveEnumValues(Set<String> values);

    void maintainInfo(Condition condition);

    void save(Condition condition);
}
