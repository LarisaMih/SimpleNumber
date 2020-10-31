import java.util.*;

public class ListLern {


    public static void addd() {

        Set set = new HashSet() ;
        set.add(7);
        set.add(8);
        set.add(7);
        set.add(9);
        set.add("qq");
        set.add("qq");

        System.out.println(set);

        List list = new ArrayList();
        list.add(3);
        list.add("jhh");
        list.add(0);
        list.set(1,"t");
        list.removeIf(i->i.equals(3));
        list.remove("0");

        System.out.println(list);
//Распечатать все эементы
        for(Object i:list){
            System.out.println(i);
        }
        //Второй способ распечатать элементы
        Iterator irerator= list.iterator();
        while (irerator.hasNext()){
            System.out.println(irerator.next());
        }

}

}
