import java.util.*;

class Ex11_10 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}

		List<Integer> list = new LinkedList<Integer>(set); // LinkedList(Collection c)
		Collections.sort(list);          // Collections.sort(List list)
		System.out.println(list);
	}
}
