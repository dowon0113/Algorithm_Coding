class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
        
        String lower = new_id.toLowerCase();
        for(int i = 0 ; i<lower.length() ; i++){
            char c = lower.charAt(i);
            if(('a' <= c && c <= 'z') || ('0' <= c && c <= '9') || c == '-' || c == '_'
              || c == '.'){
                sb.append(c);
            }
        }
        //replaceAll("\\.+", ".")
        String str = sb.toString().replaceAll("\\.+",".");
        
        if(str.startsWith(".")){
            str = str.substring(1);
        }
        if(str.endsWith(".")){
            str = str.substring(0, str.length()-1);
        }
        //자바에서 문자열끼리의 비교는 equals()
        if(str.equals("")){
            str="a";
        } 
        
        if(str.length() >=16){
            str = str.substring(0,15);
            if(str.endsWith(".")){
                str = str.substring(0,str.length()-1);
            }
        }
        
        if(str.length() <=2){
            char last = str.charAt(str.length()-1);
            while (str.length() < 3) {
                str += last;
            }
        }
        
        return str;
    }
}