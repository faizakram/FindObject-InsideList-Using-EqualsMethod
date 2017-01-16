package com.InsideList.Object;

public class User {
	private String firstName;
		    private String lastName;
		    private String email;
		    
		    public User(String firstName, String lastName, String email) {
		        super();
		        this.firstName = firstName;
		        this.lastName = lastName;
		        this.email = email;
		    }
		    public User(String email)
		    {
		    	this.email = email;
		    }
		    
		    @Override
		    public boolean equals(Object obj) {
		        return (this.email.equals(((User) obj).email));
	
		    }
		    
		   /* 
		    * this way you can find all object validation and get data
		    * @Override
		    public boolean equals(Object obj) {
		        return (this.firstName.equals(((User) obj).firstName)
		                && this.lastName.equals(((User) obj).lastName) && this.email
		                    .equals(((User) obj).email));
	
		    }*/
		    
			@Override
			public String toString() {
				return "User [firstName=" + firstName + ", lastName="
						+ lastName + ", email=" + email + "]";
			}
		    
}
