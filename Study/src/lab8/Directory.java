package lab8;

import java.util.ArrayList;

public class Directory extends AbstractFile{
	
	private ArrayList<AbstractFile> files = new ArrayList<AbstractFile>();
	
	private String name;

	public Directory(String string) {
		this.name = string;
	}

	@Override
	public int size() {
		int size = 0;
		for(AbstractFile file: files){
			size += file.size();
		}
		return size;
	}

	@Override
	public int getnumFolders() {
		int numF=0;
		for(AbstractFile file: files){
			if(file instanceof Directory){
				numF++;
				numF += file.getnumFolders();
			}
		}
		return numF;
	}

	@Override
	public int getnumFiles() {
		int numFi=0;
		for(AbstractFile file: files){
			numFi += file.getnumFiles();
		}
		return numFi;
	}

	public void add(AbstractFile a) {
		this.files.add(a);
		
	}

	
}