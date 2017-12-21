import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SlowString
{
    public final String m_str;
    public SlowString( final String str ) {
        this.m_str = str;
    }
 
    @Override
    public int hashCode() {
        return 37;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final SlowString that = ( SlowString ) o;
        return !(m_str != null ? !m_str.equals(that.m_str) : that.m_str != null);
    }
}
public class Lab9 {
	private static void testMapSpeed( final List lst, final String name )
	{
	    final Map<Object, Object> map = new HashMap<Object, Object>( lst.size() );
	    int cnt = 0;
	    final long start = System.currentTimeMillis();
	    for ( final Object obj : lst )
	    {
	        map.put( obj, obj );
	        if ( map.containsKey( obj ) )
	            ++cnt;
	    }
	    final long time = System.currentTimeMillis() - start;
	    System.out.println( "Time for "  + name + " is " + time / 1000.0 + " sec, cnt = " + cnt );
	}
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();
		 for (int cnt = 0; cnt < 1000; cnt++) {
				list.add("cnt"+cnt);
			}
		testMapSpeed(list,"cnt508");
		 ArrayList<SlowString> list1 = new ArrayList<>();
		 for (int cnt = 0; cnt < 1000; cnt++) {
				list1.add(new SlowString("slw"+cnt));
			}
		testMapSpeed(list1,"slw509");

}
}
