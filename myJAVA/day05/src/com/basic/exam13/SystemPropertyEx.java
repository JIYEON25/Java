package com.basic.exam13;

public class SystemPropertyEx {
	private static String[][] properties = {	// { 키값, 설명 }
			{"java.version", "Java Runtime Environment version"},
			{"java.vendor", "Java Runtime Environment vendor"},
			{"java.vendor.url", "Java Vendor's URL"},
			{"java.home", "Java installation directory"},
			{"java.vm.specification.version", "Java Virtual Machine specification version"},
			{"java.vm.specification.vendor", "Java Virtual Machine specification vendor"},
			{"java.vm.specification.name", "Java Virtual Machine specification name"},
			{"java.vm.version","Java Virtual Machine implementation version"},
			{"java.vm.vendor", "Java Virtual Machine implementation vendor"},
			{"java.vm.name", "Java Virtual Machine implementation name"},
			{"java.specification.version", "Java Runtime Environment specification version"},
			{"java.specification.vendor", "Java Runtime Environment specification vendor"},
			{"java.specification.name","Java Runtime Environment specification name"},
			{"java.class.version", "Java class format version number"},
			{"java.class.path", "Java class path"},
			{"os.name", "Operating system name"},
			{"os.arch", "Operating system architecture"},
			{"os.version", "Operating system version"},
			{"file.separator", "File separator"},
			{"path.separator", "Path separator"},
			{"line.separator", "Line separator"},
			{"user.name", "User's account name"},
			{"user.home", "User's home directory"},
			{"user.dir", "User's current working directory"}
			};
	public static void main(String[] arg){
		String propValue;
		System.out.println("Current Java properties:");
		System.out.println("------------------------");
		
		for(int i = 0; i < properties.length; i++) {
			try {
				propValue = System.getProperty(properties[i][0]);
				System.out.print(properties[i][1]+" = "); 
				if(properties[i][0].equals("line.separator")) {
				for(int j = 0; j < propValue.length(); j++) {
					if(propValue.charAt(j) == '\n')
						System.out.print("\\n");
					if(propValue.charAt(j) == '\r')
						System.out.print("\\r");
				}
				System.out.println("");
				}
				else {
					if(propValue != null)
						System.out.println(propValue); 
					else
						System.out.println("--NOT DEFINED--");
				}
			} catch(SecurityException se) {
				System.err.println("Could not get value of: " + properties[i][0]);
				System.err.println(se.toString());
			}
		 }
			/*
				Current Java properties:
				------------------------
				Java Runtime Environment version = 17.0.4.1
				Java Runtime Environment vendor = Eclipse Adoptium
				Java Vendor's URL = https://adoptium.net/
				Java installation directory = D:\06_09AM\class5\eclipseJAVA\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.4.v20220903-1038\jre
				Java Virtual Machine specification version = 17
				Java Virtual Machine specification vendor = Oracle Corporation
				Java Virtual Machine specification name = Java Virtual Machine Specification
				Java Virtual Machine implementation version = 17.0.4.1+1
				Java Virtual Machine implementation vendor = Eclipse Adoptium
				Java Virtual Machine implementation name = OpenJDK 64-Bit Server VM
				Java Runtime Environment specification version = 17
				Java Runtime Environment specification vendor = Oracle Corporation
				Java Runtime Environment specification name = Java Platform API Specification
				Java class format version number = 61.0
				Java class path = D:\06_09AM\class5\myJAVA\day05\bin
				Operating system name = Windows 10
				Operating system architecture = amd64
				Operating system version = 10.0
				File separator = \
				Path separator = ;
				Line separator = \r\n
				User's account name = itbank
				User's home directory = C:\Users\itbank
				User's current working directory = D:\06_09AM\class5\myJAVA\day05
			 */
	}
}
