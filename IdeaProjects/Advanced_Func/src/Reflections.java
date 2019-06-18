import java.lang.reflect.*;

public class Reflections {

    public static void main(String[] args) {
        try {
            Class c=Class.forName("java.lang.Thread");
            Method[] m=c.getDeclaredMethods();
            for(int i=0;i<m.length;i++){
                System.out.println(m[i]);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
