package com.snszyk.iiot.lim.quota.infrastructure.ports.graphql

import com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condmaintain.market.CondMaintainMutationResolver
import com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condmaintain.market.CondMaintainQueryResolver
import com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condretrieve.market.CondRetrieveMutationResolver
import com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condretrieve.market.CondRetrieveQueryResolver
import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MarketQueryResolver implements GraphQLQueryResolver {
    @Autowired
    CondMaintainQueryResolver condMaintain
    @Autowired
    CondRetrieveQueryResolver condRetrieve
}

@Component
class MarketMutationResolver implements GraphQLMutationResolver {
    @Autowired
    CondMaintainMutationResolver condMaintain
    @Autowired
    CondRetrieveMutationResolver condRetrieve
}
