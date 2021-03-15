package info.ttyy.frame.atomicservicedemo.algo

import io.ttyys.algo.AlgorithmType
import io.ttyys.algo.springboot.EnableDataSupport
import algo.text.Message
import algo.text.Similarity
import org.apache.avro.ipc.Transceiver
import org.apache.avro.ipc.netty.NettyTransceiver
import org.apache.avro.ipc.specific.SpecificRequestor
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

    @Test
    void test222() {
        Transceiver t = new NettyTransceiver(new InetSocketAddress("127.0.0.1", 22222));
        Similarity proxy = SpecificRequestor.getClient(Similarity.class, t);

        Message message = new Message()
        message.setFrom("123")
        message.setTo("456")
        message.setBody("abc")

        String m = proxy.send(message);
        println m
        String m1 = proxy.send(message);
        println m1
    }
}
