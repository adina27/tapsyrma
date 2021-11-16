package oop1;

import textfile.Directory;
import textfile.File;
import textfile.FileException;
import textfile.TextFile;

public class text1 {


    public static void main(String[] args) throws FileException {

        Directory root = new Directory("");
        root.print();
        System.out.print("\nСоздаём новую директорию...");
        root.append(new Directory("Новая директория"));
        System.out.println("ок.\n");
        root.print();
        System.out.println();
        Directory directory = (Directory) root.findFirst("Новая директория");
        directory.print();
        System.out.print("\nСоздаём новый текстовый файл...");
        directory.append(new TextFile("Текстовый файл.txt"));
        System.out.println("ок.\n");
        directory.print();
        System.out.println();
        File file = directory.findFirst("Текстовый файл.txt");
        file.print();
        System.out.print("Text");
        file.append("text");
        System.out.println("ok.\n");
        file.print();
        System.out.print("\ndeleted");
        file.remove();
        System.out.println("ок.\n");
        directory.print();
    }
    public text1() {
        System.out.print("\nСоздаём новый текстовый файл...");
        directory.append(new TextFile("Текстовый файл.txt"));
        System.out.println("ок.\n");
        directory.print();
        System.out.println();
        File file = directory.findFirst("Текстовый файл.txt");
        file.print();
        System.out.print("Text");
        file.append("text");
        System.out.println("ok.\n");
        file.print();
        System.out.print("\ndeleted");
        file.remove();
        System.out.println("ок.\n");
        directory.print();
    }

    @Override
    public String toString() {
        return "text1{}";
    }
}