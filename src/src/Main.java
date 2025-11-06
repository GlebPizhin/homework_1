public class Main {
    public static void main(String[] args) {

        MyHashMap <Integer,String> clients = new MyHashMap<Integer, String>();


        clients.put(0,"Сидоров");
        clients.put(1,"Смирнов");
        clients.put(2,"Иванов");
        clients.put(3,"Петров");

        System.out.println(clients.get(1));

        clients.remove(1);

        System.out.println(clients.get(1));
        System.out.println(clients.get(2));

        clients.put(1,"Краснов");

        System.out.println(clients.get(1));


        for(int i=0;i<=3;i++){
            System.out.println("Под номером " + i + " клиент: " + clients.get(i));
        }


    }
}