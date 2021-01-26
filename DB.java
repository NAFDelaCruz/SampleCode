package homeworks;
import java.util.*;
import java.util.Map.Entry;

public class DB {
	static HashMap<Integer, String> id_name = new HashMap<Integer, String>();
	static HashMap<Integer, String> id_name2 = new HashMap<Integer, String>();
	static HashMap<Integer, String> id_name3 = new HashMap<Integer, String>();
	static HashMap<String, String> acc_type = new HashMap<String, String>();
	static HashMap<String, String> acc_status = new HashMap<String, String>(); 
	
	public static void main(String[] args) {
		DBInsert ins = new DBInsert();
		ins.Insert();
		String key;
		String typekey;
		
		System.out.println("DATA SET 1");
		for (int x = 0; x < id_name.size(); x++) {
			
			System.out.print(id_name.get(x)+"\t"+"     ");				//SELECT * FROM id_name
			key = id_name.get(x);
			System.out.print(acc_type.get(key)+"\t");
			typekey = acc_type.get(key);			
			System.out.println(acc_status.get(typekey));	
			
		}
		
		System.out.println("\n");
		
		System.out.println("DATA SET 2");
		for (int x = 0; x < id_name2.size(); x++) {
			
			System.out.print(id_name2.get(x)+"\t"+"     ");				//SELECT * FROM id_name2
			key = id_name.get(x);
			System.out.print(acc_type.get(key)+"\t");
			typekey = acc_type.get(key);			
			System.out.println(acc_status.get(typekey));	
			
		}
		
		System.out.println("\n");	
		
		System.out.println("DATA SET 3");
		for (int x = 0; x < id_name3.size(); x++) {
			
			System.out.print(id_name3.get(x)+"\t"+"     ");				//SELECT * FROM id_name3
			key = id_name.get(x);
			System.out.print(acc_type.get(key)+"\t");
			typekey = acc_type.get(key);			
			System.out.println(acc_status.get(typekey));
			
		}
	}
}

//Above is a Java mock replica where three different for loops run for 3 different databases to query as an example, I wasn't able to make 
//the user input what type of data they will query.
//In Query statements the parameters/arguments for SELECT FROM and WHERE can be a String value at first if I recall correctly from our
//back-end code and so we used constants resulting to incomplete replica of the code below.
/*


int[] CONSTANT_MONTH = {(Integer) null, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; 

for(a: Database Size) {
	SELECT Type1 FROM dbName WHERE month = CONSTANT_MONTH[x];		//x being selected from a drop down menu returning a value of 1-12
} 

for(a: Database Size) {
	SELECT Type2 FROM dbName WHERE month = CONSTANT_MONTH[x];		//x being selected from a drop down menu returning a value of 1-12
} 

for(a: Database Size) {
	SELECT Type3 FROM dbName WHERE month = CONSTANT_MONTH[x];		//x being selected from a drop down menu returning a value of 1-12
} 


*/




//Noticing this pattern I thought to nest for loops so that the parameter for FROM can be constants as well resulting in
//this code below


/*

String[] CONSTANT_COLUMNS = {"Type1", "Type2", "Type3"};
int[] CONSTANT_MONTH = {(Integer) null, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; 


for (int index = 0; index < CONSTANT_DBNAME.length ; x++) 
{
	for(a: Database Size) 
	{
		SELECT CONSTANT_COLUMNS[index] FROM dbName WHERE month = CONSTANT_MONTH[x];
	}
}

*/

//When I presented this idea to the team they told me that this is not allowed.





