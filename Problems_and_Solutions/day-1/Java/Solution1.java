class Solution1 {
    public static int dataTypeSize(String str) {
        if(str.equals("Character")){
            return 2;
        }else if(str.equals("Integer") || str.equals("Float")){
            return 4;
        }else if(str.equals("Double") || str.equals("Long")){
            return 8;
        }
        return -1;
    }
    
    public static void main(String args[]){
        String testCase = "Character";
        System.out.println(dataTypeSize(testCase));
    }
}