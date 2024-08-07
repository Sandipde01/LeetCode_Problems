class Solution {
    public String convert(String s, int numRows) {
        String ch[] = new String[numRows];
        for(int k=0;k<ch.length;k++){
            ch[k]="";
        }
        int i=0;
        while(i<s.length()){
            for(int j=0;j<numRows && i<s.length();j++){
                ch[j] += s.charAt(i);
                i++;
            }
            for(int j=numRows-2;j>0 && i<s.length();j--){
                ch[j] += s.charAt(i);
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k=0;k<ch.length;k++){
            sb.append(ch[k]);
        }
        return sb.toString();
    }
}