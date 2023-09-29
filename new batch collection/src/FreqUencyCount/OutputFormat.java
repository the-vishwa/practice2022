package FreqUencyCount;

public class OutputFormat {

	Integer element;
	Integer count;

	public OutputFormat() {
		super();
	}

	public OutputFormat(Integer element, Integer count) {
		super();
		this.element = element;
		this.count = count;
	}

	public Integer getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "OutputFormat [element=" + element + ", count=" + count + "]";
	}

}
