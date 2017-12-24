package xmren;

import java.io.File;
import java.io.FileFilter;

class Test48 {
	
	   double method(int i) throws Exception   {
		      return i/0;
		   }
		   boolean method(boolean b) {
		      return !b;
		   }
		   static double method(int x, double y) throws Exception  {
		      return x + y ;
		   }
		   static double method(double x, double y) {
		      return x + y - 3;
		   }   
	   public static void main(String[] args) {
		   
		   
	      File dir = new File("F:");
	      File[] files = dir.listFiles();
	      FileFilter fileFilter = new FileFilter() {
	         public boolean accept(File file) {
	            return file.isDirectory();
	         }
	      };
	      files = dir.listFiles(fileFilter);
	      System.out.println(files.length);
	      if (files.length == 0) {
	         System.out.println("目录不存在或它不是一个目录");
	      }
	      else {
	         for (int i=0; i< files.length; i++) {
	            File filename = files[i];
	            System.out.println(filename.toString());
	         }
	      }
	      
	      
	      try {
	    	  System.out.println("1123");
	        //  throw new Exception("My Exception");
	      } catch (Exception e) {
	          System.err.println("Caught Exception");
	          System.err.println("getMessage():" + e.getMessage());
	          System.err.println("getLocalizedMessage():"
	          + e.getLocalizedMessage());
	          System.err.println("toString():" + e);
	          System.err.println("printStackTrace():");
	          e.printStackTrace();
	      }
	      
	      
	      
	      Test48 mn = new Test48();
	      try{
	         System.out.println(method(10, 20.0));
	         System.out.println(method(10.0, 20));
	         System.out.println(method(10.0, 20.0));
	         System.out.println(mn.method(10));
	      }
	      catch (Exception ex){
	         System.out.println("exception occoure: "+ ex);
	      }
	   }
	   
	}