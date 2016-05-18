package com.mycompany.main;

import com.mycompany.text.Sentence;
import com.mycompany.text.Text;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Text");
        System.out.println("--------------------------------------------------");
        Text text = new Text("Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. If you think that Maven could help your project, you can find out more information about in the \"About Maven\" section of the navigation. This includes an in-depth description of what Maven is, a list of some of its main features, and a set of frequently asked questions about what Maven is.");
        System.out.println(text.getText());
        System.out.println("");

        List<Sentence> listOfSentence = text.splitSentences();

        System.out.println("List of sentences without Vowels");
        System.out.println("--------------------------------------------------");
        for (Sentence sentence : listOfSentence) {
            System.out.println(text.replaceVowels(sentence.getSentence()));

        }

    }
}
