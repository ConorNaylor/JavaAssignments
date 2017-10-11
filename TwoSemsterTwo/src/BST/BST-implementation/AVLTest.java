
public class AVLTest {
	
public static void main(String[] args){
	Timer timer = new Timer();
		
		//Question 1
		AVLTree<String> AVL = new AVLTree<String>();
		
		timer.Start();
		AVL.add("Dublin");
		System.out.print("Time taken to perfrom add to AVL:");
		timer.elapsedTime();
		AVL.add("London");
		AVL.add("Moscow");
		AVL.add("Lisbon");
		AVL.add("Madrid");
		AVL.add("Barcelona");
		AVL.add("Amsterdam");
		AVL.add("New York");
		AVL.add("Memphis");
		AVL.add("Chicago");
		AVL.add("Atlanta");
		AVL.add("San Fran");	
		
		//Question 2
		timer.reset();
		timer.Start();
		AVL.inorderTraverse();
		System.out.print("Time taken to perform in-order traversal of AVL:");
		timer.elapsedTime();
		
		//Question 3
		System.out.println("\nQ3:");
		AVL.add("Dublin");
		AVL.inorderTraverse();
		
		//Question 5
		System.out.println();
		timer.reset();
		timer.Start();
		System.out.println(AVL.contains("Moscow"));
		System.out.print("Time taken to perform a search of AVL:");
		timer.elapsedTime();
		System.out.println(AVL.contains("Atlanta"));
		
		}
}

