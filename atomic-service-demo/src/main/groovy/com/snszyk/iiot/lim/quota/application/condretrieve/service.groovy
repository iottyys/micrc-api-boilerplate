package com.snszyk.iiot.lim.quota.application.condretrieve

import io.ttyys.core.support.camel.ApplicationService
import io.ttyys.core.support.camel.Execution
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@ApplicationService
interface CondRetrieveService {
    @Transactional
    @Execution(value = "direct:start", input = "", output = "")
    def exec(input)
}

@ApplicationService
interface CondSearchService {
    @Transactional
    def exec(input)
}

@ApplicationService
interface CondFilterService {
    def exec(input)
}

//@Component
//@Primary
//class CondRetrieveServiceImpl implements CondRetrieveService {
//    String exec(String input) {
//    }
//}
