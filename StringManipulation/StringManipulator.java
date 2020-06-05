public class StringManipulator{
    public String trimAndConcat(String str1, String str2) {
        String word1Trimmed = str1.trim();
        String word2Trimmed = str2.trim();
        return word1Trimmed.concat(word2Trimmed);
    }
    public Integer getIndexOrNull(String first, char a){
        Integer x=first.indexOf(a);
        if (x>0) return x;
        else return null;
   
    }
    public Integer getIndexOrNull(String stringOne, String stringTwo){
        Integer y=stringOne.indexOf(stringTwo);
        if (y>0) return y;
        else return null;
    }
    public String concatSubstring(String stringA, int a, int b, String stringB){
        String str=stringA;
        str=stringA.substring(a,b);
        return str.concat(stringB);
    }
}
