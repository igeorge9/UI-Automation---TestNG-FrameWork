package testPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		String [] allCodes = {"001","002","003","033","005","041","051","071","081"};
		String [] assignedCodes= {"003","033"};
		String [] unAssignedCodes = getUnAssignedCodes(allCodes,assignedCodes);
		
		System.out.println(Arrays.toString(unAssignedCodes));
	}
	
	static String[] getUnAssignedCodes(String [] allCodes,String [] assignedCodes) throws UnsupportedOperationException
	{
		List<String> list1 =new ArrayList<String>(Arrays.asList(allCodes));
		System.out.println("Elements in list1 "+list1+"\n");
		List<String> list2 = new ArrayList<String>(Arrays.asList(assignedCodes));
		System.out.println("Elements in list2 "+list2);
		list1.removeAll(list2);
		
		 return list1.toArray(new String[list1.size()]);
	 }
}
