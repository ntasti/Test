
import java.util.Stack;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //кол-во элементов стека
        System.out.println("Введите кол-во элементов стеке ");
        int a = scanner.nextInt();

        //создание и заполнение первого и второго стека
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        System.out.println("Введите элементы первого стека");
        stack1 = StackComp(a);
        System.out.println("Введите элементы  второго  стека");
        stack2 = StackComp(a);

        //вывод стеков до смены информации
        System.out.println("Первый стек до смены " + stack1);
        System.out.println("Второй стек до смены " + stack2);

        //Трансфер данных в динамический массив
        List<Integer> save1 = new ArrayList<>();
        List<Integer> save2 = new ArrayList<>();
        save1 = DataTransfer(stack1, a);
        save2 = DataTransfer(stack2, a);

        //Получение результата
        stack1 = result(save2);
        stack2 = result(save1);
        System.out.println("Стек 1 после смены информации" + stack1);
        System.out.println("Стек 2 после смены информации" + stack2);

    }

    //    заполнение стека с клавиатуры
    public static Stack<Integer> StackComp(int a) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a; i++) {
            int element = scanner.nextInt();
            stack.push(element);
        }
        return stack;
    }

    //Перенос данных из стеков в динамический массивы
    public static List<Integer> DataTransfer(Stack<Integer> stack, int a) {
        List<Integer> save = new ArrayList<>();
        for (int i = 0; i < a; i++)
            save.add(stack.pop());
        Collections.reverse(save);
        return save;
    }

    public static Stack<Integer> result(List<Integer> save) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(save);
        return stack;
    }

}
