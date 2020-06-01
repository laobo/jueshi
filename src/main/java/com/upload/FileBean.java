package com.upload;

import java.io.Serializable;

/**
 * Created by duanxiangchao on 2018/11/14
 */
public class FileBean implements Serializable {

    private Integer fileId;

    private String filePath;

    private String fileName;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"fileId\":")
                .append(fileId);
        sb.append(",\"filePath\":\"")
                .append(filePath).append('\"');
        sb.append(",\"fileName\":\"")
                .append(fileName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
