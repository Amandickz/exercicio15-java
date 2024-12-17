import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        int quant;

        System.out.print("Quantos alunos no curso A? ");
        quant = scan.nextInt();
        for (int i = 0; i < quant; i++) {
            a.add(scan.nextInt());
        }

        System.out.print("Quantos alunos no curso B? ");
        quant = scan.nextInt();
        for (int i = 0; i < quant; i++) {
            b.add(scan.nextInt());
        }

        System.out.print("Quantos alunos no curso C? ");
        quant = scan.nextInt();
        for (int i = 0; i < quant; i++) {
            c.add(scan.nextInt());
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de Estudantes: " + total.size());

        scan.close();

    }
}