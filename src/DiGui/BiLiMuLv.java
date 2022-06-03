package DiGui;

import java.io.File;

public class BiLiMuLv {
    public static void main(String[] args) {
//根据给定的路径创建一个FiLe对象
// File srcFile new File("E:\\")j
        File srcFile = new File("E:\\");
//调用方法
        getAllFilePath(srcFile);
    }
//定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的FiLe对象
        public static void getAllFilePath(File srcFile){
//获取给定的FiLe目录下所有的文件或者目录的FiLe数组
            File[] fileArray =srcFile.listFiles();
//遍历该File数组，得到每一个File对象
            if(fileArray !=null) {
                for (File file : fileArray) {
//判断该FiLe对象是否是目录
                    if (file.isDirectory()) {
//是：递归调用
                        getAllFilePath(file);

                    } else {
//不是：获取绝对路径输出在控制台
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
    }
}
