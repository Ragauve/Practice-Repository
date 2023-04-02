package interviewcodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceChar {
	
	public static void main(String[] args) {
		String s="Ragav is a fool and Ragav";
		String[] ch =s.split(" ");
		
		Map<String,Integer> m=new HashMap();
				
		for(int i=0;i<ch.length;i++) {
			if(m.containsKey(ch[i])) {
				Integer d= m.get(ch[i]);
				m.put(ch[i], d+1);
				
			}
			else
			{
				m.put(ch[i],1);
			}
			
		}
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

}
