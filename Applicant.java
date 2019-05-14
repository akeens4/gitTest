	
	
	public class Applicant {

		private String firstName,lastName, initial;
		private int age;
		private boolean isGraduate;
		private String experience;
		private boolean isChosen;
		private String levelOfEducation;
		private String location;
		private boolean isFirstBatch;
		private long phoneNumber;
		private String email;
		private boolean isReadyForOneYear;

		public void setName(String firstName, String lastName, String initial) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.initial = initial;
		} 
		public String getName() {
			return firstName + " " + lastName + " " + initial + "!";
		}
		public void setAge(int age) {
			this.age = age;
		}
		public  int getAge() {
			return age;
		}
		public void setIsGraduate() {
			this.isGraduate = true;
		}
		public boolean getIsGraduate() {
			return isGraduate;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getLocation() {
			return location;
		}
		public void setEmailOfApplicant(String email) {
			this.email = email;
		}
		public String requestEmailOfApplicant() {
			return email;
		}
		public void setIsChosen() {
			this.isChosen = true;
		}
		public boolean getIsChosen() {
			return  isChosen;
		} 
		

		//Declaring the main Class for Code Execution
		public static void main(String[] args) {
			Applicant gbenga = new Applicant(); // Instantiating the Applicant Class			
			Applicant fiwasewa = new Applicant();
			Applicant solagbade = new Applicant();
			Applicant okoroafor = new Applicant();
			Applicant mustapha = new Applicant();
			Applicant godwin = new Applicant();
			Applicant ismail = new Applicant();

			//Setting data for each methods
			gbenga.setName("Adebileje","Gbenga","AO");
			gbenga.setAge(28);
			gbenga.setIsGraduate();
			gbenga.setPhoneNumber(81_7627_41);
			gbenga.setLocation("Ihedinmbu Street,Off Alaafia,Irawo, Lagos State");
			gbenga.setEmailOfApplicant("gadebileje@gmail.com");
			gbenga.setIsChosen();


			fiwasewa.setName("Omokobolaje","Fiwasewa","S");
			fiwasewa.setAge(24);
			fiwasewa.setIsGraduate();
			fiwasewa.setPhoneNumber(22_3567_32);
			fiwasewa.setLocation("Odegbami Street, Okanlawon Avenue,Mushin, Lagos State");
			fiwasewa.setEmailOfApplicant("fiwasewa32ade@gmail.com");
			fiwasewa.setIsChosen();
		

			System.out.print("\n");
			System.out.print("\n");		
			System.out.print(gbenga.getName());
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(gbenga.getLocation());
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(gbenga.getAge());
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(gbenga.requestEmailOfApplicant());
			System.out.print("\n");
			System.out.print("\n");
						
	
			System.out.print("\n");
			System.out.print("\n");		
			System.out.print(fiwasewa.getName());
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(fiwasewa.getLocation());
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(fiwasewa.getAge());
			System.out.print("\n");
			System.out.print("\n");
			System.out.print(fiwasewa.requestEmailOfApplicant());
			System.out.print("\n");
			System.out.print("\n");
	

		}

	}