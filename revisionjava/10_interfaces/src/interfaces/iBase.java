package interfaces;

public interface iBase {
	
	void print();
}
interface I1 extends iBase{
	void send();
}
class Mc implements I1{

	@Override
	public void print() {
		
	}

	@Override
	public void send() {
		
	}
	
	
	
}
