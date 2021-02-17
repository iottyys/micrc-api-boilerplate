package com.snszyk.iiot.lim.quota.infrastructure.ports.graphql

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ObjectNode
import com.graphql.spring.boot.test.GraphQLResponse
import com.graphql.spring.boot.test.GraphQLTest
import com.graphql.spring.boot.test.GraphQLTestTemplate

import io.ttyys.core.support.springboot.SpringBootAutoConfiguration
import org.apache.camel.spring.boot.CamelAutoConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Import
import spock.lang.Specification

@GraphQLTest
@Import([CamelAutoConfiguration, SpringBootAutoConfiguration])
class RootQueryResolverTest extends Specification {

    @Autowired
    GraphQLTestTemplate template

    def "test"() {
        ObjectNode var1 = new ObjectMapper().createObjectNode()
        ObjectNode var = new ObjectMapper().createObjectNode()
        var.put("size", 1)
        var.put("offset", 0)
        var1.set("input", var)
        expect: "tttt"
        GraphQLResponse response = template.perform("graphql/test.graphql", var1)
        println response
    }
}

class RootMutationResolverTest {}

class RootSubscriptionResolverTest {}
