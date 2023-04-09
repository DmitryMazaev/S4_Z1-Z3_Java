import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/* Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */

public class Z2 
{
    public void enqueue() //помещает элемент в конец очереди
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов LinkedList: ");
        int n = in.nextInt();
        System.out.print("Введите элемент, который хотите переместить в конец очереди: ");
        int a = in.nextInt();
        in.close();
     
        LinkedList <Integer> linkedList = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++)
        {
            int c = r.nextInt(0, 10);
            linkedList.add(c);
        }
            
        System.out.println("Список LinkedList: " + linkedList);

        linkedList.addLast(linkedList.get(a));
        linkedList.remove(linkedList.get(a));
        System.out.println("Перемещение выбранного элемента в конец очереди: " +  linkedList);
    }
    public void dequeue() //возвращает первый элемент из очереди и удаляет его
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов LinkedList: ");
        int n = in.nextInt();
        in.close();

        LinkedList <Integer> linkedList = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++)
        {
            int c = r.nextInt(0, 10);
            linkedList.add(c);
        }
            
        System.out.println("Список LinkedList: " + linkedList);

        System.out.println("Первый элемент очереди: " + linkedList.get(0));
        linkedList.remove(linkedList.get(0));
        System.out.println("Очередь после удаления первого элемента: " + linkedList);
    }
    public void first() //возвращает первый элемент из очереди, не удаляя
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов LinkedList: ");
        int n = in.nextInt();
        in.close();

        LinkedList <Integer> linkedList = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++)
        {
            int c = r.nextInt(0, 10);
            linkedList.add(c);
        }
            
        System.out.println("Список LinkedList: " + linkedList);

        System.out.println("Первый элемент очереди: " + linkedList.get(0));
    }

}
