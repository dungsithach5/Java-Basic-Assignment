package PP_Quay_Lui;
import java.io.FileWriter;
import java.io.IOException;
public class testC {
	public static void main(String[] args) {
	      try {
	          FileWriter writer = new FileWriter("output.txt");
	          for (int i = 0; i < 10; i++) {
	              for (int j = 0; j < 10; j++) {
	                  for (int k = 0; k < 10; k++) {
	                      writer.write(i + " " + j + " " + k + "\n");
	                  }
	              }
	          }
	          writer.close();
	      } catch (IOException e) {
	          System.out.println("An error occurred.");
	          e.printStackTrace();
	      }
	  }
}
