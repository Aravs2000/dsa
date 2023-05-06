public class MergeAlternately {
    public static void main(String[] args) {
        String o=mergeAlt("abc","pqrs");
        System.out.println(o);

    }

    public static String mergeAlt(String word1, String word2) {

        StringBuilder res =new StringBuilder("");
        for(int i=0,j=0;i<word1.length()||j<word2.length();i++,j++){
            if(i< word1.length()) res.append(word1.charAt(i));
            if(j<word2.length()) res.append(word2.charAt(j));
        }

        return res.toString();
    }


}
