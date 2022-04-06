package SqlAssignment;

public class User {
	 private int id;
	    private String name;
	    private String deptAccess,teamAccess,officeAccess;
		public User user1;
		public User user2;
		public User user3;
		public User user4;
	  
	    public User(int id, String name, String deptAccess, String teamAccess, String officeAccess) {
			super();
			this.id = id;
			this.name = name;
			this.deptAccess = deptAccess;
			this.teamAccess = teamAccess;
			this.officeAccess = officeAccess;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", deptAccess=" + deptAccess + ", teamAccess=" + teamAccess
					+ ", officeAccess=" + officeAccess + "]";
		}
		public int getId() {
			return id;
	    	
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDeptAccess() {
			return deptAccess;
		}
		public void setDeptAccess(String deptAccess) {
			this.deptAccess = deptAccess;
		}
		public String getTeamAccess() {
			return teamAccess;
		}
		public void setTeamAccess(String teamAccess) {
			this.teamAccess = teamAccess;
		}
		public String getOfficeAccess() {
			return officeAccess;
		}
		public void setOfficeAccess(String officeAccess) {
			this.officeAccess = officeAccess;
		}
		public void setId(int id) {
			this.id = id;
		}
	    

}