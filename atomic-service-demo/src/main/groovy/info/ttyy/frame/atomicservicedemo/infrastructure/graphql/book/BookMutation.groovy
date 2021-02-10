package info.ttyy.frame.atomicservicedemo.infrastructure.graphql.book

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Component

@Slf4j
@Component
class BookMutation {
    BookWritten addBook(String bookName, String authorName) {
        log.info('===================================')
        new BookWritten()
    }
}

class BookWritten {
    String id = UUID.randomUUID().toString()
    String bookName = 'test-book-written'
    AuthorWritten author = new AuthorWritten()

    @Override
    String toString() {
        return "BookWritten{" +
            "id='" + id + '\'' +
            ", bookName='" + bookName + '\'' +
            ", author=" + author +
            '}'
    }
}

class AuthorWritten {
    String id = UUID.randomUUID().toString()
    String name = 'test-author-written'

    @Override
    String toString() {
        return "AuthorWritten{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}'
    }
}
