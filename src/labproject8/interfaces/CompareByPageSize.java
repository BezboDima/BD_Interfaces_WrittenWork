package labproject8.interfaces;

import java.util.Comparator;

public class CompareByPageSize implements Comparator<WrittenWork>{

	public int compare(WrittenWork w1, WrittenWork w2) {
		if(w1.getPageSize() < w2.getPageSize()) {
			return -1;
				
		}
		else if(w1.getPageSize() > w2.getPageSize()){
			return 1;
		}
			
		else {
			return 0;
		}
		
	}

}
