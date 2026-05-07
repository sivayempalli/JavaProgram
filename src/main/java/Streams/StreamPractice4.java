package Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice4 {
    public static void main(String[] args) throws Exception {

        //Files.list(Path.of("/Users/Siva.KumarYempalli/Desktop")).forEach(System.out :: println);


//        Files.list(Path.of("/Users/Siva.KumarYempalli/Desktop"))
//                .filter(path -> new File(path.toUri()).isDirectory())
//                .forEach(System.out :: println);

        //Files.lines(Path.of("/Users/Siva.KumarYempalli/Desktop/ReadText")).forEach(System.out :: println);

        BufferedReader br = new BufferedReader(new FileReader("/Users/Siva.KumarYempalli/Desktop/ReadText"));
//        br.lines()
//                .map(line -> line.split(" "))
//                .forEach(arr -> System.out.println(Arrays.toString(arr)));

//        br.lines()
//                .map(line -> line.split(" "))
//                .flatMap(words -> Arrays.stream(words))
//                .forEach(System.out :: println);
//
//        List<String> list = br.lines()
//                .map(line -> line.split(" "))
//                .flatMap(words -> Arrays.stream(words))
//                .collect(Collectors.toList());

//        Map<String,Integer> map = br.lines()
//                .map(line -> line.split(" "))
//                .flatMap(words -> Arrays.stream(words))
//                .collect(Collectors.toMap(
//                        w -> w ,
//                        w -> w.length(),
//                        (r,e) -> r
//                ));

//        Map<String,Integer> map = br.lines()
//                .map(line -> line.split(" "))
//                .flatMap(words -> Arrays.stream(words))
//                .collect(Collectors.filtering(word -> word.startsWith("H"),Collectors.toMap( w -> w ,
//                        w -> w.length(),
//                        (r,e) -> r
//                )));

//                Map<Object,List<String>> map = br.lines()
//                .map(line -> line.split(" "))
//                .flatMap(Arrays::stream)
//                .collect(Collectors.groupingBy(String::length));

        String s = br.lines()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .collect(Collectors.joining(" "));

        System.out.println(s);

    }
}
