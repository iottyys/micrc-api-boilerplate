package com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condretrieve.market

import com.snszyk.iiot.lim.quota.application.condretrieve.CondRetrieveService
import com.snszyk.iiot.lim.quota.domain.condition.ConditionRetrieval
import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.kickstart.tools.GraphQLQueryResolver

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CondRetrieveQueryResolver implements GraphQLQueryResolver {
    String testQuery() {
        println 'condition retrieve for market service belong to query'
        'condition retrieve for market service belong to query'
    }

    @Autowired
    private CondRetrieveService service

    List<ConditionRetrieval> retrieve(input) {
        println service
        List<ConditionRetrieval> retVal = service.exec(input)
        return new ArrayList<ConditionRetrieval>(0)
    }
}

@Component
class CondRetrieveMutationResolver implements GraphQLMutationResolver {}
