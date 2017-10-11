package lab8_soln;

public class File extends AbstractFile {
	
	private int size;
	
	public File(String nm){
		this.name = nm; // // name is the variable inherited from AbstractFile
		this.size = name.length(); // for demo purposes the size of the file is simply the number of characters in its name
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public int getnumFiles() { // simply returns the value 1
		return 1;
	}

	@Override
	public int getnumFolders() { // we have to implement this (from AbstractFile) - but it doesn't make a lot of sense
		return 0;
	}
}
