package classes.object.programs;



class classes{
	String name;
	String purpose;
	
	
	public classes() {
		super();
	}
	public classes(String name,String purpose) {
		this.name=name;
		this.purpose=purpose;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public void classDescription() {
		System.out.println(this.name+" is a class  and it is use for "+purpose);
	}	
}
public class CreateClassObject {
	public static void main(String[] args) {
		classes c1=new classes();
		c1.name="Farmer";
		c1.purpose="define a person who is farmering";
		c1.classDescription();
		
	}

}
