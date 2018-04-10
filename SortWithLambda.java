import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class SortWithLambda
{
	public static void main (String args[])
	{
		List<String> names = new ArrayList<String>();
		names.add("Jimmy");	
		names.add("Jolly");	
		names.add("Andrea");	
		names.add("Pinch");	
		names.add("Kalsi");	
		
		
		sortUsingJava8Lambdas(names);
		
		System.out.println(names);
		
	}
	
	
	private static void  sortUsingJava8Lambdas(List<String> names)
	{
		Collections.sort(names,(s1,s2) -> s1.compareTo(s2) );
	}
}
