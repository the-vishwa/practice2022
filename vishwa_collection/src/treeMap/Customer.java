package treeMap;

public class Customer implements Comparable<Customer> {
	private Integer custId;
	private String name;

	public Customer() {
	}

	public Customer(Integer custId, String name) {
		super();
		this.custId = custId;
		this.name = name;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setRollNum(Integer custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.custId.hashCode() + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Customer s = (Customer) obj;
		if (this.getName().equals(s.name) && this.getCustId().equals(s.custId)) {
			return true;

		}
		return false;
	}

	@Override
	public int compareTo(Customer o) {
		Integer c1 = this.getCustId();
		Integer c2 = o.getCustId();
		if (c1 < c2) {
			return -1;
		} else {
			if (this.equals(o)) {
				return 0;
			}
			return 1;
		}

	}

}
