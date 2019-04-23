package com.controller;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;

public class IpMacUtils{
	public static void main(String[] args) {
		InetAddress ia = null;
		try {
			// doc路径
			//Document document = new Document("C:\\Users\\123\\Desktop\\1.docx");
			// pdf路径
			//File outputFile = new File("d:\\1.pdf");
			// 操作文档保存
			
			/*String st="12331.word";
			 String name =st.indexOf(".");
			String path1 = Thread.currentThread().getContextClassLoader().getResource("").getPath();
			System.out.println(path1);*/
			//document.save(outputFile.getAbsolutePath(), com.aspose.words.SaveFormat.PDF);
			
			try {
				ia = ia.getLocalHost();
				String localname = ia.getHostName();
				String localip = ia.getHostAddress();
				System.out.println("本机名称是：" + localname);
				System.out.println("本机的ip是 ：" + localip);
			} catch (Exception e) {
				e.printStackTrace();
			}
			InetAddress ia1 = InetAddress.getLocalHost();// 获取本地IP对象

			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		byte[] mac;
		try {
			mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < mac.length; i++) {
				if (i != 0) {
					sb.append("-");
				}
				// mac[i] & 0xFF 是为了把byte转化为正整数
				String s = Integer.toHexString(mac[i] & 0xFF);
				// System.out.println("--------------");
				// System.err.println(s);
				sb.append(s.length() == 1 ? 0 + s : s);

			System.out.println(sb.toString().toUpperCase());
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 下面代码是把mac地址拼装成String
		
	}
}
