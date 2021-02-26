package com.snszyk.iiot.lim.quota.application.condretrieve

import io.ttyys.core.support.architecture.EnhanceService
import io.ttyys.core.support.camel.Execution
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@EnhanceService
interface CondRetrieveService {
    @Transactional
    @Execution(serviceEndpoints = "direct:start")
    def exec(input)
}

@EnhanceService
interface CondSearchService {
    @Transactional
    def exec(input)
}

@EnhanceService
interface CondFilterService {
    def exec(input)
}

@Component
@Primary
class CondRetrieveServiceImpl implements CondRetrieveService {
    String exec(input) {
    }
}
