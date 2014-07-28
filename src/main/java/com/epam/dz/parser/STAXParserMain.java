package com.epam.dz.parser;

        import java.io.FileInputStream;
        import java.io.InputStream;
public class STAXParserMain {
    public static void main(String[] args) throws Exception {
        STAXParser parser = new STAXParser();
        // создание входного потока данных из xml-файла
        InputStream input = new FileInputStream("students.xml");
        // разбор файла с выводом результата на консоль
        parser.parse(input);
    }
}
