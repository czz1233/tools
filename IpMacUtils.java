package com.controller;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;

public class IpMacUtils{
	public static void main(String[] args) {
		InetAddress ia = null;
		try {
			// doc·��
			//Document document = new Document("C:\\Users\\123\\Desktop\\1.docx");
			// pdf·��
			//File outputFile = new File("d:\\1.pdf");
			// �����ĵ�����
			
			/*String st="12331.word";
			 String name =st.indexOf(".");
			String path1 = Thread.currentThread().getContextClassLoader().getResource("").getPath();
			System.out.println(path1);*/
			//document.save(outputFile.getAbsolutePath(), com.aspose.words.SaveFormat.PDF);
			
			try {
				ia = ia.getLocalHost();
				String localname = ia.getHostName();
				String localip = ia.getHostAddress();
				System.out.println("���������ǣ�" + localname);
				System.out.println("������ip�� ��" + localip);
			} catch (Exception e) {
				e.printStackTrace();
			}
			InetAddress ia1 = InetAddress.getLocalHost();// ��ȡ����IP����

			
		
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
				// mac[i] & 0xFF ��Ϊ�˰�byteת��Ϊ������
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
		// ��������ǰ�mac��ַƴװ��String
		
	}
}
