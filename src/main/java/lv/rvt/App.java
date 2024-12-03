package lv.rvt;


import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Person> persons = PersonManager.getPersonList();
        for (Person person : persons) {
            System.out.println(person);
        }

    }
}
