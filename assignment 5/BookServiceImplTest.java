package happybeginning;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookServiceImplTest {
	private BookDao dao;
	private BookServiceImpl bookService;
	@BeforeEach
	void setUp() throws Exception {
dao=mock(BookDao.class);
		
		List<String> books=Arrays.asList("java","rich dad poor dad","java adv");
		
		when(dao.getBooks()).thenReturn(books);
		
		bookService=new BookServiceImpl();
		bookService.setBookDao(dao);
	}
	}

	@AfterEach
	void tearDown() throws Exception {
		dao=null;
		bookService=null;
	}
	

	@Test
	void test() {
		assertEquals(2, BookService.getBooks("java").size());
		fail("Not yet implemented");
	}

}
