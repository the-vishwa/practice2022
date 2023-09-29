package serializable_pro;

import java.io.IOException;
import java.io.Externalizable;
import java.io.ObjectOutput;
import java.io.ObjectInput;
//import java.io.Serializable;

public class Employee implements Externalizable {
	private Integer empId;
	private String name;
	private String companyName;

	public Employee() {
	}

	public Employee(Integer empId, String name, String companyName) {
		super();
		this.empId = empId;
		this.name = name;
		this.companyName = companyName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", companyName=" + companyName + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//out.writeObject(empId);
		out.writeObject(name);
		out.writeObject(companyName);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		//Integer id =(Integer)in.readObject();
		String str = (String)in.readObject();
		String str1 = (String)in.readObject();
		//System.out.println(id);
		System.out.println("👋 Hi i am👉" +  str);
		System.out.println("Company name👉" +  str1);
	}

}

//		System.out.println(i);