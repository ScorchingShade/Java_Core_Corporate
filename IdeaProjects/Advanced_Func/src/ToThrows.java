import java.io.IOException;

public class ToThrows{

        void m1() throws ArrayIndexOutOfBoundsException, IOException{

            int a = 0;

            if(a == 0){
                throw new IOException("This is IOexception.");
            }

            if(a!= 0){
                throw new ArrayIndexOutOfBoundsException("This is  ArrayIndexOutOfBoundsException.");
            }
        }

        public static void main(String a[]) throws ArrayIndexOutOfBoundsException, IOException {

            ToThrows ob1=new ToThrows();
            ob1.m1();
        }

}




/*
* There are many differences between throw and throws keywords. A list of differences between throw and throws are given below:

No.	throw	throws
1)	Java throw keyword is used to explicitly throw an exception.	1)Java throws keyword is used to declare an exception.
2)	Checked exception cannot be propagated using throw only.	    2)Checked exception can be propagated with throws.
3)	Throw is followed by an instance.	                            3)Throws is followed by class.
4)	Throw is used within the method.	                            4)Throws is used with the method signature.
5)	You cannot throw multiple exceptions.	                        5)You can declare multiple exceptions e.g.
                                                                      public void method()throws IOException,SQLException.
*
*
*
* */