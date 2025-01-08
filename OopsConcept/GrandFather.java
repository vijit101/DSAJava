
class Solution {
	
	public static void main(String args[]) {
		
		Son Eldest = new Son("Suresh", "Ramesh", "Saurabh");
		Eldest.printName();
	}
}

class GrandFather{
	public String grandFatherName;

    public GrandFather(String gFatherName) {
		this.grandFatherName = gFatherName;
    }

	public GrandFather(){}

}

class Father extends  GrandFather{
	public String fatherName;
	public Father(String gFatherName,String fName) {
		super(gFatherName);
		this.fatherName = fName;
    }
	public Father(){};
}


class Son extends  Father{
	public String sonName;
	public Son(String gFatherName,String fName,String Sname) {
		super(gFatherName,fName);
		this.sonName = Sname;
    }
	public Son(){};

	public void printName(){
		System.out.print("\n sonname: "+this.sonName + 
		"\n fathername: "+ this.fatherName+
		"\n grandfather: "+ this.grandFatherName);
	}
}
