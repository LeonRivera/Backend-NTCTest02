package com.leonrv.crud_bp.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WordService implements IWordService{

    @Override
    public String splitSentence(String inputS) {

        inputS += " ";

        String tempWord = "";
        List<String> tempWordList = new ArrayList<>();
        for (int i = 0; i < inputS.length(); i++) {
            if(inputS.charAt(i) == ' '){ 
                tempWordList.add(tempWord);
                tempWord = "";
                continue;
            }

            //last word
            if(inputS.length() == i-1){
                tempWordList.add(tempWord);
            }

            tempWord += inputS.charAt(i);
        }


        //create the sentence with 50 symbols
        String tempSentence = "";
        List<String> tempSentencesList = new ArrayList<>();
       
        String tempSentenceFor = "";
        for (int i = 0; i < tempWordList.size(); i++) {
            tempSentenceFor += tempWordList.get(i) + " ";
            
            int lenSentence = tempSentenceFor.length();

            if(lenSentence > 50){
                tempSentenceFor = tempSentenceFor.stripTrailing();
                lenSentence = tempSentenceFor.length();
            }
            if(lenSentence <= 50){
                tempSentence += tempWordList.get(i) + " ";
            }else{
                tempSentencesList.add(tempSentence);
                tempSentence = "";
                tempSentenceFor = "";
                tempSentence += tempWordList.get(i) + " ";
                tempSentenceFor += tempWordList.get(i) + " ";
            }
            if(i == tempWordList.size() - 1){
                tempSentencesList.add(tempSentence);
                break;
            }
        }


        inputS = "";
        for(String s : tempSentencesList){
            System.out.println(s);
            inputS += s + "\n";
        }


        return inputS;
    }
    
}
