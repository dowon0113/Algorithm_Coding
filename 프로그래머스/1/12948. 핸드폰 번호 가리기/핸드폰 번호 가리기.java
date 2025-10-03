class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String front = phone_number.substring(0, phone_number.length()-4);
        String back = phone_number.substring(phone_number.length()-4);
        String go = front.replaceAll("[0-9]","*");
        answer = go + back;
        return answer;
    }
}