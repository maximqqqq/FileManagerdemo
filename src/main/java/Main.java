import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FileManager fileManager = new FileManager("C:\\Users\\Max\\Downloads\\FileManagerdemo\\root");

        String input = scanner.nextLine();

        while (!input.equals(Commands.EXIT)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals(Commands.LIST_OF_FILES)) {
                fileManager.listOfFiles(false);
            } else if (command.equals(Commands.LIST_OF_FILES_WITH_SIZE)) {
                fileManager.listOfFiles(true);
            } else if (command.equals(Commands.COPU_FILE)) {
                String sourceFileName = tokens[1];
                String destFileName = tokens[2];
                fileManager.copyFile(sourceFileName, destFileName);
            }else if (command.equals(Commands.CREATE_FILE)){
                String fileName = tokens[1];
                fileManager.createFile(fileName);
            } else if (command.equals(Commands.FILE_CONTENT)){
                String fileName = tokens[1];
                fileManager.fileContent(fileName);
            }else if (command.equals(Commands.CHAGE_DIRECTORY)){
                String folderName = tokens[1];
                fileManager.changeDirectory(folderName);
            }
            input = scanner.nextLine();
        }
    }
}
