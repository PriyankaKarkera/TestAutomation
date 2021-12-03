package com.sg.Testscript;

public class ExecuteAutoITExeFileDemo {
	public static void main(String[] args) {
		executeFile();

	}
	
	static void executeFile()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\AutoITExample\\OpenNotepadWritecontentandSave.exe");
			//Runtime runtime=Runtime.getRuntime();
			//runtime.exec("D:\\AutoIT\\sample.exe");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
