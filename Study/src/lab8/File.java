package lab8;



public class File extends AbstractFile {
	
	private String name;
	private int size;
	
	
	public File(String nm){
		this.name = nm;
		this.size = nm.length(); // for demo purposes the size of the file is the number of characters in its name
	}


	@Override
	public int size() {
		return this.size;
	}


	@Override
	public int getnumFolders() {
		return 0;
	}


	@Override
	public int getnumFiles() {
		return 1;
	}
}
