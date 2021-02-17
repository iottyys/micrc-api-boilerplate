//package info.ttyy.frame.atomicservicedemo.infrastructure.graphql.book
//
//import com.graphql.spring.boot.test.GraphQLResponse
//import com.graphql.spring.boot.test.GraphQLTest
//import com.graphql.spring.boot.test.GraphQLTestTemplate
//import groovy.util.logging.Slf4j
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.extension.ExtendWith
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.context.SpringBootTest
//import org.springframework.test.context.junit.jupiter.SpringExtension
//
//@Slf4j
//@ExtendWith(SpringExtension.class)
//@GraphQLTest
////@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class BookMutationTest {
//
//    @Autowired
//    GraphQLTestTemplate template
//
//    @Test
//    void addBookTest() {
//        GraphQLResponse response = template.postForResource('graphql/add-book.graphql')
//        println response.get('$.data.bookMutation.addBook', BookWritten.class)
//    }
//}
