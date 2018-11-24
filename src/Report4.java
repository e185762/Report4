public class Report4 {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("例外:NullPointerExceptionが発生しました。");
            System.out.println("エラー:"+e.getMessage());
        }
    }
}
