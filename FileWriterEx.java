import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * 여기에 FileWriterEx 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class FileWriterEx
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("c:\\Temp\\test.txt");//파일과 연결된 출력 문자 스트림 생성
            while(true) {
                String line = sc.nextLine();
                if(line.length() == 0) // 한 줄에 <Enter>키만 입력한 경우
                    break;
                fout.write(line,0,line.length());
                fout.write("\r\n",0,2);// 한줄 띄기 위해 \r\n을 파일에 저장
            }
            fout.close();
        }catch(IOException e) {
            System.out.println("입출력 오류");
        }sc.close();

    }
}
