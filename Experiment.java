class A{  
int a=10;
A getA(){  
return this;  
}  
void msg(){System.out.println(a);}  
}  
  
class Test{  
public static void main(String args[]){  
new A().getA().msg();  
}  
}  