package info.ttyy.frame.atomicservicedemo.infrastructure.graphql

import graphql.kickstart.tools.GraphQLQueryResolver
import info.ttyy.frame.atomicservicedemo.infrastructure.graphql.book.BookQuery
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class RootQueryResolver implements GraphQLQueryResolver {
    BookQuery bookQuery

    @Autowired
    RootQueryResolver(BookQuery bookQuery) {
        this.bookQuery = bookQuery
    }

}
