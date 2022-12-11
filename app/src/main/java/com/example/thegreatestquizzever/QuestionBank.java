package com.example.thegreatestquizzever;
import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class QuestionBank {
    private static ArrayList<Question> gameEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("The first video game in the world was \"Pong\"", true),
                    new Question("Mario's first job was a plumber", false),
                    new Question("Super Mario Bros is the best selling video game of all time", false),
                    new Question("The first Nintendo console is the SNES", false),
                    new Question("The Playstation 2 is the best selling console of all time", true),
                    new Question("\"Far Cry\" series is published by EA", false),
                    new Question("Mario originated as a character in \"Donkey Kong\"", true),
                    new Question("The original first person shooter game is \"Half Life\"", false),
                    new Question("Blizzard Entertainment is best known for \"World of Warcraft\"", true),
                    new Question("Nintendo DS is the best selling handheld console", true)
            )
    );
    private static ArrayList<Question> gameMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("\"Final Fantasy 7\" is the best selling \"Final Fantasy\"", true),
                    new Question("The master ball has the highest chance to catch a Pokemon", true),
                    new Question("\"Titanfall 2\" wont the Game of the Year awards in 2016", false),
                    new Question("\"League of Legends\" has 162 Champions as of 2022", true),
                    new Question("\"Sega Saturn\" was the last Sega console", false),
                    new Question("T\"Cyberpunk 2077\" is the most expensive game ever made", false),
                    new Question("\"DFO Duel\" is not featured in EVO 2022", true),
                    new Question("\"Dungeon and Dragons\" was the first official RPG game ever created", true),
                    new Question("Blizzard Entertainment is best known for \"World of Warcraft\"", true),
                    new Question("\"Far Cry\" series is published by EA", false)
            )
    );
    private static ArrayList<Question> gameHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Fire Emblem: Thracia 776 was the last game released as a physical cartridge for the SNES", true),
                    new Question("The \"Kingdom Hearts\" series is a collaboration between Disney and Ubisoft", false),
                    new Question("Brazil had banned the sale of the original \"Grand Theft Auto\"", true),
                    new Question("The Chozo adopted Samus in \"Metroid\" franchise", true),
                    new Question("\"It Takes Two\" won the Game of the Year award in 2020", false),
                    new Question("\"Corrupted Blood\" is the virtual pandemic that struck \"World of Warcraft\" in 2005", true),
                    new Question("The Playstation 3 was used to build a cluster supercomputer for the U.S Air Force", true),
                    new Question("The first \"Call of Duty\" was released in 2002", false),
                    new Question("Blizzard Entertainment is best known for \"World of Warcraft\"", true),
                    new Question("\"Far Cry\" series is published by EA", false)
            )
    );
    private static ArrayList<Question> historyEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("The construction of the Great Wall of China began in the 7th century BC", true),
                    new Question("The year Vietnam gain independence was 1945", true),
                    new Question("The first ruler of the Mongol Emprie was Genghis Khan", true),
                    new Question("World War 1 began in 1914", true),
                    new Question("Mao Zedong came to power in 1938", false),
                    new Question("A Christmas Truce was called during the World War 2", false),
                    new Question("The Great Fire of London happened in 1676", false),
                    new Question("Barack Obama won the 2008 U.S Presidential election", true),
                    new Question("Brexit refers to France leaving the European Union", false),
                    new Question("Nelson Mandela was freed from prison in 1990", true)
            )
    );
    private static ArrayList<Question> historyMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Barack Obama won the 2008 U.S Presidential election", true),
                    new Question("The construction of the Great Wall of China began in the 7th century BC", true),
                    new Question("Brexit refers to France leaving the European Union", false),
                    new Question("The Great Recession lasted from 2007 to 2009", true),
                    new Question("Nelson Mandela was freed from prison in 1990", true),
                    new Question("The Han Dynasty ruled China for 300 years", false),
                    new Question("The Vietnam Veterans Memorial was dedicated in Washington,D.C. in 1982", true),
                    new Question("The North American Free Trade Agreement (NAFTA) went into effect in 1992", false),
                    new Question("World War 1 began in 1914", true),
                    new Question("Mao Zedong came to power in 1938", false)
            )
    );
    private static ArrayList<Question> historyHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("The world's oldest recorded civilization is the Mesopotamia", true),
                    new Question("The first Emperor of Rome was Nero", false),
                    new Question("The Code of Hammurabi has 300 rules", false),
                    new Question("Alexander the Great conquered Egypt in 332 BC", true),
                    new Question("The Parthenon was dedicated to the Greek goddess Athena", true),
                    new Question("King Tutankhamun was 23 when he died", false),
                    new Question("The Great Pyramid was built as a tomb for Pharaoh Khufu", true),
                    new Question("Nelson Mandela was freed from prison in 1990", true),
                    new Question("The Han Dynasty ruled China for 300 years", false),
                    new Question("Julius Ceasar was assassinated on March 15, 44 BC", true)
            )
    );
    private static ArrayList<Question> scienceEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("In a Vacuum, there are no particles to vibrate", true),
                    new Question("Tree never lose leaves", false),
                    new Question("Electrons are smaller than atoms", true),
                    new Question("The most abundant element in the universe is Hydrogen", true),
                    new Question("Sound travels faster in the water than in the air", true),
                    new Question("Sugarcane is the tallest grass in the world", false),
                    new Question("Tree never lose leaves", false),
                    new Question("Iron is the hardest natural substance", false),
                    new Question("The ears maintain balance of the human body", true),
                    new Question("Lightning can Strike the same place twice", true)
            )
    );
    private static ArrayList<Question> scienceMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("The mantle is made up of molten rocks called magma", true),
                    new Question("The mass and weight of an object are the same things", false),
                    new Question("Largest desert in the world is the Antarctica", true),
                    new Question("The Earth is composed of five different layers", false),
                    new Question("AB negative is the rarest blood type", true),
                    new Question("Chalk is made of limestone", true),
                    new Question("You cannot find bees in the Antarctica", true),
                    new Question("Goldfish's memory can only last 3 seconds", false),
                    new Question("Adult human has 31 teeth", false),
                    new Question("The Earth is composed of five different layers", true)
            )
    );
    private static ArrayList<Question> scienceHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("25% of your bones are NOT in your feet", true),
                    new Question("Lasers work by focusing on sound waves", false),
                    new Question("Your lungs take up 70 meters surface area", true),
                    new Question("Glaciers contain 2% of fresh water in the Earth", true),
                    new Question("Diamonds can last forever", false),
                    new Question("An insulator will not carry an electrical charge", true),
                    new Question("You will be taller if you go to space", true),
                    new Question("It takes 8 hours for the sun's light to reach the Earth", false),
                    new Question("Pumice is the only rock that floats", true),
                    new Question("Mount Everest's peak is the farthest from the center of the Earth", false)
            )
    );
    private static ArrayList<Question> mathEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("The only number that does not have its Roman numeral is 0", true),
                    new Question("The net prime number following  the number 5 is 11", false),
                    new Question("The sum of all the interior angles of a triangle is 180°", true),
                    new Question("If N = 0.999, then 10N equals 9.99", true),
                    new Question("The only prime number that is even is 2", true),
                    new Question("\"e\" has the value of 2.718", true),
                    new Question("One leap year has 86398 days", false),
                    new Question("The number system that has a base of two is decimal", false),
                    new Question("A Icosahedron has 20 sides", true),
                    new Question("The smallest perfect number is 6", true)
            )
    );
    private static ArrayList<Question> mathMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("The perimeter of a circle is called the circumference", true),
                    new Question("Pi can be written as a fraction", false),
                    new Question("A googol is greater than a quadrillion", true),
                    new Question("A shape with eight sides is called an octagon", true),
                    new Question("The smallest perfect number is 6", true),
                    new Question("The top number of a fraction is called the denominator", false),
                    new Question("All sides are equal in an Isosceles triangle", false),
                    new Question("The circles with the same center is called concentric", true),
                    new Question("A jiffy means 1/100th of a second", true),
                    new Question("A nonagon has 7 sides", false)
            )
    );
    private static ArrayList<Question> mathHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("A jiffy means 1/100th of a second", true),
                    new Question("A nonagon has 7 sides", false),
                    new Question("The world's biggest known number is googolplex", true),
                    new Question("The Golden Ration is 1.618", true),
                    new Question("A circle does not have any vertices", true),
                    new Question("A convex shape curves inward", false),
                    new Question("A dodecahedron has 11 sides", false),
                    new Question("A Icosahedron has 20 sides", true),
                    new Question("All sides are equal in an Isosceles triangle", false),
                    new Question("Pi can be written as a fraction", false)
            )
    );

    private static ArrayList<Question> musicEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("The song that blasted Justin Bieber into superstardom is Baby",true),
                    new Question("The violin is bigger than the viola",false),
                    new Question("Drums require far more bodily coordination than other instruments",true),
                    new Question("The harp has a pedestal and a crown",true),
                    new Question("\"Thriller\" is Michael Jackson's most successful song",false),
                    new Question("The guitar is the most bought instrument in the world",false),
                    new Question("The piano is the most played instrument in the world",false),
                    new Question("Chopin is the classical composer who is deaf",true),
                    new Question("Michael Jackson first perform his moonwalk in Billie Jean video",true),
                    new Question("Madonna is the best-selling female artist of all time",true)
            )
    );
    private static ArrayList<Question> musicMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Michael Jackson first perform his moonwalk in Billie Jean video",true),
                    new Question("The saxophone is usually found in a symphonic stage",false),
                    new Question("Madonna is the best-selling female artist of all time",true),
                    new Question("The violin was invented in Italy",true),
                    new Question("Robert Burns composed the song Auld Lang Syne",true),
                    new Question("Mariah Carey sang the song \"All I Want For Christmas Is You\"",true),
                    new Question("The piano was invented in Spain",false),
                    new Question("A classical guitar has 8 strings",false),
                    new Question("Chopin composed 6 Ballades",false),
                    new Question("\"Thriller\" is Michael Jackson's most successful song",false)
            )
    );
    private static ArrayList<Question> musicHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Sherlock Holmes played the violin",true),
                    new Question("A piano can have up to 88 keys",true),
                    new Question("Someone who makes or repairs stringed instruments is called a luthier",true),
                    new Question("Chopin composed 6 Ballades",false),
                    new Question("Johannes Brahms composed 21 Hungarian Dances",true),
                    new Question("A modern orchestra is divided into 5 sections",false),
                    new Question("Paul McCartney is the one from the band \"The Beatles\" who worked on a James Bond theme song",true),
                    new Question("Luis Fonsi and Daddy Yankee topped the chart in 47 with the song \"Despacito\"",true),
                    new Question("The violin was invented in Italy",true),
                    new Question("\"Thriller\" is Michael Jackson's most successful song",false)
            )
    );
    private static ArrayList<Question> sportsEasyQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("Players wear kneepads in Ice Hockey",true),
                    new Question("Players use a bat to play cricket",true),
                    new Question("Badminton can be played with 4 people",true),
                    new Question("Three players can play table tennis",false),
                    new Question("Golf is play by struck a ball with a club into holes",true),
                    new Question("Basketball is a team sport in which two teams of 6 players are separated by a net",false),
                    new Question("In football when a player gets a red card, he must leave the field for 3 minutes and is allowed to come back after the power play is over",false),
                    new Question("Using tube to breath under water called swimming",false),
                    new Question("In football you can throw the ball",false),
                    new Question("Players wear gloves when playing table tennis",false)

            )
    );
    private static ArrayList<Question> sportsMediumQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("In baseball and American football, special clothes are bought to keep the players safe",true),
                    new Question("All sports need to be played in teams",false),
                    new Question("Gymnastics is a sport in which is important to have balance, strength, flexibility, agility, coordination, endurance and control",true),
                    new Question("Competitive swimming is one of the most popular Olympic sports",false),
                    new Question("Wimbledon is a tournament of tennis",true),
                    new Question("Badminton and tennis is the only 2 sport that use racket to play",false),
                    new Question("The Olympics are held every 5 years",false),
                    new Question("An average round of golf has 18 holes",true),
                    new Question("There are 11 players on a baseball team",false),
                    new Question("Hockey does not use a ball",true)
            )
    );
    private static ArrayList<Question> sportsHardQuestion = new ArrayList<>(
            Arrays.asList(
                    new Question("World cup 1990 was held in Italy",true),
                    new Question("Brasil won world cup the most",true),
                    new Question("There were 28 sports in the 2008 Summer Olympics",true),
                    new Question("Novak Djokovic has the most Wimbledon",false),
                    new Question("An NFL football weights 1 pound",true),
                    new Question("The first NFL game was in the 1800's",false),
                    new Question("Lebron James was born in the same hospital as Kevin Durant",false),
                    new Question("Women can free skate for four an a half minutes in figure skating",false),
                    new Question("Brazil is the only country to have playe in every single soccer World Cup",true),
                    new Question("In baseball, the visiting team gets the advantage of the first bat",true)
            )
    );

    public static ArrayList<Question> getQuestionList(@NonNull String topicName, @NonNull String level) {
        ArrayList<Question> questionList = new ArrayList<>();
        ArrayList<Integer> questionIndex = new ArrayList<>();
        Random rand = new Random();
        int range = 10;
        int randomNumber = rand.nextInt(range);
        questionIndex.add(randomNumber);
        for (int i=0; i<4; i++) {
            while (questionIndex.contains(randomNumber)) {
                randomNumber = rand.nextInt(range);
            }
            questionIndex.add(randomNumber);
        }
        String category = topicName;
        String difficulty = level;
        if (category == "Game") {
            if (difficulty == "Easy"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, gameEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (difficulty.equals("Normal")) {
                for (int i=0; i<5; i++) {
                    questionList.add(i, gameMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, gameHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else if (category == "History") {
            if (difficulty == "Easy"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, historyEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (difficulty == "Normal") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, historyMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, historyHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else if (category == "Science") {
            if (difficulty.equals("Easy")){
                for (int i=0; i<5; i++) {
                    questionList.add(i, scienceEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (difficulty == "Normal") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, scienceMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, scienceHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else if (category == "Maths"){
            if (difficulty == "Easy"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, mathEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (difficulty == "Normal") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, mathMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, mathHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else if (category == "Music"){
            if (difficulty == "Easy"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, musicEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (difficulty == "Normal") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, musicMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, musicHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        else{
            if (difficulty == "Easy"){
                for (int i=0; i<5; i++) {
                    questionList.add(i, sportsEasyQuestion.get(questionIndex.get(i)));
                }
            }
            else if (difficulty == "Normal") {
                for (int i=0; i<5; i++) {
                    questionList.add(i, sportsMediumQuestion.get(questionIndex.get(i)));
                }
            }
            else {
                for (int i=0; i<5; i++) {
                    questionList.add(i, sportsHardQuestion.get(questionIndex.get(i)));
                }
            }
        }
        return questionList;
    }
}