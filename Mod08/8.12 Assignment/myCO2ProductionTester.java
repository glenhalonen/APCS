
/**
 * Find my carbon footprint in terms of pounds of CO2 emmitted.
 * 
 * @author Glen Halonen
 * @version Jan 3, 2017
 */
import java.util.ArrayList;
public class myCO2ProductionTester
{
    public static void main(String[] args)
    {
        ArrayList<myCO2Production> me = new ArrayList<myCO2Production>();
        //create objects
        me.add(new myCO2Production(1198, 322.34, 210.90/3501, 12, false, false, false, false, 0));
        me.add(new myCO2Production(1213, 300.98, 260.31/3217, 12, true, true, true, true, 36));
        me.add(new myCO2Production(3000, 351.09, 233.51/2701, 6, true, false, true, false, 20));
        me.add(new myCO2Production(2000, 333.33, 245.36/2738, 3, false, true, false, false, 30));
        me.add(new myCO2Production(1500, 378.45, 249.68/2948, 3, false, false, true, true, 10));
        
        //run methods
        for(myCO2Production dataRecord : me)
        {
            dataRecord.calcGasPounds();
            dataRecord.calcElecPounds();
            dataRecord.calcGrossWasteEmission();
            dataRecord.calcWasteReduction();
            dataRecord.calcNetWaste();
            dataRecord.calcElecReduction();
            dataRecord.calcNetElecPounds();
            dataRecord.calcTotalCO2();
        }
 
        System.out.println("|         Pounds of CO2             |      Pounds of CO2    |");
        System.out.println("|         Emmitted from             |      Reduced from     |");
        System.out.println("|   Gas    | Electricity  |  Waste  | Recycling | New Bulbs | CO2 Footprint |");   

        myCO2Production dataRecord;
        //for loop to print results
        for(int index = 0; index < me.size(); index++)
        {
            dataRecord = me.get(index);
            System.out.printf("| %7.2f |   %7.2f   | %7.2f | %9.2f | %9.1f | %13.2f | \n", dataRecord.getGasPounds(), dataRecord.getElecPounds(), dataRecord.getWasteEmissions(), dataRecord.getWasteReduction(), dataRecord.getElecReduction(), dataRecord.getTotalCO2());
        }
        
        
    }
}
