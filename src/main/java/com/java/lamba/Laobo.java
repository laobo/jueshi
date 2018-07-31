package com.java.lamba;

/**
 * Created by duanxiangchao on 2018/6/13
 */
public class Laobo {

    private Long id;

    private String name;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
