/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarquizarraylist;

import doublylinkedlist.DNode;
import java.util.Scanner;
import singlylinkedlist.SNode;

/**
 *
 * @author Jeo
 */
public class GrammmarQuizArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * @param args the command line arguments
         */
        Scanner answer = new Scanner(System.in);
//        String[] questions = {"Why do you need _____ dollars?", "Please pursuade him _____ that", "Don't pretend _____ recognize me."};

        int score = 0;
        String PlayerAnswer;

        //questions
        SNode<String> question1 = new SNode<>("Why do you need _____ dollars?", null); //hundred or a hundred
        SNode<String> question2 = new SNode<>("Please pursuade him _____ that", null); // don't do or not do do
        SNode<String> question3 = new SNode<>("I'm always afraid that I'll _____ my house key.", null);//lose or loose
        SNode<String> question4 = new SNode<>("His dog is running around the neighborhood without ___ collar.", null); // it's or its
        SNode<String> question5 = new SNode<>("Marcus ______ ____ told us what he was planning.", null); // could of or could have
        SNode<String> question6 = new SNode<>("The students all took off _____ hats.", null); // there or their
        SNode<String> question7 = new SNode<>("_____ are my twisted words.", null); // this or these
        SNode<String> question8 = new SNode<>("My mom isn't sure _____ going with us.", null); // whose or who's
        SNode<String> question9 = new SNode<>("That group of students ___ going to San Francisco", null); // is or are
        SNode<String> question10 = new SNode<>("____ going to have to do better than that, if you want to pass thhis class.", null); // your or you're

        //choices
        //q1
        DNode<String> choice1 = new DNode<>(null, "0.) hundred", null);
        DNode<String> choice2 = new DNode<>(null, "1.) a hundred", null); //correct

        //q2
        DNode<String> choice3 = new DNode<>(null, "2.) don't do", null);
        DNode<String> choice4 = new DNode<>(null, "3.)not to do", null); // correct

        //q3
        DNode<String> choice5 = new DNode<>(null, "4.) lose", null); //correct
        DNode<String> choice6 = new DNode<>(null, "5.) loose", null);

        //q4
        DNode<String> choice7 = new DNode<>(null, "6.) it's", null); //correct
        DNode<String> choice8 = new DNode<>(null, "7.) its", null);

        //q5
        DNode<String> choice9 = new DNode<>(null, "8.) could of", null);
        DNode<String> choice10 = new DNode<>(null, "9.) could have", null); // could have

        //q6
        DNode<String> choice11 = new DNode<>(null, "10.) their", null); // correct
        DNode<String> choice12 = new DNode<>(null, "11.) there", null);

        //q7
        DNode<String> choice13 = new DNode<>(null, "12.) these", null); //correct 
        DNode<String> choice14 = new DNode<>(null, "13.) this", null);

        //q8
        DNode<String> choice15 = new DNode<>(null, "14.) who's", null); //correct  
        DNode<String> choice16 = new DNode<>(null, "15.) whose", null);

        //q9
        DNode<String> choice17 = new DNode<>(null, "16.) is", null); //correct 
        DNode<String> choice18 = new DNode<>(null, "17.) are", null);

        DNode<String> choice19 = new DNode<>(null, "18.) you're", null); //correct 
        DNode<String> choice20 = new DNode<>(null, "19.) your", null);

        MyArrayList<DNode> ListOfChoices = new MyArrayList<>();
        QuestionLinkedStack<SNode> StackOfQuestions = new QuestionLinkedStack<>();

        try {
            // ang stack is FILO (first-in, last out)
            // so kung mag push mo ug questions unahi sa jud ang last item which is si question10
            //para ang last na ma push si question1 sya pud una ma pop
            //pki insert lng diri ang questions :D

            StackOfQuestions.push(question10);
            StackOfQuestions.push(question9);
            StackOfQuestions.push(question8);
            StackOfQuestions.push(question7);
            StackOfQuestions.push(question6);
            StackOfQuestions.push(question5);
            StackOfQuestions.push(question4);
            StackOfQuestions.push(question3);
            StackOfQuestions.push(question2);
            StackOfQuestions.push(question1);

            ListOfChoices.add(0, choice1);
            ListOfChoices.add(1, choice2);
            ListOfChoices.add(2, choice3);
            ListOfChoices.add(3, choice4);
            ListOfChoices.add(4, choice5);
            ListOfChoices.add(5, choice6);
            ListOfChoices.add(6, choice7);
            ListOfChoices.add(7, choice8);
            ListOfChoices.add(8, choice9);
            ListOfChoices.add(9, choice10);
            ListOfChoices.add(10, choice11);
            ListOfChoices.add(11, choice12);
            ListOfChoices.add(12, choice13);
            ListOfChoices.add(13, choice14);
            ListOfChoices.add(14, choice15);
            ListOfChoices.add(15, choice16);
            ListOfChoices.add(16, choice17);
            ListOfChoices.add(17, choice18);
            ListOfChoices.add(18, choice19);
            ListOfChoices.add(19, choice20);

            //1
            //3
            //4
            //6
            //9
            //10
            //12
            //14
            //16
            //18
            System.out.println("Match the correct grammar \n Type the number of the correct answer on the space provided \n");

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("1")) { //scoring
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("3")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("4")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("6")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("9")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("10")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("12")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("14")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("16")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            while (PlayerAnswer.matches("[a-zA-Z_]+")) {
                System.out.println("Enter number only!");
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();
            }
            if (PlayerAnswer.equalsIgnoreCase("18")) {
                score++;
            }

            System.out.println("\n\nQuiz Finished\n");
            System.out.println("Score: " + score + "/" + "10");

        } catch (InvalidIndexException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
