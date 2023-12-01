package com.bharath.cnproject;

public class SalesDepartment implements CustomerCare {

	 private String department= "Sales Department";
	    private String customerName;
	    private String issue; 
		@Override
		public String getDepartment() {
			// TODO Auto-generated method stub
			return this.department;
		}

		@Override
		public void getService() {
			// TODO Auto-generated method stub
			System.out.println("Welcome "+this.customerName+", You have reached the "+this.department);
		}

		@Override
		public void setCustomerName(String name) {
			// TODO Auto-generated method stub
			this.customerName = name;
		}

		@Override
		public void setProblem(String problem) {
			// TODO Auto-generated method stub
			this.issue = problem;
		}

		@Override
		public void getProblem() {
			// TODO Auto-generated method stub
			System.out.println("Dear "+this.customerName+", Your issue:"+this.issue+" is registered with "+this.department);
		}

}
