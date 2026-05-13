package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class FailFastIterators {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		try
		{
		for(Integer num:list) {
			if(num==3) {
				list.remove(num);	//causes ConcurrentModification Exception
			}
		System.out.println(num);
		}
		}
		catch(ConcurrentModificationException ex) {
			System.out.println("Exception caught "+ex);
		}
		
	System.out.println("Program continues ...");
	}
}
