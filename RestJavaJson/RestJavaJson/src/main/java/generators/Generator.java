package generators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    private static Gson gson;
    private static Random Rand;
    private int startId;
    private int maxAge;
    private int minAge;
    private List<Person> persons;
    private static String[] FirstNames =
    {
        "Andrea", "Marie", "Noah", "Ellen", "Astrid", "Bertram", "Christian", "Jonas", "Oliver", "Johan", "Storm", "Malou", "Jonathan", "Sofia", "Jonathan", "Mikkel", "Karla", "Sara", "Elliot", "Mille", "Sebastian", "Felix", "Jakob", "Isabella", "Karla", "Marius", "Marcus", "Philip", "Laurits", "Sebastian", "Maja", "Silje", "Rosa", "William", "Oscar", "Astrid", "Ella", "Filippa", "Alma", "Mathilde", "Laurits", "Johan", "Storm", "Ida", "Johanne", "Esther", "Sofia", "Laura", "Philip", "Mikkel"
    };
    private static String[] LastNames =
    {
        "Hansen", "Møller", "Petersen", "Christensen", "Kristensen", "Poulsen", "Andersen", "Jørgensen", "Poulsen", "Christiansen", "Knudsen", "Larsen", "Poulsen", "Christensen", "Christensen", "Hansen", "Rasmussen", "Andersen", "Christensen", "Larsen", "Olsen", "Larsen", "Larsen", "Larsen", "Thomsen", "Christiansen", "Knudsen", "Jensen", "Møller", "Møller", "Pedersen", "Larsen", "Mortensen", "Christensen", "Møller", "Rasmussen", "Rasmussen", "Vad", "Johansen", "Poulsen", "Thomsen", "Nielsen", "Petersen", "Jensen", "Olsen", "Madsen", "Møller", "Rasmussen", "Madsen", "Pedersen"
    };

    public Generator()
    {
        this.minAge = 17;
        this.maxAge = 70;
        persons = new ArrayList<>();
        if (gson == null)
        {
            gson = new GsonBuilder().setPrettyPrinting().create();
        }
        if (Rand == null)
        {
            Rand = new Random();
        }
    }

    public String generate(int amount, int startId)
    {
        this.startId = startId;
        for (int i = 0; i < amount; i++)
        {
            Person person = new Person(this.startId, getRandFirst(), getRandLast(), getRandAge());
            this.startId++;
            this.persons.add(person);
        }
        return gson.toJson(this.persons);
    }

    private String getRandFirst()
    {
        return FirstNames[Rand.nextInt(FirstNames.length)];
    }

    private String getRandLast()
    {
        return LastNames[Rand.nextInt(LastNames.length)];
    }

    private int getRandAge()
    {
        return Rand.nextInt(this.maxAge + 1 - this.minAge) + this.minAge;
    }

}
