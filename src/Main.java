public class Main {
    public static void main(String[] args) {

        Myhashmap <Integer,String> clients = new Myhashmap<Integer, String>();


        System.out.println(clients.isEmpty());

        clients.put(1, "Смирнов");
        clients.put(2, "Иванов");
        clients.put(3, "Петров");

        System.out.println(clients.isEmpty());

        clients.size();
        System.out.println(clients);
        System.out.println(clients.size());

        System.out.println(clients.get(1));
        System.out.println(clients.get(2));
        System.out.println(clients.get(3));

        clients.remove(1);
        System.out.println(clients);

        System.out.println(clients.remove(4));

        System.out.println(clients.size());

        System.out.println(clients.containsKey(1));

        System.out.println(clients.containsKey(2));

        System.out.println(clients.containsValue("Смирнов"));

        System.out.println(clients.containsValue("Иванов"));

        System.out.println(clients.keySet());

        System.out.println(clients.values());

        System.out.println(clients.entrySet());



    }
}