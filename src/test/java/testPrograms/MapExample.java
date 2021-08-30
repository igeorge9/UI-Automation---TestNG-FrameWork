package testPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		String str= "Hello Guys";
		char [] charArray =str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : charArray)
		{
			if(!map.containsKey(c))
				map.put(c,1);
			else
				map.put(c, map.get(c) +1);	
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		
	}

}
