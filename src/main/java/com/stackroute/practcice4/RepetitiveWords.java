package com.stackroute.practcice4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepetitiveWords {

    public static List<IndexWrapper> find(String s, String word){
        Pattern pattern = Pattern.compile(word);

        List<IndexWrapper> indexList = new ArrayList<IndexWrapper>();
        Matcher match = pattern.matcher(s);
        while(match.find()){
            int start = match.start();
            int end = match.end();

            IndexWrapper indexWrapper = new IndexWrapper(start, end);
            indexList.add(indexWrapper);
        }

        return indexList;
    }

    public static void main(String args[]){

    }
}
