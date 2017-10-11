package lab8_soln;

import java.util.ArrayList;

public class Directory extends AbstractFile {
	
	// an ArrayList to hold Files and Directories 
	private ArrayList<AbstractFile> files = new ArrayList<AbstractFile>();
	
	
	public Directory(String nm){
		this.name = nm; // name is the variable inherited from AbstractFile
	}

	public void add(AbstractFile a) {
		this.files.add(a);
		
	}

	@Override
	// This method is just like the cost() method in Assembly-Part
	public int size() {
		int size=0;
		for (AbstractFile file: files){
			size+=file.size();
		}
		return size;
	}

	@Override
	public int getnumFiles() {
		int numFiles=0;
		for (AbstractFile file: files){
			numFiles+=file.getnumFiles();
		}
		return numFiles;
		
	}

	@Override
	public int getnumFolders() {
		int numFolders=0;
		for (AbstractFile file: files){
			if (file instanceof Directory){ //if it is a Directory
				numFolders++; // increase the count
				numFolders+=file.getnumFolders(); // and get the number of sub-folders it holds
			}
		}
		return numFolders;
	}
	
	
}
