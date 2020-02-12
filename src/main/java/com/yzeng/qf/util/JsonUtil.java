package com.yzeng.qf.util;

import java.io.*;

public class JsonUtil {
    /**
     * 读取json文件并转化为字符串
     * @param jsonFile json文件
     * @return 字符串
     * @throws IOException 读取失败
     */
    public static String readJsonFile(String jsonFile) throws IOException {
        // 读取文件数据
        StringBuilder strBuffer = new StringBuilder();
        File myFile = new File(jsonFile);
        if (!myFile.exists()) {
            System.err.println("Can't Find " + jsonFile);
        }
        try {
            FileInputStream fis = new FileInputStream(jsonFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
            BufferedReader in  = new BufferedReader(inputStreamReader);

            String str;
            while ((str = in.readLine()) != null) {
                strBuffer.append(str);
            }
            in.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return strBuffer.toString();
    }
}
