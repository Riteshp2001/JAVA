package Strings;

public class DuplicateWordsString {
    public static void main(String[] args) {
        String temp = "Hello World this is Magic,By - Ritesh Hello Ritesh Pandit World";

        int count = 0;

        String Norepeated = "";

        String[] arr = temp.split(" ");

        char[] vowels = {'a','e','i','o','u'};

        char[] tempchars = temp.toCharArray();

        for(int i =0;i<arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }else{
                    if(temp.contains(arr[i]) && !Norepeated.contains(arr[i])){
                        Norepeated+=arr[i]+" ";
                    }
                }
            }
        }

        int vowelcount = 0;
        for(int i =0;i< tempchars.length;i++){
            for(int j = 0;j< vowels.length;j++){
                if(tempchars[i] == vowels[j]){
                    vowelcount++;
                }
            }
        }
        //printing all statements
        System.out.println("\n"+temp+"\n");
        System.out.println("Number of repeated Strings are "+count);
        System.out.println("Number of Given words in given string are "+arr.length);
        System.out.println("String with no repeated words are : "+Norepeated);
        System.out.println("Number of vowels in given String are "+vowelcount);
    }
}
