package search;
import java.io.*;
import java.util.*;

public class tester {
	public static void main(String[] args) throws FileNotFoundException {
		
		LittleSearchEngine a = new LittleSearchEngine();
		a.makeIndex("docs.txt","noisewords.txt");
		
		
		
		//GETKEYWORD
		
/*		String[] keyWordTest = new String[5];
		keyWordTest[0]=a.getKeyWord("Word");
		keyWordTest[1] = a.getKeyWord("night,");
		keyWordTest[2]=a.getKeyWord("question??");
		keyWordTest[3]=a.getKeyWord("Could");
		keyWordTest[4]=a.getKeyWord("test-case");
		for (String str : keyWordTest){
			System.out.println(str);
		}*/
		
		
		
	//	INSERT LAST OCCURRENCE
		
	ArrayList<Occurrence> insert = new ArrayList<Occurrence>();
		Occurrence e = new Occurrence("doc1.txt",20);
		insert.add(e);
		Occurrence e1 = new Occurrence("doc2.txt",15);
		insert.add(e1);
		Occurrence e2 = new Occurrence("doc3.txt",14);
		insert.add(e2);
		Occurrence e3 = new Occurrence("doc4.txt",12);
		insert.add(e3);
		Occurrence e4 = new Occurrence("doc5.txt",12);
		insert.add(e4);
		Occurrence e5 = new Occurrence("doc6.txt",10);
		insert.add(e5);
		Occurrence e6 = new Occurrence("doc7.txt",8);
		insert.add(e6);
		Occurrence e7 = new Occurrence("doc8.txt",1);
		insert.add(e7);
		System.out.println(a.insertLastOccurrence(insert));
		
		//TOP5SEARCH
		
		/*System.out.println(a.top5search("yellow", "blue"));
		System.out.println(a.top5search("red","blue"));
		System.out.println(a.top5search("green","bike"));
		System.out.println(a.top5search("apple","orange"));
		System.out.println(a.top5search("bus","car"));*/
		
		
	}
	
}