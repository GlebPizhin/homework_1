
import java.util.Scanner;

public class Program_map {

    public static void main(String[] args) {

        //Реализация через конструктор Map

        Myhashmap <Integer,String> cit_line = new Myhashmap<Integer, String>();

        while (true) {
            System.out.println("");
            System.out.println("Программа интерактивный дом, выберите действие: 1.Провести заселение дома заново(1), ");
            System.out.println("2.Добавить жильца в дом по номеру квартиры(2), ");
            System.out.println("3.Получить информацию жильца по номеру квартиры(3), ");
            System.out.println("4.Выселить жильца по номеру квартиры (4), ");
            System.out.println("5.Вывести список жильцов (5): ");
            System.out.println("6.Узнать количество заселенных квартир в доме(6): ");
            System.out.print("7.Закончить программу(7): ");
            Scanner scan_chose = new Scanner(System.in);
            int chose_num = scan_chose.nextInt();
            if (chose_num == 1) {

                System.out.print("Вы можете заполнить список жильцов(1) или воспользоваться готовым списком(2):");

                Scanner scan_1 = new Scanner(System.in);

                int var_1 = scan_1.nextInt();

                if (var_1 == 1) {

                    System.out.print("Сколько жильцов живет в доме: ");
                    Scanner scan_2 = new Scanner(System.in);
                    int var_2 = scan_2.nextInt();

                    for (int i = 0; i < var_2; i += 1) {

                        Scanner new_scan = new Scanner(System.in);
                        int cit_num = i + 1;
                        System.out.print("Введите имя жильца под номером " + cit_num + ": ");
                        String new_String = new_scan.nextLine();

                        cit_line.put(i, new_String);
                    }

                } else if (var_1 == 2) {
                    cit_line.put(1, "Петров");
                    cit_line.put(2, "Иванов");
                    cit_line.put(3, "Николаев");
                    cit_line.put(4, "Толмачев");
                    cit_line.put(5, "Гагарин");
                }



            }

            else if (chose_num == 2){
                System.out.print("Введите номер квартиры, в которую хотите заселить нового жильца: ");
                Scanner scan_new_cit_flat = new Scanner(System.in);
                int new_cit_flat = scan_new_cit_flat.nextInt();
                System.out.print("Введите информацию о жильца (фамилия/ФИО): ");
                Scanner scan_new_cit_name = new Scanner(System.in);
                String new_cit_name = scan_new_cit_name.nextLine();
                cit_line.put(new_cit_flat,new_cit_name);
            }

            else if (chose_num == 3) {
                System.out.print("Ввеедите номер квартиры жильца про которого вы хотите узнать информацию: ");

                Scanner scan_3 = new Scanner(System.in);

                int flat_num = scan_3.nextInt();

                System.out.println(cit_line.get(flat_num));

            }

            else if(chose_num == 4){
                System.out.print("Введите номер квартиры жильца которого планируют выселить:");
                Scanner scan_4 = new Scanner(System.in);
                int del_cit_num = scan_4.nextInt();
                cit_line.remove(del_cit_num);

            }

            else if(chose_num==5){
                System.out.println(cit_line.entrySet());
            }

            else if(chose_num==6) {
                System.out.println(cit_line.size());
            }
            else if(chose_num == 7) {
                break;
            }
        }
    }
}

