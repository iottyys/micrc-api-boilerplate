package info.ttyy.frame.atomicservicedemo.algo

import example.proto.Message
import io.ttyys.algo.AlgorithmType
import io.ttyys.algo.springboot.EnableDataSupport
import org.apache.camel.EndpointInject
import org.apache.camel.ProducerTemplate
import org.apache.camel.test.spring.junit5.CamelSpringBootTest

import org.junit.jupiter.api.Test
import org.springframework.boot.autoconfigure.SpringBootApplication

@CamelSpringBootTest
@SpringBootApplication(scanBasePackages = "io.ttyys.algo")
@EnableDataSupport
class AlgoTest {

    @EndpointInject(property = "point")
    private ProducerTemplate producer;

    String getPoint() {
        AlgorithmType.SIMILARITY.endpoint()
    }

    @Test
    void test111() {
        Message message = new Message()
        message.setFrom("123")
        message.setTo("456")
        message.setBody("abc")
        Message resp = producer.requestBody(message, Message.class)
        println resp
    }
}
