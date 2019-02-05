import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

public class FileWriterEx {
	public static void main(String[] args) throws Exception {
		String str = "hh gg ffd dsk";
		File file = new File("/home/noor/Desktop/Noor.txt");
		//using PosixFilePermission to set file permissions 777
		Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
		//add owners permission
		perms.add(PosixFilePermission.OWNER_READ);
		perms.add(PosixFilePermission.OWNER_WRITE);
		perms.add(PosixFilePermission.OWNER_EXECUTE);
		//add group permissions
		perms.add(PosixFilePermission.GROUP_READ);
		perms.add(PosixFilePermission.GROUP_WRITE);
		perms.add(PosixFilePermission.GROUP_EXECUTE);
		//add others permissions
		perms.add(PosixFilePermission.OTHERS_READ);
		perms.add(PosixFilePermission.OTHERS_WRITE);
		perms.add(PosixFilePermission.OTHERS_EXECUTE);

		Files.setPosixFilePermissions(Paths.get("/home/noor/Desktop/Noor.txt"), perms);

		FileWriter fw = new FileWriter(file);
		for (int i=0;i<str.length();i++) {
			fw.write(str.charAt(i));
		}
		fw.close();
		FileReader fr = new FileReader(file);
		int s;
		while ((s = fr.read()) != -1) {
			System.out.print((char) s);
		}
	}
}
