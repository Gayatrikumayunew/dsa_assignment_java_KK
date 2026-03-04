public class _13_palindromstring {
    public static void main(String[] args) {
        String a="raaabr";
        String pal="";
        for(int i=a.length()-1;i>=0;i--){
            pal=pal+a.charAt(i);

        }
if(pal.equals(a)){
    System.out.println("palindrom String");
}else{
    System.out.println("not palindrom");
}
    }
}
