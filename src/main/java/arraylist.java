import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) 
//		ArrayList<Integer> number= new ArrayList<Integer>();
//		    number.add(2);
//		    number.add(6);
//		    number.add(9);
//		    number.add(3);
//		    System.out.println(number); 
//
//}
	{
		ArrayList<Integer> number= new ArrayList<Integer>();
		    number.add(2);
		    number.add(6);
		    number.add(9);
		    number.add(3);
//		    System.out.println(number);
		    for(int i=0; i<number.size(); i++)
		    {
		    	System.out.println(number.get(i));
		    }
		    System.out.println("deleting 9 from ArrayList");
		    number.remove(2);
		    System.out.println(number);
		    number.add(15);
		    number.add(61);
		    number.add(15);

		    System.out.println(number);


		}
}

