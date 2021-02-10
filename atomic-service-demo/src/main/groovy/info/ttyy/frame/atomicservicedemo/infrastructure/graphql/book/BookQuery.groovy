package info.ttyy.frame.atomicservicedemo.infrastructure.graphql.book

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Component

@Slf4j
@Component
class BookQuery {

    BookPaged books() {
        new BookPaged()
    }

    BookDTO findById() {
        new BookDTO()
    }
}

class BookPaged {
    List<BookDTO> books = new ArrayList<>()
    int offset = 0;
    int size = 10;
}

class BookDTO {
    String id = UUID.randomUUID().toString()
    String bookName = 'test-book'
    AuthorDTO author = new AuthorDTO()
}

class AuthorDTO {
    String id = UUID.randomUUID().toString()
    String name = 'test-author'
}
