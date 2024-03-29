import java.io.*;
/**
 * 여기에 FileReaderEx 클래스 설명을 작성하십시오.
 * 
 * @author (김진수) 
 * @version (2019.09.26)
 */
public class FileReaderEx
{
    public static void main(String[] args){
        FileReader fin = null;
        try{
            fin = new FileReader("c:\\windows\\system.ini"); //문자 입력 스트림 생성 
            int c;
            while((c= fin.read()) != -1){ //한 문자씩 파일 끝까지 읽는다.
                System.out.print((char)c);
            }
            fin.close();
        }
        catch(IOException e){
            System.out.println("입출력 오류 ");
        }
    }
}
