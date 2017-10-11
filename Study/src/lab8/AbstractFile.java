package lab8;

public abstract class AbstractFile{
	
	public String name;
	
	public abstract int size();
	public abstract int getnumFolders();
	public abstract int getnumFiles();
	
	public String getName(){
		return this.name;
	}
}