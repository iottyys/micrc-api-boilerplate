package com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condmaintain.market

import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class CondMaintainMutationResolver {
    String testMutation(String input) {
        println 'condition maintain for market belong to mutation'
        'condition maintain for market belong to mutation'
    }
}

@Component
class CondMaintainQueryResolver {}
