package com.snszyk.iiot.lim.quota.infrastructure.ports.graphql

import com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condmaintain.market.CondMaintainMutationResolver
import com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condmaintain.market.CondMaintainQueryResolver
import com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condretrieve.market.CondRetrieveMutationResolver
import com.snszyk.iiot.lim.quota.infrastructure.ports.graphql.condretrieve.market.CondRetrieveQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MarketQueryResolver {
    @Autowired
    CondMaintainQueryResolver condMaintain
    @Autowired
    CondRetrieveQueryResolver condRetrieve
}

@Component
class MarketMutationResolver {
    @Autowired
    CondMaintainMutationResolver condMaintain
    @Autowired
    CondRetrieveMutationResolver condRetrieve
}
