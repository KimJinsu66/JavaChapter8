import java.io.*;
/**
 * 여기에 TextCopyEX 클래스 설명을 작성하십시오.
 * 
 * @author (김진수) 
 * @version (2019.09.28)
 */
public class TextCopyEX
{
    public static void main(String[] args){
        File src = new File("c:\\windouws\\system.ini");// 원본 파일 경로명
        File dest = new File("c:\\Temp\\system.txt"); // 복사 파일 경로명
        int c;
        try{
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);
            while((c = fr.read()) != -1) { // 문자 하나 읽고
                fw.write((char)c); // 문자 하나 쓰고
            }

            fr.close(); 
            fw.close();
            System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
