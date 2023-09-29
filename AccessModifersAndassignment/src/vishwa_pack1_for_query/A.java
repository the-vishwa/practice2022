package vishwa_pack1_for_query;

public class A {
	// The field fName can only set one of public / protected / private
   //Watchpoint:A [access and modification] - fName line no 6 
        private static String fName; //public require.? //
        private String lname;                 // same here
        public String stateName;                   
        public static String cityName;             
	                                            
	A() {
	}

	public A(String lname, String stateName) {
		super();
		this.lname = lname;
		this.stateName = stateName;
		
	}
	public void m1(){System.out.println("instance method");}

    public static void m2(){System.out.println("static method");}
    
	public static String getfName() {
		return fName;
	}

	public static void setfName(String fName) {
		A.fName = fName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

//	public String getStateName() {
//		return stateName;
//	}
//
//	public void setStateName(String stateName) {
//		this.stateName = stateName;
//	}

//	public static String getCityName() {
//		return cityName;
//	}
//
//	public static void setCityName(String cityName) {
//		A.cityName = cityName;     //Cannot make a static reference to the non-static field A.cityName
//	}

}
