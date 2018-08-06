package com.zhanghaif.servicecloudeureka.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class TestController {

	public static void main(String[] args) throws IOException {
        Document doc = DocumentHelper.createDocument();
       
        Element person = doc.addElement("person");
        
        Element name = person.addElement("name");
        Element age = name.addElement("age");
        Element sex = name.addElement("sex");

        Element name1 = person.addElement("name");
        Element age1 = name1.addElement("age");
        Element sex1 = name1.addElement("sex");

        
        name.addAttribute("name", "zhangsan");
        
        age.setText("22");
        sex.setText("men");

        name1.addAttribute("name", "lisi");
        
        age1.setText("23");
        sex1.setText("women");

        //实例化输出格式对象
        OutputFormat format = OutputFormat.createPrettyPrint();
        //设置输出编码
        format.setEncoding("UTF-8");
        //创建需要写入的File对象
        File file = new File("/Users/zhanghaifeng" + File.separator + "test.xml");
        //生成XMLWriter对象，构造函数中的参数为需要输出的文件流和格式
        XMLWriter writer = new XMLWriter(new FileOutputStream(file), format);
        //开始写入，write方法中包含上面创建的Document对象
        writer.write(doc);
	}
}
