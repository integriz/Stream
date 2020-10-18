import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class X {
	public static void main(String args[]){
		/*Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","senha$00");
		props.setProperty("ssl","true");
		String url = "jdbc:postgresql://localhost/teste?user=postgres&password=senha$00";
		//Connection conn = DriverManager.getConnection(url, props);

		
		try {
			Connection conn = DriverManager.getConnection(url);
			conn.getMetaData();
			System.out.println("oi");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		List<String> items = new ArrayList<String>();
	      items.add("um");
	      items.add("dois");
	      items.add("três");
	    Stream<String> stream = items.stream();
		System.out.println(stream.count());
		
		Map<String, String> map = new HashMap<String, String>();        
		   map.put("key1", "abacate");     
		   map.put("key2", "melancia");     
		   map.put("key3", "manga");      
		   Stream<String> stream2 = map.values().stream();
		   System.out.println(stream2.count());
	}
}
