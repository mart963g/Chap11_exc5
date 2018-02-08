package Exc_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exc_05
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add((int) (Math.random() * 15) + 1);
        }
        System.out.println(list);
        sortAndRemoveDuplicates(list);
        System.out.println(list);

    }

    public static void sortAndRemoveDuplicates(List<Integer> list)
    {
        Set<Integer> set = new TreeSet<>();
        for(int i: list)
        {
            set.add(i);
        }
        list.clear();
        list.addAll(set);
    }
}
