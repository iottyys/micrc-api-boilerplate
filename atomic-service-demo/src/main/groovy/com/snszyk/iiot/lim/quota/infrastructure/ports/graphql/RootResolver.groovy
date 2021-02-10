package com.snszyk.iiot.lim.quota.infrastructure.ports.graphql

import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.kickstart.tools.GraphQLQueryResolver
import graphql.kickstart.tools.GraphQLSubscriptionResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class RootQueryResolver implements GraphQLQueryResolver {
    @Autowired
    MarketQueryResolver marketQuery;
}

@Component
class RootMutationResolver implements GraphQLMutationResolver {
    @Autowired
    MarketMutationResolver marketMutation;
}

@Component
class RootSubscriptionResolver implements GraphQLSubscriptionResolver {}
