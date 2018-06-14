import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumericalString {

	public static void main(String[] args) {

		
		String num = "12333123654";
		
		// Find the digit with max occurrence
		
		// Approach 1 : O(n^2)
		char[] chars = num.toCharArray();
		Map<Character, Integer> countingMap = new HashMap<Character, Integer>();
		for (char c : chars) {
			if (!countingMap.containsKey(c)) {
				countingMap.put(c, 1);
			} else {
				countingMap.put(c, countingMap.get(c) + 1);
			}
		}
		
		int max = 0;
		char cMax = '/';
		Set<Entry<Character, Integer>> entrySet = countingMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(">>"+entry);
		}
		for (Entry<Character, Integer> entry : entrySet) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				cMax = entry.getKey();
			}
		}
		
		System.out.println("Num occurring the most: "+cMax);
		
		int[] arr = new int[10];
		// Approach 1 : O(n)
		for (char c : chars) {
			arr[Integer.valueOf(String.valueOf(c))] += 1;
		}
		for (int i : arr) {
			System.out.println(">> "+ i);
		}
		int maxIdx = 0;
		int maxVal = 0;
		for (int i=0; i< arr.length; i++) {
			if (maxVal < arr[i]) {
				maxVal = arr[i];
				maxIdx = i;
			}
		}
		System.out.println("Num = "+maxIdx + " & occ = "+maxVal);
		
	}

}
