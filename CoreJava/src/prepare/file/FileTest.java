package prepare.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileInputStream file = new FileInputStream(
				"C:\\Users\\nikku\\interview_preparation_2022\\CoreJava\\src\\prepare\\file\\test.txt");
				Scanner sc = new Scanner(file);) {
			File file1 = new File(
					"C:\\Users\\nikku\\interview_preparation_2022\\CoreJava\\src\\prepare\\file\\test1.txt");
			file1.createNewFile();
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
					"C:\\Users\\nikku\\interview_preparation_2022\\CoreJava\\src\\prepare\\file\\test1.txt"));

			while (sc.hasNext()) {
				String s = sc.nextLine();
				System.out.println(s);
				if (s.equals("test1")) {
					bufferedWriter.write(s);
					bufferedWriter.flush();
				}

			}

		}

	}

}
