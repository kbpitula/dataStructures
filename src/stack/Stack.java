package stack;

public class Stack {

	double[] tab;
	int firstFee;
	
	public Stack(int MaxSize) {
		tab = new double[MaxSize];
		firstFee = 0;
	}
	
	int getMaxStackSize() {
		return tab.length;
	}
	
	int getSize() {
		return firstFee;
	}
	
	void push(double e) throws ArrayIndexOutOfBoundsException {
		if(firstFee < tab.length) {
			tab[firstFee] = e;
			firstFee++;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	double pop() throws IndexOutOfBoundsException {
		if (firstFee <= 0) {
			throw new IndexOutOfBoundsException();
		}
		
		double a = tab[firstFee - 1];
		firstFee--;
		return a;
	}
}
