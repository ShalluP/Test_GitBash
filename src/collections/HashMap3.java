package collections;

public class HashMap3 {

		import java.util.HashMap;
		import java.util.Iterator;
		import java.util.LinkedHashMap;
		import java.util.Map;
		import java.util.Set;
		import java.util.TreeSet;

	    public static void main(String[] args)
		    {
		        Map<Integer,String> map=new LinkedHashMap<Integer,String>(); // key,value
		        map.put(1,"one");
		        map.put(2,"two");
		        map.put(3,"three");
		        map.put(4,"four");
		        map.put(5,"five");
		        map.put(15,"five");
		        map.put(25,"five");
		        map.put(35,"five");
		        map.put(22,"two");
		        map.put(32,"two");
		        map.put(42,"two");
		        
		        Set<String> valueSet=new TreeSet<String>(map.values());
		        
		        System.out.println("Set of unique values");
		        System.out.println(valueSet);
		        Iterator<String> iterator=valueSet.iterator();
		        Map<Integer,String> uniqueMap=new HashMap<Integer,String>();
		        while (iterator.hasNext()) {
		            String value = iterator.next();
		            for(Map.Entry<Integer,String> e:map.entrySet())
		            {
		                if(value.equals(e.getValue()) && !uniqueMap.containsValue(value))
		                {
		                    uniqueMap.put(e.getKey(), value);
		                }

		            }

		        }
		        System.out.println("After removing duplicate values from map");
		        System.out.println(uniqueMap);

		    }}}
		

	


