package HDFSFileOperation;

import org.apache.hadoop.conf.Configuration; //Needed to get the hadoop configuration.
import org.apache.hadoop.fs.*; //Needed for HDFS file system operation.
import java.io.*; //Needed for system input output operation

public class Operations {

	public static void main(String[] args) throws IOException {

		FileSystem hdfs =FileSystem.get(new Configuration());
		Path homeDir=hdfs.getHomeDirectory();
		//Print the home directory
		System.out.println("Home folder -" +homeDir);
		
		Path FilePath=new Path("/user/hugo/input/test.txt");
		BufferedReader bfr=new BufferedReader(new InputStreamReader(hdfs.open(FilePath)));     
		String str = null;
		while ((str = bfr.readLine())!= null)
		{

			System.out.println(str);
		}
	}
}
