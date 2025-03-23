package org.example;


import java.util.ArrayList;
import java.util.List;

public class StringSplitter {
        public static List<String> splitString(String input ,int partSize){
                List<String> parts=new ArrayList<>();
                int length=input.length();

                for(int i =0;i<length;i+=partSize){
                        parts.add(input.substring(i,Math.min(length,i+partSize)));
                }
                return parts;
        }
        public static void main(String[] args) {
                String input="HelloWorldJavaProgramming";
                int partSize=5;

                List<String> result=splitString(input,partSize);
                System.out.println(result);
        }

        }

