package com.itextpdf;

import java.io.File;

/**
 * Created by duanxiangchao on 2019/6/12
 */
public class FileUtil {

    //删除图片
    public static boolean deleteFile(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }

}
