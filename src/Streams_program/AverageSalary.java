package Streams_program;

import java.util.*;
import java.util.stream.Collectors;
public class AverageSalary{
    public static void main(String[] args){
        List<Employe> list = Arrays.asList(
                new Employe(1,"Prathamesh",50000),
                new Employe(1,"Harsh",64000),
                new Employe(1,"Subodh",54000),
                new Employe(1,"Aman",57000)
        );
        double AverageSalary= list.stream()
                .mapToDouble(e->e.Salary)
                .average()
                .orElse(0);
        System.out.println(AverageSalary);
    }
}


