import java.io.*;

public class FileQues

{

	public static void main(String[] x)

	{

		File f = new File("C:/Users/Dell/Desktop/assignment 10sep");

		

		try{

			FileInputStream fin = new FileInputStream(f);

			

			int i = fin.read();

			

			while(i!=-1)

			{

				System.out.println(i + " : " + (char)i);

				i = fin.read();

			}

				fin.close();

		}

	

		catch(IOException e)

		{

			System.out.println(e);

		}

		

		System.out.print("File path: " + f.getPath());

	}

}