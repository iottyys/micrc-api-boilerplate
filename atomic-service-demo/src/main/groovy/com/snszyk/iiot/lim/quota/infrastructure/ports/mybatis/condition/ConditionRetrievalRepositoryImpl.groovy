package com.snszyk.iiot.lim.quota.infrastructure.ports.mybatis.condition

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.snszyk.iiot.lim.quota.domain.condition.ConditionRetrieval
import com.snszyk.iiot.lim.quota.domain.condition.repository.ConditionRetrievalRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ConditionRetrievalRepositoryImpl implements ConditionRetrievalRepository {
    @Autowired
    BaseMapper userMapper
    @Autowired
    UserMapperbak mapperbak

    @Override
    List<ConditionRetrieval> list() {
        println userMapper.selectMaps()
        println mapperbak.selectList()
        return null
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
