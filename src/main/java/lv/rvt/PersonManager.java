package lv.rvt;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws IOException {
        ArrayList<Person> persons = new ArrayList<>();

        BufferedReader reader = Helper.getReader("persons.csv");
        reader.readLine();
        String line;
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            Person person1 = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            persons.add(person1);
        }
        return persons;
       

    }
}
