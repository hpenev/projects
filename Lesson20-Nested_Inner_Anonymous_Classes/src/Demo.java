public class Demo {
    public static void main(String[] args) {
	// Instantiating the outer class
	Outer_Demo outer = new Outer_Demo();

	// Accessing the display_Inner() method.
	outer.display_Inner();

	Outer_Demo.Static_Inner_Demo static_Inner_Demo = new Outer_Demo.Static_Inner_Demo();
	static_Inner_Demo.print();
    }
}
