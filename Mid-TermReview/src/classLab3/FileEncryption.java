package classLab3;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEncryption {

	public static void main(String[] args) throws IOException {
		String message;
		int key;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a Message:");
		message = kb.nextLine();
		
		System.out.println("Enter a Encryption key: (1 - 100)");
		key = kb.nextInt();
		
		StringBuilder sb = new StringBuilder(message);
		
		for(int i = 0; i < sb.length(); i++){
			sb.setCharAt(i, (char)( sb.charAt(i)+ key));
		}
		
		FileOutputStream fos = new FileOutputStream("secret.msg");
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeInt(key);
		dos.writeUTF(sb.toString());
		dos.close();
		System.out.println("File 'secret.msg' created and Encrypted.");
	}

}
