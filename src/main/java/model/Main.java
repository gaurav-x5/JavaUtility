package model;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>(Arrays.asList(
                User.builder().name("John").age(33).build(),
                User.builder().name("Robert").age(26).build(),
                User.builder().name("Mark").age(26).build(),
                User.builder().name("Brandon").age(42).build())
        );

        List<User> sortedList = userList.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("-----------------------");

        List<User> sortedReversedList = userList.stream().sorted(Comparator.comparingInt(User::getAge).reversed()).collect(Collectors.toList());
        sortedReversedList.forEach(System.out::println);

        System.out.println("-----------------------");

        List<User> sortedList_v1 = userList.stream().sorted((o1,o2) -> {
            return Integer.compare(o1.getAge(),o2.getAge());
        }).collect(Collectors.toList());

        sortedList_v1.forEach(System.out::println);

        System.out.println("-----------------------");

        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };

        List<User> sortedList_v2 = userList.stream().sorted(userComparator).collect(Collectors.toList());
        sortedList_v2.forEach(System.out::println);
    }
}
