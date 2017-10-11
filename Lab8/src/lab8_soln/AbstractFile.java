package lab8_soln;

public abstract class AbstractFile { // abstract class used to tie File and Directory together into one type
	
	protected String name; // inherited by subclasses
	
	public abstract int size(); // abstract method: must be implemented by subclasses
	public abstract int getnumFiles();// abstract method: must be implemented by subclasses
	public abstract int getnumFolders();// abstract method: must be implemented by subclasses
	
	
	public String getName(){// concrete method: inherited by subclasses
		return name;
	}

}
