package com.will;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Ask the magic 8 ball anything your heart desires...");

        String[] magicAnswers = {
                "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it",
                "As I see it yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again",
                "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"
        };


        while (true) {
            counter += 1;
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            if (counter <= 3){
                Random random = new Random();
                int index = random.nextInt(magicAnswers.length);
                System.out.println(magicAnswers[index]);
            } else {
                System.out.println("You have reached your daily question limit. Goodbye!");
                System.exit(0);
            }
        }


    }
}
