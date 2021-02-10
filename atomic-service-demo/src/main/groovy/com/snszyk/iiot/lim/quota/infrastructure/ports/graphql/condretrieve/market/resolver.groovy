package com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condretrieve.market

import com.snszyk.iiot.lim.quota.application.condretrieve.CondFilterService
import com.snszyk.iiot.lim.quota.domain.condition.ConditionRetrieval
import io.ttyys.core.Execution
import org.apache.camel.Produce
import org.springframework.stereotype.Component

@Component
class CondRetrieveQueryResolver {
    String testQuery() {
        println 'condition retrieve for market service belong to query'
        'condition retrieve for market service belong to query'
    }

    @Execution(CondFilterService.class)
    @Produce
    List<ConditionRetrieval> retrieve(input) {
        println input
        return new ArrayList<ConditionRetrieval>(0)
    }
}

@Component
class CondRetrieveMutationResolver {}
