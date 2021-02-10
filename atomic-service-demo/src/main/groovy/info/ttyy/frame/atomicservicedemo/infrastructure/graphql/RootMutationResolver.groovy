package info.ttyy.frame.atomicservicedemo.infrastructure.graphql

import graphql.kickstart.tools.GraphQLMutationResolver
import info.ttyy.frame.atomicservicedemo.infrastructure.graphql.book.BookMutation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class RootMutationResolver implements GraphQLMutationResolver {
    BookMutation bookMutation

    @Autowired
    RootMutationResolver(BookMutation bookMutation) {
        this.bookMutation = bookMutation
    }

}
