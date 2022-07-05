public class CompressString {
    public static void main(String[] args) {
        char[] c = {'a','a','b','b','c','c','c'};
        System.out.println(myFunc(c));
    }

    static int myFunc(char[] chars){
        int it = 0;
        int pointer = 0;
        
        while(it < chars.length){
            int j = it+1;
            
            while(j < chars.length && chars[it] == chars[j]){
                j++;
            }
            
            chars[pointer++] = chars[it];
            int count = j - it;
            
            if(count > 1){
                String temp = Integer.toString(count);
                
                for(int z = 0 ; z<temp.length() ; z++){
                    chars[pointer++] = temp.charAt(z);
                }
            }
            
            it = j;
            
        }
        for(int i=0 ; i<pointer ; i++){
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        return pointer;
    }
}
