package theadsummmary;

/**
 * Class: UnsafeSequence </br>
 * Description:  Unsafe count generate</br>
 * Creator: kevin </br>
 * Email: jiangtao103cp@gmail.com </br>
 * Date: 16-8-28 下午2:12 </br>
 * Update: 16-8-28 下午2:12 </br>
 */
public class UnsafeSequence {

  private int value;

  /**
   * step 1: read value
   * step 2: value++
   * step 3: write value
   * if thread one read value
   * and thread two read value yet
   * value = value+1 error
   * @return link Integer
   */
  public int getNext(){
    return value++;
  }
}
