package Java_8;


import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		/**
		 * Find the square of each element in a list
		 */
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		List<Integer> listSquare=list.stream().map((a)->a*a).collect(Collectors.toList());
		System.out.println(listSquare);
		
		/**
		 * Increase the percentage by 2 of each student
		 */
		Student s1=new Student(1, "Rahul", 56, null);
		Student s2=new Student(1, "Dinesh", 91, null);
		Student s3=new Student(1, "Suresh", 78, null);
		Student s4=new Student(1, "Rahul", 96, null);
		List<Student> stdList=List.of(s1,s2,s3,s4);
		
		stdList.stream().map((std)->{
			std.percent=std.percent+2;
			return std;
		}).forEach((s)->System.out.println(s.name+":"+s.percent));

	}

}
