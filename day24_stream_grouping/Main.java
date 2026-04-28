package day24_stream_grouping;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("田中", "営業"),
            new Employee("佐藤", "開発"),
            new Employee("鈴木", "営業"),
            new Employee("高橋", "開発"),
            new Employee("山田", "総務")
        );

        // 🔥 Streamでグルーピング
        Map<String, List<String>> result =
            employees.stream()
                .collect(Collectors.groupingBy(
                    e -> e.department,                      // キー
                    Collectors.mapping(e -> e.name, Collectors.toList()) // 値
                ));

        // 出力
        result.forEach((dept, names) ->
            System.out.println(dept + ": " + names)
        );
    }
}