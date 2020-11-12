import org.junit.Test
import kotlin.test.assertEquals


class mainTest {

    @Test
    fun givenEmptyString_returnZero(){
        assertEquals(0, add(""));
    }
    @Test
    fun givenOneNumber_returnNumber(){
        assertEquals(1, add("1"));
    }
    @Test
    fun givenTwoNumbers_returnSum(){
        assertEquals(3, add("1,2"));
    }
    fun add(str:String): Int{
        if(str.isNullOrEmpty())
            return 0
        else if(str.length == 1 && str.toIntOrNull() != null)
            return str.toInt();
        else if(str.contains(",")){
            val nums : List<String> = str . split (",");
            return nums.map { s -> s.toInt() }.sum();
        }else
            return 1;
    }
}