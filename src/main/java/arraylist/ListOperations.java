package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListOperations {

	public static void main(String[] args) {
		try {
		List<String> testlist=new ArrayList();
		testlist.add("test1");
		testlist.add("test11");
		testlist.add("test12");
		testlist.add("test2");
		
		System.out.println("sorting");
		Collections.sort(testlist);
		System.out.println(testlist);
		
		System.out.println("filtering out elements containing 1");
		boolean matchResult=testlist.stream().anyMatch(s->s.contains("1"));
		System.out.println("is 1 present:"+matchResult);
		List<String> finallist=testlist.stream().filter(s->s.contains("1")).toList();
		System.out.println(finallist);
		
		System.out.println("MEthod reference exxample using map.\n convert to uppercase");
		List<String> finallist2=testlist.stream().filter(s->s.contains("1")).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(finallist2);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
