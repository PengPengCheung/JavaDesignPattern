package compositepattern;

public class CompositePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comA = new Composite("Composite 1");
		comA.add(new Leaf("Leaf 1A"));
		comA.add(new Leaf("Leaf 1B"));
		
		root.add(comA);
		root.add(new Leaf("Leaf C"));
		
		root.display(2);
	}

}
