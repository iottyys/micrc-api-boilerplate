package com.snszyk.iiot.lim.quota.application.condretrieve

import org.springframework.transaction.annotation.Transactional

interface CondRetrieveService {
    @Transactional
    def exec(input)
}

interface CondSearchService {
    def exec(input)
}

interface CondFilterService {
    def exec(input)
}
