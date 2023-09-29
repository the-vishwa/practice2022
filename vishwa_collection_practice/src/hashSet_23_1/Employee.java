package hashSet_23_1;


public class Employee {
		private Integer id;
		private String name;
		private String companyName;
		public Employee() {}

		public Employee(Integer id, String name, String companyName) {
			super();
			this.id = id;
			this.name = name;
			this.companyName = companyName;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
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
			return "Employee [id=" + id + ", name=" + name + ", companyName=" + companyName + "]";
		}

		@Override
			public int hashCode() {
				return this.getId().hashCode()
				+this.getName().hashCode()
				+this.getCompanyName().hashCode();
			}
		
		@Override
			public boolean equals(Object obj) {
				Employee e=(Employee)obj;
			if(this.getName().equals(e.name)&&this.getId().equals(e.id)&&this.getCompanyName().equals(e.companyName)) {
				return true;
				
			}
			return false;
			}
		
		
}
