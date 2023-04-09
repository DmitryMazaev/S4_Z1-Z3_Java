import java.util.Scanner;

//Задача 3. В калькулятор добавьте возможность отменить последнюю операцию.

public class Z3 
{   
    public static void main (String[] args)
    {
        //Scanner in = new Scanner(System.in);
        int count = 0;
        //in.close();
        while(true) 
        {
            Scanner in = new Scanner(System.in);
            if (count == 0)

                //Scanner in = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                int a = in.nextInt();

                System.out.println("Выберите действие: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
                int d = in.nextInt();

                System.out.print("Введите второе число: ");
                int b = in.nextInt();
                in.close();
                int result = 0;

                if (d == 1 || d == 2 || d == 3 || d == 4)
                {
                    if (d == 1)
                    {
                        result = a + b;
                        System.out.println(a + "+" + b + "=" + result);
                    }
                }
            else if (count > 1)
            {
                System.out.println("Выберите действие: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
                int d1 = in.nextInt();

                System.out.print("Введите второе число: ");
                int b1 = in.nextInt();
                in.close();
                if (d1 == 1 || d1 == 2 || d1 == 3 || d1 == 4)
                {
                    if (d1 == 1)
                    {
                        int result1 = result + b1;
                        System.out.println(result + "+" + b1 + "=" + result1);
                    }
                }

            }
        count +=1;
        //in.close();
        //System.out.println(count);
        }    
    }
}