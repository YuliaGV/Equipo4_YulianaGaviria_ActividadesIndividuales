package Ejercicio1;

import java.util.*;

public class Ejercicio1 {



    /*
    Armar un programa para organizar un "amigo invisible": Este programa debe permitir a los participantes ingresar sus nombres.
    Luego, cada participante debe sentarse frente a la computadora, escribir su nombre y recibir una indicación sobre a quién debe darle un regalo.
    El programa también debe limpiar la consola después de que cada participante haya visto su indicación.
     */




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numPlayers = 0;

        while(numPlayers ==0  || numPlayers % 2 != 0){
            System.out.println("¿Cuántas personas quieren jugar? número par");
            numPlayers = sc.nextInt();
            sc.nextLine();
        }


        List<String> listPlayer =  new ArrayList<>();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Ingresa el nombre del jugador # "+i);
            listPlayer.add(sc.nextLine());
        }

        System.out.println("\nOk, vamos a jugar: ");

        Map<String, String> pairList = new HashMap<>();

        Random random = new Random();
        while(pairList.size() < listPlayer.size()){

            System.out.println("Ingresa tu nombre: ");
            String playerName = sc.nextLine();

            if(pairList.containsKey(playerName)){
                System.out.println("Debes darle un regalo a: "+pairList.get(playerName));

            }else{

                if(listPlayer.contains(playerName)){
                    int randomNumber;
                    String playerFound;
                    do {
                        randomNumber = random.nextInt(listPlayer.size());
                        playerFound = listPlayer.get(randomNumber);

                    } while (playerFound.equals(playerName) || pairList.containsValue(playerFound));

                    pairList.put(playerName, playerFound);
                    System.out.println("Debes darle un regalo a "+playerFound);


                }else{
                    System.out.println("No estás registrado en la lista de jugadores");
                }


            }

        }




    }

}
