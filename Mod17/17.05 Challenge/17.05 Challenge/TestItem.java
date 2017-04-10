
/**
 * TestItem contains an array of objects of type Item that gets sorted by multiple sort methods. 
 * The printInventory method prints the results of each sort.
 * 
 * @author Glen Halonen 
 * @version 04/05/17
 */
public class TestItem
{
    public static void main(String[] args)
    {
        Item[] hardware = new Item[6];
        
        hardware[0] = new Item("1011", "Air Filters",200, 10.5);
        hardware[1] = new Item("1034", "Door Knobs",60, 21.5);
        hardware[2] = new Item("1101", "Hammers", 90, 9.99);
        hardware[3] = new Item("1600", "Levels", 80, 19.99);
        hardware[4] = new Item("1500", "Ceiling Fans", 100, 59);
        hardware[5] = new Item("1201", "Wrench Sets", 55, 80);
        
        
        printInventory(sortID(hardware));
        System.out.println();
        printInventory(sortName(hardware));
        System.out.println();
        printInventory(sortInStore(hardware));
        System.out.println();
        sortPrice(hardware, 0, hardware.length - 1);
        printInventory(hardware);
    }
    
    public static void printInventory(Item[] hW)
    {
        for( Item h: hW)
        {
            h.toString();
        }
    }
    
    public static Item[] sortID(Item[] hW)
    {
       int i;
       int k;
       int posmax;
       Item temp;
       for( i = hW.length - 1; i >= 0; i--)
       {
           posmax = 0;
           for( k = 0; k <= i; k++)
           {
               if( hW[posmax].getItemID().compareTo(hW[k].getItemID()) < 0)
               {
                 posmax = k;  
               }
           }
           temp = hW[i];
           hW[i] = hW[posmax];
           hW[posmax] = temp;
       }
       return hW; 
    }
    
    public static Item[] sortName(Item[] hW)
    {
        Item[] dest = new Item[hW.length];
        for( int i = 0; i < hW.length; i++)
        {
            Item next = hW[i];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0)
            {
                if( next.getItemName().compareTo(dest[k - 1].getItemName()) > 0)
                {
                    insertIndex = k;
                }
                else
                {
                    dest[k] = dest[k-1];
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }
    
    //selection sort
    public static Item[] sortInStore(Item[] hW)
    {
        int i;
        int k;
        Item temp;
        for( i = hW.length - 1; i >= 0; i--)
        {
            int posmax = 0;
            for(k = 0; k <= i; k++)
            {
                if(hW[posmax].getInStore() - hW[k].getInStore() > 0)
                {
                    posmax = k;
                }
            }
            temp = hW[i];
            hW[i] = hW[posmax];
            hW[posmax] = temp;
        }
        return hW;
    }
    
    public static void sortPrice(Item[] hW, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        
        int mid = (low + high)/2;
        
        sortPrice(hW, low, mid);
        sortPrice(hW, mid + 1, high);
        
        merge(hW, low, mid, high);
    }
    
    public static void merge(Item[] hW, int low, int mid, int high)
    {
        Item[] temp = new Item[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = hW[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = hW[ i ];
                i++;
            }
            else if ( hW[ i ].getPrice() > hW[ j ].getPrice() )
            {
                temp[ n ] = hW[ i ];
                i++;
            }
            else
            {
                temp[ n ] = hW[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            hW[ k ] = temp[ k - low ];

    }
}
