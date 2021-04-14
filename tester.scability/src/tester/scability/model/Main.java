package tester.scability.model;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeSysADLModelFile model = new MakeSysADLModelFile();
		
		model.makeFile();
		for (int i = 10; i < 100; i = i+10) {
			model.executeByIndex(i);
		}
	}

	

}
