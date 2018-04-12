import java.util.ArrayList;
import java.util.Comparator;

public class Start {

    static int countGoodEmployees(Manager [] managers) {
        int count=0;
        for (Manager employee: managers) {
            if (employee.isGoodEmployee()) count++;
        }
        return count;
    }

    static double getMiddleAge(Manager [] managers) {
        double sumAge=0;
        for (Manager employee: managers) {
            sumAge=sumAge+employee.getAge();
        }
        return (sumAge/managers.length);
    }


    public static void main(String[] args) {
        Manager [] managers = new Manager[] {
                new Manager("Sergey","Sudar","Anatolevich",25,true),
                new Manager("Igor","Poker","Grief",19,false),
                new Manager("Arni","Schwarz","Ilita",66,true),
                new Manager("Anton","Lohoworoh","Taksebe",47,false)
        };

        System.out.println("Количество норм пацанов " +countGoodEmployees(managers));
        System.out.println("Middle age is " +getMiddleAge(managers));


        ArrayList<Manager> managerArrayList = new ArrayList<>();
        for (Manager manager: managers) {
            managerArrayList.add(manager);
        }

        managerArrayList.sort(new Comparator<Manager>() {
            @Override
            public int compare(Manager o1, Manager o2) {
                return  ((Integer)o1.getAge()).compareTo(o2.getAge());
            }
        });

        for (Manager manager: managerArrayList) {
            System.out.println(manager.getAge() +" " +manager.getFirstName());
        }

        managerArrayList.sort(new Comparator<Manager>() {
            @Override
            public int compare(Manager o1, Manager o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        System.out.println();
        for (Manager manager: managerArrayList) {
            System.out.println(manager.getFirstName());
        }


    }



}
