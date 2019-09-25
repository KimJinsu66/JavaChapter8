import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * P447~P452
 * IOException : 입출력시에 지정한 파일이 시스템에 존재하지 않을 때
 * @author (작성자 이름) 
 * @version (2019.09.25 -> 수정)
 */
public class InputStreamEx
{
    public static void main(String[] args){
        InputStreamReader rd = new InputStreamReader(System.in);
        try{
            int c = rd.read();
            //System.out.println(c);
        }
        catch(IOException e){
            System.out.println("error");
        }

        try{
            FileReader fin = new FileReader("c:\\test.txt");
            int c= fin.read();
            fin.close();
        } catch(FileNotFoundException e){ 
            System.out.println("파일을 열수 없음");
        } catch(IOException e){
            System.out.println("error");
        }

    }
}
