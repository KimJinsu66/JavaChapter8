import java.io.*;
/**
 * 여기에 FileInputStreamEx 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class FileInputStreamEx
{
    public static void main(String[] args){
        InputStreamReader in = null;
        FileInputStream fin = null;
        try{
        fin = new FileInputStream("c:\\Temp\\hangul.txt");
        in = new InputStreamReader(fin,"MS949"); //올바른 문자 집합 지정
        int c;
        System.out.println("인코딩 문자 집합은" + in.getEncoding());
        while((c= in.read()) != -1){
            System.out.println((char)c);
        }
        in.close();
        fin.close();
    }catch(IOException e){
        System.out.println("입출력 오류 ");
    }
}

}
