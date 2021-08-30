package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamSimpleExample {
	
	// There is no life for intermediate operator if there is no terinal operator
	//Terminal operation executes only if the intermediate operator return true
	
	@Test
	public void SimpleExample() {
		/*
		 * Program to print the names with length greater than 6 and starts with A
		 */
		String[] names= {"Teena","Minnu","Anaghaa","Vikru","Unni"};
		List<String> nameslist=Arrays.asList(names);
		Long count=nameslist.stream().filter(s->s.length()>6).count();
		System.out.println(count);
		
	}
	
		@Test
		public void filteredSteam() {
		/*
		 * Program to filter out elements having length more than 6 and limit to first element
		 */
		Long count1 =Stream.of("Teena","Minnu","Anaghaa","Vikru","Unni").filter(s->
				{
					s.startsWith("V");
						return true;
				}
				).count();
		System.out.println(count1);
	
		}
		@Test
		public void sortedStream()
		{
			Stream.of("Teena","Minu","Anaghaa","Vikru","Duni").filter(s->s.length()<5).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		}
		
		@Test
		public void DistinctElements()
		{
			/*
			 * Program to pint the concatenated list 
			 */
			String [] list1= {"Jaanu","Minu","Devu","Sadia","Anna","Pippee"};
			List<String> mainList=Arrays.asList(list1);
			String[] list2= {"Teena","Minu","Anaghaa","Vikru","Duni"};
			List<String> secondList=Arrays.asList(list2);
			Stream.concat(mainList.stream(),secondList.stream());
			
			Stream newStream=Stream.concat(mainList.stream(),Stream.of("Teena","Minu","Anaghaa","Vikru","Duni"));
			newStream.forEach(s->System.out.println(s));
		}
		
	

}
