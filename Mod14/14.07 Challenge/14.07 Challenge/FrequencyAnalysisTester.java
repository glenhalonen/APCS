
/**
 * Write a description of class FrequencyAnalysisTester here.
 * 
 * @author Glen Halonen 
 * @version 02/28/17
 */
import java.io.IOException;
public class FrequencyAnalysisTester
{
    public static void main(String[] args) throws IOException
    {
        FrequencyAnalysis.readTXT();
        FrequencyAnalysis.removeAndLower();
        FrequencyAnalysis.print();
    }
}
