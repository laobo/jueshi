package com.itextpdf;

import com.google.common.collect.Lists;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by duanxiangchao on 2019/6/12
 */
public class TestUtil {

    public static void main(String[] args) {
        producePdf(1);
    }

    /**
     * 生成指定试卷pdf
     */
    public static String producePdf(int type) {
        com.itextpdf.text.Document document = new com.itextpdf.text.Document(com.itextpdf.text.PageSize.A4, 50, 50, 100, 55);
        String randomStr = UUID.randomUUID().toString().replaceAll("-", "");
        String newPath = randomStr+".pdf";

        List<User> users = Lists.newArrayList();
        for(int i=0; i<100; i++){
            User user = new User();
            user.setUserName("考生" + i);
            user.setPassword("密码" + i);
            user.setSex("男");
            user.setAddress("地址" + i);
            users.add(user);
        }

        try {
            PdfUtil pdf = new PdfUtil(newPath, document);
            document.open();

            //录入标题
            pdf.addTitle("标题",document);
            //录入材料
            pdf.addBaseTitle("【给定资料】",document);

//            List<EssayMaterial> materialList = paperVO.getMaterialList();
//            for(EssayMaterial material:materialList){
//                pdf.addBaseContent("dadfafasdfasferqwerqaweasdfqweasdrfqwe",  document);
//            }
            //遍历

            for(User user: users){
                pdf.addBaseTitle("[用户名]",  document);
                pdf.addBaseContent(user.toString(),  document);
            }

            document.close();
//            newPath = pdf.addWaterImage(newPath,newLogo,slogan,vhuatu,oldLogo);

        } catch (Exception e) {
            e.printStackTrace();
        }
//        String finalPath = upload(newPath);
        return null;
    }

    public static final BaseFont BASEFONT = getBaseFont();
    public static final Font CONTENT_FONT = new Font(BASEFONT, 11, Font.NORMAL);

    /**
     * 获取中文字体
     *
     * @return
     */
    private static BaseFont getBaseFont() {
        try {
            return BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 添加基本内容
     *
     * @param content
     * @param document
     * @throws Exception
     */
    public void addBaseContent(String content, Document document) throws Exception {
        Paragraph paragraph = new Paragraph(content, CONTENT_FONT);
        paragraph.setIndentationLeft(5);
//        paragraph.setIndentationRight(5);
        paragraph.setAlignment(Element.ALIGN_LEFT);
        document.add(paragraph);
    }


}
