package FileHandlerExercise;

import FileHandlerExercise.model.MFileAnnotationTypeEnum;
import FileHandlerExercise.orchestrators.FileOrchestrator;
import FileHandlerExercise.orchestrators.FolderOrchestrator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        FileOrchestrator file = new FileOrchestrator();
        FolderOrchestrator folder = new FolderOrchestrator();

        folder.listAllFoldersCreated();
        //file.listAllFiles("C:\\Users\\livia\\OneDrive\\Documents");
        //file.saveFile("C:\\Users\\livia\\OneDrive\\Documents\\Olá", "!!!!!!!!", MFileAnnotationTypeEnum.REMINDER, "myNewFile");
        //file.saveImageFile("C:\\Users\\livia\\OneDrive\\Documents\\Olá","\"C:\\Users\\livia\\OneDrive\\Pictures\\caixa.png\"", "imagemhahahah");
        //file.removeFile("C:\\Users\\livia\\OneDrive\\Documents\\Olá\\reminders", "myNewFile", MFileAnnotationTypeEnum.REMINDER);
        // folder.removeAFolder("C:\\Users\\livia\\OneDrive\\Documents\\Olá");

//        File file = new File("C:\\Users\\livia\\OneDrive\\Documents\\");
//        String[] directories = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File current, String name) {
//                return new File(current, name).isDirectory();
//            }
//        });
//        System.out.println(Arrays.toString(directories));
//    }
    }
}
