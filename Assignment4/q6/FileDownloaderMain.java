import java.util.List;
import java.io.*;
public class FileDownloaderMain {
	public static void main(String[] args) {
		List<String> photoUrls= FileUtil.readFile("download.txt");
		for(String url: photoUrls) {
			FileDownloadTask task=new FileDownloadTask(url);
			Thread thread=new Thread(task);
			thread.start();
			
		}
	}

}
