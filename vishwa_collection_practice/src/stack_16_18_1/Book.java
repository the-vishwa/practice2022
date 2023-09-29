package stack_16_18_1;

public class Book {
	private Integer bId;
	private String name;

	public Book(Integer bId, String name) {
		super();
		this.bId = bId;
		this.name = name;
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", name=" + name + "]";
	}

}
