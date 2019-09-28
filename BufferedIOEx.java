import java.io.*;
import java.util.Scanner;
/**
 * 여기에 BufferedIOEx 클래스 설명을 작성하십시오.
 * 
 * @author (김진수) 
 * @version (2019.09.28)
 */
public class BufferedIOEx
{
    public static void main(String[] args){
        FileReader fin = null;
        int c;
        try{
            fin = new FileReader("c:\\Temp\\test2.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out,5);
            while((c = fin.read()) != -1 ){// 파일 데이터를 모두 스크린에 출력
                out.write(c);
            }
            new Scanner(System.in).nextLine(); // <Enter>키 입력
            out.flush();
            fin.close();
            out.close();
            // 파일 데이터가 모두 출력된 상태 
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
