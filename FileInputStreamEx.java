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
        byte b[] = new byte[6];
        
        try{
            FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
            int n = 0, c ;
            while((c = fin.read())!= -1){ // -1은 파일 끝 (EOF)
                b[n] = (byte)c; // 읽은 바이트를 배열에 저장
                n++;
            }
            // 배열 b[]의 바이트 값을 모두 화면에 출력
            System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다");
            for(int i= 0; i< b.length; i++)
                System.out.println(b[i] + " ");
            System.out.println();
            fin.close();
        }catch(IOException e){
            System.out.println("c:\\Temp\\test.out에서 읽지 못했습니다.");
            return;
        }
        
    }
}
