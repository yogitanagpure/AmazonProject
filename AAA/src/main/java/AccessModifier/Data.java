package AccessModifier;

public class Data {
	
	private String name="private";
	public String name2="public";
	protected String name3="protected";
	String name4= "default";
	
    public static void main(String[] main){

        //Create an object of Data
        Test d = new Test();

        // access private variable and field from another class
//        d.name = "private";
//        d.name2 ="public";
//        d.name3 ="protected";
//        d.name4 ="default";
        //System.out.println(d.name);
        System.out.println(d.name2);
        System.out.println(d.name3);
        System.out.println(d.name4);
    }
}

class Test {
    // private variable
//	private String name="private";
//	public String name2="public";
//	protected String name3="protected";
//	String name4= "default";
	
}