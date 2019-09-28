import java.io.*;
/**
 * 여기에 FileOutputStreamEx 클래스 설명을 작성하십시오.
 * 
 * @author (김진수) 
 * @version (2019.09.28)
 */
public class FileOutputStreamEx
{
    public static void main(String[] args){
        byte b[] = {7,51,3,4,-1,24};
        
        try{
            FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
            for(int i =0; i < b.length; i++){
                fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
            }
            fout.close();
        }catch(IOException e){
            System.out.println("c:\\Temp\\test.out에 저장할 수 없었습니다.");
            return;
        }
        System.out.println("c:\\Temp\\test.out에 저장하였습니다.");
    }
}
