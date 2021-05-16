package collectionAssignment;

	import java.util.HashMap;
	import java.util.Map.Entry;

	public class MapInsertionOrder { 

		    private int id;
		    private String name;
		    public int getId() {
		        return id;
		    }
		    public void setId(int id) {
		        this.id = id;
		    }
		    public String getName() {
		        return name;
		    }
		    public void setName(String name) {
		        this.name = name;
		        }
		  public static void main(String[] args) {

		  HashMap<Integer,String>h=new HashMap<Integer,String>();
		  
		        h.put(4,"a");
		        h.put(2,"b");
		        h.put(3,"c");
		        h.put(1,"d");
		        
		    System.out.println("map insertion order");
		        for(Entry<Integer, String> e:h.entrySet()) {
		            System.out.println(e.getKey()+" "+e.getValue());

		        }

		    }

		}

