public class BSTTest {

		
		public static void main(String[] args){
		
		Timer timer = new Timer();
		
		//Question 1
		BinarySearchTreeR<String> BST = new BinarySearchTreeR<String>();
		
		timer.Start();
		BST.add("Dublin");
		System.out.print("Time taken to perfrom add to BST:");
		timer.elapsedTime();
		BST.add("London");
		BST.add("Moscow");
		BST.add("Lisbon");
		BST.add("Madrid");
		BST.add("Barcelona");
		BST.add("Amsterdam");
		BST.add("New York");
		BST.add("Memphis");
		BST.add("Chicago");
		BST.add("Atlanta");
		BST.add("San Fran");	
		
		//Question 2
		timer.reset();
		timer.Start();
		BST.inorderTraverse();
		System.out.print("Time taken to perfrom in-order traversal to BST:");
		timer.elapsedTime();
		
		
		//Question 3
		System.out.println("\nQ3:");
		BST.add("Dublin");
		BST.inorderTraverse();
		
		//Question 4
		System.out.println();
		BST.remove("Moscow");
		BST.remove("Atlanta");
		BST.inorderTraverse();
		
		//Question 5
		System.out.println();
		timer.reset();
		timer.Start();
		System.out.println(BST.contains("London"));
		System.out.print("Time taken to perfrom search of BST:");
		timer.elapsedTime();
		System.out.println(BST.contains("Miami"));
		
		}

	}

