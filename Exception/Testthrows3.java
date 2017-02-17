import java.io.*;  
class M{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
  
  
class Testthrows3{  
   public static void main(String args[]){//declare exception  
   M t=new M();  
    t.method();     
  
    System.out.println("normal flow...");  
  }  
}  