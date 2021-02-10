package com.snszyk.iiot.lim.quota.domain.condition.repository;

import com.snszyk.iiot.lim.quota.domain.condition.ConditionRetrieval;

import java.util.List;

public interface ConditionRetrievalRepository {
    List<ConditionRetrieval> list();
    List<ConditionRetrieval> filter(ConditionRetrieval filter);
    List<ConditionRetrieval> searchBy();
}
