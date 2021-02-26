package com.snszyk.iiot.lim.quota.infrastructure.ports.mybatis.condition

import com.snszyk.iiot.lim.quota.domain.condition.ConditionRetrieval
import com.snszyk.iiot.lim.quota.domain.condition.repository.ConditionRetrievalRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ConditionRetrievalRepositoryImpl implements ConditionRetrievalRepository {
    @Autowired
    UserMapper mapper

    @Override
    List<ConditionRetrieval> list() {

    }

    @Override
    List<ConditionRetrieval> filter(ConditionRetrieval filter) {
        return null
    }

    @Override
    List<ConditionRetrieval> searchBy() {
        return null
    }
}
