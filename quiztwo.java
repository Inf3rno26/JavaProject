import java.util.Scanner;

public class quiztwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] questions = { "What is the capital of India?", "What is the Capital of UP?",
                "Who is the PM of India?" , "Who is the CM of Maharashtra?" , 
                "What is the Silicon Valley of India?",
                "India is surrounded by how many oceans?"};

        String[][] options = { { "1. Delhi", "2. New Delhi", "3. Bangalore", "4. Lucknow" },
                { "1. Delhi", "2. Bangalore", "3. Lucknow", "4. Hyderabad" },
                { "1. Yogi Adityanath", "2. Devendra Fadnavis", "3. Amit shah", "4. Narendra Modi"},
                { "1. Yogi Adityanath", "2. Devendra Fadnavis", "3. Amit shah", "4. Narendra Modi" },
                { "1. Delhi", "2. Lucknow", "3. Bangalore", "4. Hyderabad" }, 
                { "1. 2" , "2. 3" , "3. 4" , "4. 5"}};

        int[] answers = { 2, 3, 4 , 2, 3, 2};
        int guess;
        int scores = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("WOHH! ITS CORRECT");
                scores += 10;
            }
            else{
                System.out.println("BOO! Its incorrect!");
            }
            System.out.println("Your total score is: " + scores);
        }
       scanner.close();     
    }
}
