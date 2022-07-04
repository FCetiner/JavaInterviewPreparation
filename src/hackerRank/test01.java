package hackerRank;

public class test01 {

    public static void main(String[] args) {
        String str="aabbccdd";
        System.out.println(StringChallenge(str));
    }

    public static String StringChallenge(String str) {
        char[] harfler=str.toCharArray();
        int length=harfler.length;
        String result="";
        int count=1;
        for(int i=0;i<length-1;i++){
            count=1;
            if(harfler[i]==harfler[i+1]){
                //  System.out.print("harfler[i] : "+harfler[i] );
                for(int j=i+1;j<length;j++){
                    if(harfler[i]==harfler[j]){
                        //  System.out.print(" harfler[j] : "+harfler[j] );
                        count++;
                        //  System.out.print(" count : "+count );
                    }else{
                        //   System.out.println(" harfler[i]else : "+harfler[i] );
                        break;
                    }
                }
                if(!result.contains(harfler[i]+"")){
                    //    System.out.println(" harfler[i]2 : "+harfler[i]+" "+i );
                    result+=count+""+harfler[i];
                    //   System.out.println(" result : "+result );
                }
            }else{
                if(!result.substring(result.length()-1).contains(harfler[i]+"")){
                    //     System.out.println(" str.charAt(str.lastIndexOf(str)): "+str.charAt(str.lastIndexOf(str))+" "+i +" index "+str.lastIndexOf(str));
                    //       System.out.println(" harfler[i]son : "+harfler[i]+" "+i );
                    result+=count+""+harfler[i+1];
                }
            }
        }
        if(harfler[harfler.length-1]!=harfler[harfler.length]){
            result+=1+""+harfler[harfler.length];
        }
        return result;
    }
    }