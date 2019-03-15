package com.example;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kelly on 2019/3/5.
 */
public class GetCSVData {

    private static final long MULTIPLER = 1024;
    private static final long KB = MULTIPLER;
    private static final long MB = KB * MULTIPLER;
    private static final long GB = MB * MULTIPLER;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("请输入有效的文件目录");
            System.exit(1);
        }

        File inputDirectory = null;
        File outputDirectory = null;

        try {
            inputDirectory = new File(args[0]);

            if (!inputDirectory.exists()) {
                System.out.println("源文件目录不存在");
                System.exit(1);
            }

            if (!inputDirectory.isDirectory()) {
                System.out.println("源文件不是目录");
                System.exit(1);
            }

            File[] csvFiles = inputDirectory.listFiles();
            if (csvFiles.length == 0) {
                System.out.println("源文件目录下没有文件");
                System.exit(1);
            }

            // 生成目标文件夹
            outputDirectory = new File(args[0] + "-output");
            if (!outputDirectory.exists()) {
                outputDirectory.mkdir();
            } else {
                System.out.println("目标文件目录已存在");
                System.exit(1);
            }

            for (File csvFile : csvFiles) {
//                long fileLength = csvFile.length();
                System.out.println("开始处理" + csvFile.getName() + " " + simpleDateFormat.format(new Date()));

                File outputFile = new File(outputDirectory.getAbsoluteFile() + "/" + csvFile.getName());
                if (!outputFile.exists()) {
                    outputFile.createNewFile();
                }

                InputStream inputStream = new FileInputStream(csvFile);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                OutputStream outputStream = new FileOutputStream(outputFile);

                byte [] cbuf = new byte[1024];
                int len = 1024;
                int size = 0;
                int count = 0;

                do{
                    size = inputStream.read(cbuf,0,len);
                    if(size != -1){
                        for(int i = 0;i<size;i++){
                            if(cbuf[i] == 0x5E){
                                cbuf[i] = 0x2C;
                            }
                        }
                        System.out.println(count++);

                        outputStream.write(cbuf,0,size);
                    }
                }while(size != -1);

                System.out.println("结束处理" + csvFile.getName() + " " + simpleDateFormat.format(new Date()));

                inputStream.close();
                outputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
