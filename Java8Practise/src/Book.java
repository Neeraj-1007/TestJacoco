
public class Book {

	private int id;

	private String name;

	private String page;

	private String auther;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Book(int id, String name, String page) {
		this.id = id;
		this.name = name;
		this.page = page;
	}

	public Book() {
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", page=" + page + "]";
	}

}
