import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/* Задача 1. Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернёет «перевёрнутый» список. */

public class Z1 
{
    public void link()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов LinkedList: ");
        int n = in.nextInt();
        in.close();
     
        LinkedList <Integer> linkedList = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++)
        {
            int a = r.nextInt(0, 10);
            linkedList.add(a);
        }
        System.out.println("Список LinkedList: " + linkedList);

        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        for (int i = 0; i < n; i++)
        {
            arrayList.set(i, linkedList.get(n-1-i));
        }
        System.out.println("Перевернутый список: " + arrayList);


    }
}