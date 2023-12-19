package week9;
// chỗ này kì lạ là tuần 13 sao mẫu code lại tuần 9 nhỉ? 
//package week13;
public class Utils {
     public static String readContentFromFile(String path) {
        StringBuilder idea = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            String line;
            while ((line = in.readLine()) != null) {
                idea.append(line);
            }
            in.close();
        } catch (IOException uet) {
            uet.printStackTrace();
        }
        return idea.toString();
    }

     /** Javadoc */
    public static void writeContentToFile1(String idea, String path) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(path));
            out.write(idea);
            out.close();
        } catch (IOException uet) {
            uet.printStackTrace();
        }
    }
      /** Javadoc */
    public static void writeContentToFile2(String idea, String path) {
        try {
            FileWriter out = new FileWriter(path, true);
            out.write(idea);
            out.close();
        } catch (IOException uet) {
            uet.printStackTrace();
        }
    }
      /** Javadoc */
    public static File findFileByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null)
            for (File file : files)
                if (file.getName().equals(fileName)) return file;
        return null;
    }
      /** Javadoc */
    public static void main(String[] args) {
        File file = findFileByName("C:\\Users\\admin\\OneDrive\\Documents\\Try hard '\\OOP\\New folder\\Utils_input_output", "input.txt");
        if (file != null) {
            System.out.println(file.getAbsolutePath());
            String idea = readContentFromFile(file.getAbsolutePath());
            writeContentToFile1(idea, "C:\\Users\\admin\\OneDrive\\Documents\\Try hard '\\OOP\\New folder\\Utils_input_output\\output.txt");
            writeContentToFile1("Nice to meet you!\n", "output.txt");
            writeContentToFile2("Goodbye, see you later.\n", "output.txt");
        }

    }
}
