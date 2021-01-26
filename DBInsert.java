package homeworks;
import java.util.*;

public class DBInsert extends DB {
	
	public static void Insert() {
		int index;
		Random rand = new Random();
		
		String[] names = {"Mona","Matthew","Michael","Tyler","Anna","Brock","Celine","Erin","Rona","Moi"};
		String[] type = {"Type1","Type2","Type3"};
		String[] stat = {"Open", "Closed"};
		
		for (index = 0; index < names.length; index++) {
			id_name.put(index, names[index]);
			id_name2.put(index, names[index]);
			id_name3.put(index, names[index]);
			String key = id_name.get(index);
			acc_type.put(key, type[rand.nextInt(3)]);
			String typekey = acc_type.get(key);			
			acc_status.put(typekey, stat[rand.nextInt(2)]);
		}
	}
}
