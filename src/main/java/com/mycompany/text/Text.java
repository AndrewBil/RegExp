package com.mycompany.text;

import com.mycompany.text.Sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private List<Sentence> sentences;

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }


    public List<Sentence> splitSentences() {

        sentences = new ArrayList<Sentence>();
        Pattern endSentence = Pattern.compile("[^.|!|?]+((\\.\\s)|(\\!\\s)|(\\?\\s))");
        Matcher matchEndOfSentence = endSentence.matcher(this.text);
        while (matchEndOfSentence.find()) {
            if (matchEndOfSentence.group() != null) {
                sentences.add(new Sentence(matchEndOfSentence.group()));
            }

        }
        return sentences;
    }

    public String replaceVowels(String string) {
        String contents = string;
        Pattern p = Pattern.compile(
                "[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(contents);
        contents = m.replaceAll("_");
        return contents;
    }

    public List<Sentence> getSentances() {
        if (sentences == null) {
            System.out.println("No sentence found!");
        }
        ;
        return sentences;
    }
}
