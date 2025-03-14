class ReverseVowel {
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char []c = s.toCharArray();
        boolean flag = false;
        while(start < end){
            if(!isVowel(c[start])){
                start++;
                continue;
            }
            if(!isVowel(c[end])){
                end--;
                continue;
            }
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }
        String result = new String(c);
        return result;
            
    }
    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c== 'o' || c == 'u' || c == 'i'){
            return true;
        }else return false;
    }
    public static void main(String[] args){
        String s = "ice CreAM";
        System.out.println(reverseVowels(s));
    }
}
