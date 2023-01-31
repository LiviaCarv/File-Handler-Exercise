package FileHandlerExercise;

import FileHandlerExercise.orchestrators.FileOrchestrator;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        FileOrchestrator file = new FileOrchestrator();

        File myObj = new File("C:\\Users\\livia\\OneDrive\\Documents\\Olá" + "\\" + "filenameKK" + ".txt");
        System.out.println(myObj.createNewFile());


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
