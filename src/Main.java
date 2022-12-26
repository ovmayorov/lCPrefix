public class Main {
    public static void main(String[] args) {

        //Write a function to find the longest common prefix string amongst an array of strings.
        //
        //If there is no common prefix, return an empty string "".
       // Input: strs = ["flower","flow","flight"]
       // Output: "fl"

//        String[] strs = {"flower","flow","flight"};
//        String pre = "";
//        String prefix="";
//        int count = 0;
//        for(int i=0; i<strs[0].length(); i++){
//            pre = strs[0].substring(0,i+1);
//            for(int j=0; j<strs.length; j++){
//                if(strs[j].substring(0,i+1).equals(pre)){
//                    count++;
//                }
//            }
//            if(count == strs.length) {
//                prefix = pre;
//                count=0;
//            }
//            else
//                break;
//        }
//        System.out.println("common prefix = "+ prefix);


//        for(int i=0; i<strs.length; i++){
//            prefix = strs[i].substring(0,i);
//            for(int j=0; j< strs.length; i++){
//                String substring = strs[j].substring(0,i);
//            }
//
//        }
        String[] strings = {"flower","flow","flowht","flo"};
        String res = longestCommonPrefix(strings);
        System.out.println(res);

    }

        public static String longestCommonPrefix(String[] strs) {

        int smallestWord=strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<smallestWord)
                smallestWord=strs[i].length();
        }

            String pre = "";
            String prefix="";
            int count = 0;
            for(int i=0; i<smallestWord; i++){
                pre = strs[0].substring(0,i+1);
                for(int j=0; j<strs.length; j++){
                    if(strs[j].substring(0,i+1).equals(pre)){
                        count++;
                    }
                }
                if(count == strs.length) {
                    prefix = pre;
                    count=0;
                }
                else
                    break;
            }
            return prefix;

    }
}