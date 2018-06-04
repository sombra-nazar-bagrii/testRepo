

/**
 * Created by sombra-78 on 30.05.18.
 */
public class Main {
    private int a =1;
    int i =0;

    public static void main(String[] args) {

    }

    public class Inner{
        void changea(){
            a = 2;
        }
    }

    void method(){

    }

    Inter inta = new Inter(){
        public int doSMS(int a) {
            return 0;
        }
    };


    public static class StaticClass{

    }

    // якщо клас юзається лише в цьому класі
    // дає можливість доступу до прайвет філдів зовнішнього класу
    // написання коду недалеко від місця його використання (збільшує розуміння коду)

}
