
import java.util.Stack;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //кол-во элементов стека
        System.out.println("Введите кол-во элементов стеке ");
        int size = scanner.nextInt();

        //создание и заполнение первого и второго стека
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        System.out.println("Введите элементы первого стека");
        stack1 = stackComp(size);
        System.out.println("Введите элементы  второго  стека");
        stack2 = stackComp(size);

        //вывод стеков до смены информации
        System.out.println("Первый стек до смены " + stack1);
        System.out.println("Второй стек до смены " + stack2);

        //Трансфер данных в динамический массив
        List<Integer> tempList1 = dataTransfer(stack1, size);
        List<Integer> tempList2 = dataTransfer(stack2, size);

        //Получение результата
        stack1.addAll(tempList2);
        Collections.reverse(stack1);
        stack2.addAll(tempList1);
        Collections.reverse(stack2);
        System.out.println("Стек 1 после смены информации" + stack1);
        System.out.println("Стек 2 после смены информации" + stack2);
    }

    //    заполнение стека с клавиатуры
    public static Stack<Integer> stackComp(int size) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack.push(scanner.nextInt());
        }
        return stack;
    }

    //Перенос данных из стеков в динамический массивы
    public static List<Integer> dataTransfer(Stack<Integer> stack, int size) {
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < size; i++)
            tempList.add(stack.pop());
        return tempList;
    }
}
