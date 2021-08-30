package testPrograms;

public class passByValue {
	
	public static void updateTitle1(ReportDemo rep) 
	{

		rep= new ReportDemo();
		rep.title="copy";
		
	}
	public static void updateTitle2(ReportDemo rep)
	{
		rep.title="updated";
	}
	public static void incrementId(long id)
	{
		id=id+1;
		System.out.println("Value of id inside method incrementid "+id+"\n");
	}

	public static void main(String[] args) {

		long id =111;
		ReportDemo rep= new ReportDemo();
		incrementId(id);
		System.out.println("Value of id after method incrementid "+id+"\n");
		updateTitle1(rep);
		System.out.println("Value of title after Updatetitle1 "+rep.title+"\n");
		updateTitle2(rep);
		System.out.println("Value of title after Updatetitle2 "+rep.title+"\n");
		
	}

}
