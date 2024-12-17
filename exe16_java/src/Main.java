import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String path = null;
        String lineBr = null;

        System.out.print("Digite o endereço do arquivo: ");
        path = scan.nextLine();

        Map<String, Integer> votes = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            do{

                lineBr = br.readLine();

                if(lineBr != null){

                    String[] split = lineBr.split(",");

                    int cont = 0;
                    String name = split[0];
                    int voteQuantity = Integer.parseInt(split[1]);

                    if(votes.containsKey(name)){
                        int vote = votes.get(name);
                        votes.put(name, vote + voteQuantity);
                    } else {
                        votes.put(name, voteQuantity);
                    }

                } else {
                    break;
                }

            } while (true);

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        scan.close();

    }
}