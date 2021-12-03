package labproject8.interfaces;

import java.util.ArrayList;

public class TestWrittenWorks {

	public static void main(String[] args) {
		Novel n1 = new Novel("Far451", "Ray", 1953, 153, "Science fiction" , 3);
		Novel n2 = new Novel("Lord of the flies", "William", 1954, 140, "Allegorical novel", 12);
		Novel n3 = new Novel("Pic of Dorian Grey", "Oscar", 1890, 174, "Philosophical fiction", 20 );
		
		ShortStory ss1 = new ShortStory("Roadside picnic", "Strugatsky brothers", 1971, 90,"Science fiction",24,true);
		ShortStory ss2 = new ShortStory("Metamorphosis", "Kafka", 1912, 73, "Modernist fiction" , 17, false);
		
		ArrayList<WrittenWork> arrayOfWW = new ArrayList<>();
		
		arrayOfWW.add(n1);
		arrayOfWW.add(n2);
		arrayOfWW.add(n3);
		arrayOfWW.add(ss1);
		arrayOfWW.add(ss2);
		
		for (int i = 0; i < arrayOfWW.size(); i++) {
			System.out.println(arrayOfWW.get(i) + "\n");
		}
		
		System.out.println("=================================");
		arrayOfWW.sort(new CompareByPageSize());
		
		for (int i = 0; i < arrayOfWW.size(); i++) {
			System.out.println(arrayOfWW.get(i) + "\n");
		}
	}

}
