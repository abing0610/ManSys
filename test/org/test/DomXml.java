package org.test;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by abing on 2016/10/14.
 */
public class DomXml {

    public static void main(String[] args) throws DocumentException, IOException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("D:\\11.txt"));

        Element root = document.getRootElement();

        List<Element> child = root.elements();

//        Workbook wb = new HSSFWorkbook();
//        Sheet sh = wb.createSheet("test");
//
//
//        int rowCount  = 0;
//        for (Element el : child) {
//
//            List<Element> list = el.elements();
//
////            list.get()
//
////            System.out.println(list.get(0).getName());
////            System.out.println(list.get(0).getText());
//
//            Row row = sh.createRow(rowCount++);
//            for (int k = 0 ; k < list.size() ; k++) {
//                row.createCell(k).setCellValue(list.get(k).getText());
//            }
////            row.createCell(1).setCellValue(el.getText());
//
//
//        }
//
////        //创建一个文件 命名为workbook.xls
//        FileOutputStream fileOut = new FileOutputStream("D:\\test.xls");
//        // 把上面创建的工作簿输出到文件中
//        wb.write(fileOut);
//        //关闭输出流
//        fileOut.close();
    }

}
