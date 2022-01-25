import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	
	
	public List<Book> getBook(){
		
		List<Book> books=new ArrayList<>();
		
		books.add(new Book(1, "dsnfbvj", "dsfhj"));
		books.add(new Book(2, "fbvjk", "jgk"));
		books.add(new Book(3, "jfk", "vk"));
		books.add(new Book(4, "fbkj", "dbssfhj"));
		books.add(new Book(5, "lj", "wdsfhj"));
		books.add(new Book(6, "bdgvjk", "qdsfhj"));

		return books;
		
	}
}
