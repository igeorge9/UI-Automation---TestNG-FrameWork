package testPrograms;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	
	String str= "Hello World, Good morning guys";
	char [] array =str.toCharArray();
	int count=0;
	
	Set set= new HashSet();
	
	for(int i=0;i<array.length;i++)
	{
		if(!set.add(array[i]))
		{
			System.out.println("Index of duplicate characters are : "+ i);
			count++;
		}
	}
	System.out.println("Count of total duplicate characters are : "+count);
	}

}
