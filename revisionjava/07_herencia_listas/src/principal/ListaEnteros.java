package principal;

import java.util.ArrayList;

public class ListaEnteros extends ArrayList<Integer> {
	
	public int sum() {
		
		if (this.isEmpty()) {
            return 0;
        }
		return this.stream()
				    .distinct()
				    .mapToInt(c->c)
				    .sum();
	}
	
	public double average() {
		
		if (this.isEmpty()) {
            return 0;
        }
		return this.stream()
				   .distinct()
			       .mapToDouble(c->c)
			       .average()
			       .getAsDouble();
	}

	@Override
	public boolean add(Integer e) {
		
		if (!contains(e)){
            return super.add(e);
                         }else{
        	return false;
                               }
	}
	
	@Override
	public void add(int index,Integer element) {
		if(!contains(element)){
			super.add(index, element);
		}

	}
	
	
	
}
